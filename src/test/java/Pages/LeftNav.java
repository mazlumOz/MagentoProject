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

    @FindBy(xpath = "(//ul[@class='nav items']//a)[1]")
    public WebElement myOrders;

    @FindBy(xpath = "(//ul[@class='nav items']//a)[2]")
    public WebElement myDownloadableProducts;

    @FindBy(xpath = "(//ul[@class='nav items']//a)[3]")
    public WebElement myWishList;

    @FindBy(xpath = "(//ul[@class='nav items']//a)[4]")
    public WebElement addressBook;

    @FindBy(xpath = "(//ul[@class='nav items']//a)[5]")
    public WebElement accountInformation;

    @FindBy(xpath = "(//ul[@class='nav items']//a)[6]")
    public WebElement storedPaymentMethods;

    @FindBy(xpath = "(//ul[@class='nav items']//a)[7]")
    public WebElement myProductReviews;

    public WebElement getWebElement(String strElementName) {

        switch (strElementName.trim()) {
            case "myOrders":return this.myOrders;
            case "myDownloadableProducts":return this.myDownloadableProducts;
            case "myWishList":return this.myWishList;
            case "addressBook":return this.addressBook;
            case "accountInformation":return this.accountInformation;
            case "storedPaymentMethods":return this.storedPaymentMethods;
            case "myProductReviews":return this.myProductReviews;
        }
        return null;
    }



}
