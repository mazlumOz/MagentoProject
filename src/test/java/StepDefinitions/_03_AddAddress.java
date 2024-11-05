package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.time.Instant;
import java.util.List;

public class _03_AddAddress {

    DialogContent dc = new DialogContent();

    @Given("Navigate to Magento")
    public void navigateToMagento() {

        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @When("Click to Sign in Button")
    public void clickToSignInButton() {

        dc.myClick(dc.signInButton1);
        dc.mySendKeys(dc.emailBox, "mevahap@hotmail.com");
        dc.mySendKeys(dc.passwordBox, "1Bilgisayar.");
        dc.myClick(dc.signInButton2);

    }

    @Then("Click on the My Account section")
    public void clickOnTheMyAccountSection() {

        dc.myClick(dc.selectMenu);
        dc.myClick(dc.myAccountButton);

    }

    @And("Click on Manage Address Button")
    public void ClickonManageAddressButton() {

        dc.myClick(dc.manageAddressButton);

    }

    @And("User click on DialogButton")
    public void userClickOnDialogButton(DataTable dtButtons) {
        List<String> listButton = dtButtons.asList();
        for (int i = 0; i < listButton.size(); i++) {
            dc.myClick(dc.getWebbElement(listButton.get(i)));

        }
    }

    @And("User send keys in Dialog")
    public void userSendKeysInDialog(DataTable dtKutuVeYazilar) {
        List<List<String>> listKutuVeYazilar = dtKutuVeYazilar.asLists();
        for (int i = 0; i < listKutuVeYazilar.size(); i++) {
            WebElement kutu = (dc.getWebbElement(listKutuVeYazilar.get(i).get(0)));
            dc.mySendKeys(kutu, listKutuVeYazilar.get(i).get(1));
        }
    }

    @And("User select state")
    public void userSelectState() {

        Select select = new Select(dc.Statee);
        select.selectByValue("1");

    }

    @Then("Click to Save Address Button")
    public void clickToSaveAddressButton() {

        dc.myClick(dc.saveAddressButton);

    }
}