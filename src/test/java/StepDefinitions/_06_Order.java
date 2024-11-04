package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;


public class _06_Order {
    DialogContent dc = new DialogContent();
    Actions actions = new Actions(GWD.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));

    @And("Shopping transaction in Dialog")
    public void shoppingTransactionInDialog() {
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", dc.fusionBackpack);
        actions.moveToElement(dc.fusionBackpack).build().perform();
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", dc.addToCart);
        wait.until(ExpectedConditions.visibilityOf(dc.addToCart));
        js.executeScript("arguments[0].click();", dc.addToCart);
        wait.until(ExpectedConditions.visibilityOf(dc.counterNumber));
        wait.until(ExpectedConditions.elementToBeClickable(dc.basket));
        js.executeScript("arguments[0].click();", dc.basket);

        wait.until(ExpectedConditions.visibilityOf(dc.proceedToCheckout));
        dc.myClick(dc.proceedToCheckout);
    }

    @Then("Purchase Success Message Should Appear")
    public void purchaseSuccessMessageShouldAppear() {
        wait.until(ExpectedConditions.visibilityOf(dc.placeOrder));
        js.executeScript("arguments[0].click();", dc.placeOrder);
        wait.until(ExpectedConditions.urlContains("success"));
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().toLowerCase().contains("success".toLowerCase()));

    }

    @Given("Navigate to magento website")
    public void navigateToMagentoWebsite() {
    }

    @And("Click on the Element in Dialog")
    public void clickOnTheElementInDialog() {
    }

    @And("User send keys in Dialog")
    public void userSendKeysInDialog() {
    }

    @Then("Login Success Message Should Appear")
    public void loginSuccessMessageShouldAppear() {
    }

}
