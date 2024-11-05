package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _07_SearchFunctionality {
    DialogContent dc=new DialogContent();
    @When("Send to product code to search area and search it")
    public void sendToProductCodeToSearchAreaAndSearchIt() {
        dc.myClick(dc.searchField);
        dc.mySendKeys(dc.searchField,"MJ03");
        dc.myClick(dc.selectedSearchOption);
    }

    @Then("User should be checked that product is on the result page list")
    public void userShouldBeCheckedThatProductIsOnTheResultPageList() {
        dc.myClick(dc.listButton);
        dc.myClick(dc.learnMoreButton);
        Assert.assertTrue(dc.skuCodeText.isDisplayed());
    }

    @When("Send to invalid product code to search area and search it")
    public void sendToInvalidProductCodeToSearchAreaAndSearchIt() {
        dc.myClick(dc.searchField);
        dc.mySendKeys(dc.searchField,"MK03");
        dc.myClick(dc.searchButton);
    }

    @Then("User should be checked that received the error message")
    public void userShouldBeCheckedThatReceivedTheErrorMessage() {
        Assert.assertTrue(dc.errorMessage.getText().contains("Your search returned no results."));

    }
}
