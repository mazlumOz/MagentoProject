package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class _04_TABMenu {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    @When("The user clicks on the categories in the TAB menu.")
    public void theUserClicksOnTheCategoriesInTheTABMenu(DataTable dtButtons) {
        List<String> listButoons=dtButtons.asList();


            for (int i = 0; i < listButoons.size(); i++) {
                dc.HoverOver(dc.getWebElement(listButoons.get(i)));
            }


    }

    @Then("It will see the Tops and Bottoms subcategories open.")
    public void itWillSeeTheTopsAndBottomsSubcategoriesOpen(DataTable dtButtons) {
        List<String> listButtons=dtButtons.asList();

        for (int i = 0; i < listButtons.size(); i++) {
            dc.HoverOver(dc.getWebElement(listButtons.get(i)));
        }

    }

    @And("The user clicks on the Tops subcategory.")
    public void theUserClicksOnTheTopsSubcategory(DataTable dtButtons) {
        List<String> listButtons=dtButtons.asList();

        for (int i = 0; i < listButtons.size(); i++) {
            dc.HoverOver(dc.getWebElement(listButtons.get(i)));
            dc.myJsClick(dc.getWebElement(listButtons.get(i)));

        }


    }

    @And("Validates the page containing {string} products belonging to the {string} subcategory")
    public void validatesThePageContainingProductsBelongingToTheSubcategory(String element,String str) {


            dc.LoginContainsText(dc.getWebElement(element),str);


    }

    @And("User clicks on the back button")
    public void userClicksOnTheBackButton() {
        GWD.getDriver().navigate().back();
    }

    @Given("login to magento")
    public void loginToMagento() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");

    }
}
