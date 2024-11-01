package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.*;
import Pages.DialogContent;
import Pages.LeftNav;

public class _02_Login {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @Given("The user navigates to the Magento website")
    public void theUserNavigatesToTheMagentoWebsite() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @When("The user clicks on the Sign in Link")
    public void theUserClicksOnTheSignInLink() {
        ln.signInLink.click();
    }

    @Then("The user types username and password with valid credentials")
    public void theUserTypesUsernameAndPasswordWithValidCredentials() {
        dc.emailBox.sendKeys("f89721136@gmail.com");
        dc.passwordBox.sendKeys("kahveHan345");
    }

    @Then("The user clicks on the Sign in button")
    public void theUserClicksOnTheSignInButton() {
        dc.signInButton.click();
    }

    @Then("The user verifies logged in successfully")
    public void theUserVerifiesLoggedInSuccessfully() {
        org.testng.Assert.assertTrue(dc.welcomeText.isDisplayed());
    }

    @Then("The user types the email and password with invalid credentials")
    public void theUserTypesTheEmailAndPasswordWithInvalidCredentials() {
        dc.emailBox.sendKeys("f89721136@gmail.com");
        dc.passwordBox.sendKeys("kahveHan3456");
    }

    @Then("The user verifies the warning message")
    public void theUserVerifiesTheWarningMessage() {
        org.testng.Assert.assertTrue(dc.warningMessage.isDisplayed());
    }

    @And("The user clicks on the Forgot Password button")
    public void theUserClicksOnTheForgotPasswordButton() {
        dc.forgotPasswordButton.click();
    }

    @Then("The user is redirected to the password reset page")
    public void theUserIsRedirectedToThePasswordResetPage() {
        org.testng.Assert.assertTrue(dc.forgetPasswordText.isDisplayed());
    }

    @Then("The user sees the forgot password confirmation message")
    public void theUserSeesTheForgotPasswordConfirmationMessage() {
        org.testng.Assert.assertTrue(dc.forgotPasswordConfirmText.isDisplayed());
    }
}
