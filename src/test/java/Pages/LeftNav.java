package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage{

    public LeftNav() {PageFactory.initElements(GWD.getDriver(), this); }

    @FindBy(linkText = "Sign In")
    public WebElement signInLink;

    @FindBy(xpath = "//span[text()='Customer Login']")
    public WebElement customerLogin;

}
