package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.ParentPage;
import Utilities.GWD;
import com.google.gson.annotations.Until;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class _03_AddToCart {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    private WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @When("Scroll to shop performance field and click to shop performance button")
    public void scrollToShopPerformanceFieldAndClickToShopPerformanceButton() {
        dc.js.executeScript("arguments[0].click();",dc.shopPerformanceField);
    }

    @Then("User should be redirected to performance fabric page successfully")
    public void userShouldBeRedirectedToPerformanceFabricPageSuccessfully() {
        dc.LoginContainsText(dc.performanceFabricsPage,"Performance Fabrics");
    }

    @And("Click the list mode button")
    public void clickTheListModeButton() {
        dc.myClick(dc.listButton);
    }

    @And("Adds a randomly selected product to the cart")
    public void addsARandomlySelectedProductToTheCart() {
        dc.scrolltoElement(dc.productItem1);
        int previousSelection = -1;
        int chooseRandom;
        do {
            chooseRandom = ParentPage.randomGenerator(dc.productItem.size());
        } while (chooseRandom == previousSelection);
        previousSelection = chooseRandom;
        dc.actionHover(dc.productItem.get(chooseRandom));
        dc.myClick(dc.addToCartButtons.get(chooseRandom));
        dc.myClick(dc.addToCartButton);
    }

    @And("Chooses size, color and Qty options for product and click add to cart button")
    public void choosesSizeColorAndQtyOptionsForProductAndClickAddToCartButton() {
        if (selectRandomOption(dc.sizeOptions)) {
            dc.myClick(dc.sizeOption);
        } else {
            System.out.println("Uyarı: Beden seçenekleri bulunamadı veya görünür değil!");
        }
        int randomIndex1 = ParentPage.randomGenerator(dc.colorOptions.size());
        dc.myClick(dc.colorOptions.get(randomIndex1));
        dc.myClick(dc.colorOption);
        dc.mySendKeys(dc.quantityNumber,"2");
        dc.myClick(dc.addToCartButton);
    }

    private boolean selectRandomOption(List<WebElement> options) {
        try {
            wait.until(ExpectedConditions.visibilityOfAllElements(options));
            if (options.isEmpty()) {
                return false;
            }
            int randomIndex = ParentPage.randomGenerator(options.size());
            dc.myClick(dc.sizeOptions.get(randomIndex));
            return true;
        } catch (Exception e) {
            System.out.println("Uyarı: Seçenekler görünür hale getirilemedi.");
            return false;
        }
    }

    @Then("User should be checked that the product is added to the cart")
    public void userShouldBeCheckedThatTheCorrectProductIsAddedToTheCart() {
        dc.myClick(dc.showcart);
        wait.until((ExpectedConditions.visibilityOfAllElements(dc.productItemDetail)));
    }

    @And("Click the delete button")
    public void clickTheDeleteButton() {
        dc.scrolltoElement(dc.showcart);
        dc.myClick(dc.showcart);
        dc.myClick(dc.deleteButton);
        dc.myClick(dc.acceptButton);
    }

    @Then("User should be checked that the cart is empty")
    public void userShouldBeCheckedThatTheCartIsEmpty() {
        wait.until(ExpectedConditions.textToBePresentInElement(dc.warningEmptyCartText,"You have no items in your shopping cart."));
    }

    @And("Edit to cart")
    public void editToCart() {
        dc.scrolltoElement(dc.showcart);
        dc.myClick(dc.showcart);
        dc.myClick(dc.editButton);
        dc.myClear(dc.quantityNumber);
        dc.mySendKeys(dc.quantityNumber,"3");
        dc.myClick(dc.updateButton);
    }

    @Then("User should be checked that the cart is updated")
    public void userShouldBeCheckedThatTheCartIsUpdated() {
        Assert.assertTrue(dc.alertMessage.isDisplayed());
    }
}