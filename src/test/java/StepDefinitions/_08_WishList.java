package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.testng.Assert;
import java.util.List;

public class _08_WishList {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @Given("the user navigates to the Magento website")
    public void theUserNavigatesToMagentoWebsite() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @When("the user clicks on the Sign in Link")
    public void theUserClicksOnTheSignInLink() {
        ln.signInLink.click();
    }

    @Then("the user types username and password with valid credentials")
    public void theUserTypesUsernameAndPasswordWithValidCredentials() {
        dc.emailBox.sendKeys("f89721136@gmail.com");
        dc.passwordBox.sendKeys("kahveHan345");
    }


    @And("the user clicks on the Sign in button")
    public void theUserClicksOnSignInButton() {
        dc.signInButton.click();
    }


    @Then("the user verifies logged in successfully")
    public void theUserVerifiesLoggedInSuccessfully() {
        org.testng.Assert.assertTrue(dc.welcomeText.isDisplayed());
    }

    @When("The user goes to the product they want to add to their favorites")
    public void theUserGoesToProductPage() {
        dc.selectProductByIndex(1);
    }

    @And("The user clicks on the Add to Favorites button")
    public void theUserClicksAddToFavoritesButton() {
        dc.wishListBtn.get(0).click();
    }

    @And("The user confirms they added the product to favorites")
    public void theUserConfirmsProductAddedToFavorites() {
        Assert.assertTrue(dc.wishListConfirmMessage.isDisplayed());
    }

    @And("The user clicks on the Dropdown Menu and My Account button")
    public void theUserClicksOnDropDownMenuAndMyAccountButton(DataTable elements) {
        List<String> elementList = elements.asList();
        for (String element : elementList) {
            dc.getWebElementt(element).click();
        }
    }

    @When("The user clicks on the My Wish List button")
    public void theUserClicksOnMyWishListButton(DataTable elements) {
        List<String> elementList = elements.asList();
        for (String element : elementList) {
            dc.getWebElementt(element).click();
        }
    }

    @Then("The user verifies the product in their favorites list")
    public void theUserVerifiesProductInFavorites() {
        Assert.assertTrue(dc.wishListProduct.isDisplayed());
    }

    @When("The user hovers over the product and displays the remove from favorites icon")
    public void theUserHoversOverProductAndDisplaysRemoveIcon() {

        dc.HoverOver(dc.product);
        Assert.assertTrue(dc.deleteWishListBtn.isDisplayed());
    }

    @Then("The user clicks the Remove from Favorites button")
    public void theUserClicksRemoveFromFavoritesButton(DataTable elements) {
        List<String> elementList = elements.asList();
        for (String element : elementList) {
            dc.getWebElementt(element).click();
        }
    }

    @And("The user confirms the product is removed from favorites")
    public void theUserConfirmsProductRemovedFromFavorites() {
        Assert.assertFalse(dc.wishListProduct.isDisplayed());
    }
}


