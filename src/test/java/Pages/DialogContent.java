package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;


public class DialogContent extends ParentPage {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Women']")
    public WebElement women;

    @FindBy(xpath = "(//span[text()='Tops'])[1]/..")
    public WebElement topsWomen;

    @FindBy(xpath = "(//span[text()='Jackets'])[1]")
    public WebElement jacketsWomen;

    @FindBy(xpath = "(//span[text()='Hoodies & Sweatshirts'])[1]")
    public WebElement hoodiesSweatshirtsWomen;

    @FindBy(xpath = "(//span[text()='Tees'])[1]")
    public WebElement teesWomen;

    @FindBy(xpath = "(//span[text()='Bras & Tanks'])[1]")
    public WebElement BrasTanksWomen;

    @FindBy(xpath = "(//span[text()='Bottoms'])[1]")
    public WebElement BottomsWomen;


    @FindBy(xpath = "(//span[text()='Pants'])[1]")
    public WebElement pantsWomen;

    @FindBy(xpath = "(//span[text()='Shorts'])[1]")
    public WebElement shortsWomen;

    @FindBy(xpath = "//span[text()='Men']")
    public WebElement men;

    @FindBy(xpath = "(//span[text()='Tops'])[2]")
    public WebElement topsMen;

    @FindBy(xpath = "(//span[text()='Jackets'])[2]")
    public WebElement jacketsMen;

    @FindBy(xpath = "(//span[text()='Hoodies & Sweatshirts'])[2]")
    public WebElement hoodiesSweatshirtsMen;

    @FindBy(xpath = "(//span[text()='Tees'])[2]")
    public WebElement teesMen;

    @FindBy(xpath = "(//span[text()='Tanks'])[1]")
    public WebElement tanksMen;

    @FindBy(xpath = "(//span[text()='Bottoms'])[2]")
    public WebElement BottomsMen;


    @FindBy(xpath = "(//span[text()='Pants'])[2]")
    public WebElement pantsMen;

    @FindBy(xpath = "(//span[text()='Shorts'])[2]")
    public WebElement shortsMen;

    @FindBy(xpath = "(//span[text()='Tops'])[3]")
    public WebElement topsText;

    @FindBy(xpath = "(//span[text()='Bottoms'])[3]")
    public WebElement bottomsText;


    public WebElement getWebElement(String strElementName) {

        switch (strElementName.trim()) {
            case "women":
                return this.women;
            case "topsWomen":
                return this.topsWomen;
            case "jacketsWomen":
                return this.jacketsWomen;
            case "hoodiesSweatshirtsWomen":
                return this.hoodiesSweatshirtsWomen;
            case "teesWomen":
                return this.teesWomen;
            case "BrasTanksWomen":
                return this.BrasTanksWomen;
            case "pantsWomen":
                return this.pantsWomen;
            case "BottomsWomen":
                return this.BottomsWomen;
            case "shortsWomen":
                return this.shortsWomen;
            case "men":
                return this.men;
            case "topsMen":
                return this.topsMen;
            case "jacketsMen":
                return this.jacketsMen;
            case "hoodiesSweatshirtsMen":
                return this.hoodiesSweatshirtsMen;
            case "teesMen":
                return this.teesMen;
            case "tanksMen":
                return this.tanksMen;
            case "BottomsMen":
                return this.BottomsMen;
            case "pantsMen":
                return this.pantsMen;
            case "shortsMen":
                return this.shortsMen;
            case "topsText":
                return this.topsText;
            case "bottomsText":
                return this.bottomsText;


        }

        return null;
    }

    //2
    @FindBy(name = "login[username]")
    public WebElement emailBox;

    @FindBy(name = "login[password]")
    public WebElement passwordBox;

    @FindBy(xpath = "(//div[@class='primary']/button)[1]")
    public WebElement signInButton;

    @FindBy(xpath = "(//span[contains(text(),'Welcome')])[1]")
    public WebElement welcomeText;

    @FindBy(xpath = "your-xpath-here")
    public WebElement warningMessage;

    @FindBy(xpath = "//a[@class='action remind']/span")
    public WebElement forgotPasswordButton;

    @FindBy(xpath = "//h1[@class='page-title']/span")
    public WebElement forgetPasswordText;

    @FindBy(xpath = "//div[contains(text(),'Please enter your email address')]")
    public WebElement forgotPasswordConfirmText;

    //8
    @FindBy(xpath = "(//ul[@class='header links']//button)[1]")
    public WebElement dropDownMenuBtn;

    @FindBy(xpath = "(//ul[@class='header links']//a)[1]")
    public WebElement myAccountBtn;

    @FindBy(css = "li[class='product-item'] a[class='product-item-link']")
    public List<WebElement> products;

    @FindBy(css = "[class='product-item']")
    public WebElement product;

    @FindBy(css = "[class='product-item-link']")
    public WebElement wishListProduct;

    @FindBy(xpath = "//a[@class='action towishlist']")
    public List<WebElement> wishListBtn;

    @FindBy(linkText = "My Wish List")
    public WebElement myAccountWishListBtn;

    @FindBy(css = "[data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement wishListConfirmMessage;

    @FindBy(css = "a[title='Remove Item']")
    public WebElement deleteWishListBtn;

    @FindBy(xpath= "//span[text()=\"Shop Performance\"]")
    public WebElement shopPerformanceField;

    @FindBy(xpath= "//span[text()=\"Performance Fabrics\"]")
    public WebElement performanceFabricsPage;

    @FindBy(id= "mode-list")
    public WebElement listButton;

    @FindBy(xpath= "//li[@class=\"item product product-item\"][1]")
    public WebElement productItem1;

    @FindBy(xpath= "//ol[@class=\"products list items product-items\"]")
    public List<WebElement> productItem;

    @FindBy(xpath= "//span[text()='Add to Cart']")
    public List<WebElement> addToCartButtons;

    @FindBy(xpath= "//span[text()='Add to Cart']")
    public WebElement addToCartButton;

    @FindBy(xpath= "//*[@id=\"product-options-wrapper\"]/div/div/div[1]")
    public List<WebElement> sizeOptions;

    @FindBy(xpath= "//*[@id=\"option-label-size-143-item-171\"]")
    public WebElement sizeOption;

    @FindBy(xpath= "//*[@id=\"product-options-wrapper\"]/div/div/div[2]")
    public List<WebElement> colorOptions;

    @FindBy(xpath= "//*[@id=\"option-label-color-93-item-50\"]")
    public WebElement colorOption;

    @FindBy(id= "qty")
    public WebElement quantityNumber;

    @FindBy(xpath= "//a[@class=\"action showcart\"]")
    public WebElement showcart;

    @FindBy(xpath= "//div[@class=\"product-item-details\"]")
    public WebElement productItemDetail;

    @FindBy(xpath= "//a[@class=\"action delete\"]")
    public WebElement deleteButton;

    @FindBy(xpath= "//button[@class=\"action-primary action-accept\"]")
    public WebElement acceptButton;

    @FindBy(xpath= "//strong[@class=\"subtitle empty\"]")
    public WebElement warningEmptyCartText;

    @FindBy(xpath= "//a[@class=\"action edit\"]")
    public WebElement editButton;

    @FindBy(xpath= "//span[text()=\"Update Cart\"]")
    public WebElement updateButton;

    @FindBy(xpath= "//div[@role=\"alert\"]")
    public WebElement alertMessage;

    public WebElement getWebElementt(String strWebElement) {
        switch (strWebElement) {
            case "myAccountButton":
                return this.myAccountBtn;
            case "wishListButton":
                return this.myAccountWishListBtn;
            case "dropDownMenu":
                return this.dropDownMenuBtn;
            case "removeFavoritesButton":
                return this.deleteWishListBtn;
            default:
                System.out.println("Geçersiz anahtar: " + strWebElement);
                return null;
        }
    }

    public void selectProductByIndex(int index) {
        if (index >= 0 && index < products.size()) {
            products.get(index).click();
        } else {
            System.out.println("Geçersiz index: " + index);
        }
    }
}
