package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.time.Instant;
import java.util.List;
import java.util.Map;

public class _01_Registration {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();

    @Given("Navigate to Magento website")
    public void navigateToMagentoWebsite(){
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }
    @When("The user clicks on create an account button")
    public void theUserClicksOnCreateAnAccountButton() {
    dc.myClick(dc.createAccount);
}


    @And("User enters required information")
    public void userEntersRequiredInformation(DataTable dataTable) {
        List<List<String>> requiredInformation=dataTable.asLists();
        for (int i = 0; i < requiredInformation.size(); i++) {
            WebElement box=dc.getWebElement(requiredInformation.get(i).get(0));
            dc.mySendKeys(box,requiredInformation.get(i).get(1));


        }


    }


    @And("User see thanks massage")
    public void userSeeThanksMassage() {
        Assert.assertTrue(dc.thankYouMassage.getText().toLowerCase().contains("thank you for registering"));
        dc.myClick(dc.customerMenuDD);
        dc.myClick(dc.signOut);


    }

    @And("User clicks on the sign up button")
    public void userClicksOnTheSignUpButton() {
        dc.myClick(dc.createAccountButton);
    }
}
