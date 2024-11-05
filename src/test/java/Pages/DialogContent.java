package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    //6
    @FindBy(xpath = "((//ul[@class='header links'])[1]//a)[2]")
    public WebElement signIn;

    @FindBy(id = "email")
    public WebElement email;
//
//    @FindBy(id = "pass")
//    public WebElement password;
//
//    @FindBy(xpath = "(//button[@name='send'])[1]")
//    public WebElement signInButton;

    @FindBy(xpath = "(//li[@class='greet welcome']/span)[1]")
    public WebElement loginConfirmation;

    @FindBy(xpath = "(//button[@class='action switch'])[1]")
    public WebElement customerMenuDropDown;

//    @FindBy(xpath = "((//div[@data-target='dropdown'])[1]//a)[3]")
//    public WebElement signOut;

    @FindBy(id = "email-error")
    public WebElement emailErrorText;

    @FindBy(xpath = "(//div[@role='alert']//div)[2]")
    public WebElement passwordErrorText;

    @FindBy(css = "[class='action remind']")
    public WebElement forgetPasswordButton;

//    @FindBy(css = "[data-ui-id='page-title-wrapper']")
//    public WebElement forgetPasswordText;

    @FindBy(xpath = "(//a[text()='My Account'])[1]")
    public WebElement myAccountButton;

    @FindBy(xpath = "//span[text()='Manage Addresses']")
    public WebElement manageAddressesButton;

    @FindBy(xpath = "//span[text()='Add New Address']")
    public WebElement addNewAddressButton;

    @FindBy(xpath = "//input[@id='telephone']")
    public WebElement telephoneInput;

    @FindBy(xpath = "//input[@id='street_1']")
    public WebElement street1Input;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement cityInput;

    @FindBy(xpath = "//select[@id='region_id']")
    public WebElement regionIdInput;

    @FindBy(xpath = "//input[@id='zip']")
    public WebElement zipInput;

    @FindBy(xpath = "//span[text()='Save Address']")
    public WebElement saveAddressButton;

    @FindBy(xpath = "//input[@id='primary_billing']")
    public WebElement defaultBilling;

    @FindBy(xpath = "//input[@id='primary_shipping']")
    public WebElement defaultShipping;

//    @FindBy(xpath = "//span[text()='Delete']")
//    public WebElement deleteButton;

    @FindBy(xpath = "//span[text()='OK']")
    public WebElement deleteOk;

    @FindBy(css = "[data-bind*='message.text']")
    public WebElement messageText;

    @FindBy(xpath= "//ol[@class='product-items widget-product-grid']//img[@class='product-image-photo']")
    public WebElement arcProduct1;

    @FindBy(xpath= "(//ol[@class='product-items widget-product-grid']//img[@class='product-image-photo'])[2]")
    public WebElement arcProduct2;

    @FindBy(css= "[title='Add to Cart']")
    public WebElement arcAdd;

    @FindBy(css = "[class='swatch-option text']")
    public WebElement arcSize;

    @FindBy(css = "[class='swatch-option color']")
    public WebElement arcColor;

    @FindBy(css = "[id='qty']")
    public WebElement arcQty;

    @FindBy(css = "[data-bind*='message.text']")
    public WebElement arcVerify;

    @FindBy(css = "[class='action showcart']")
    public WebElement arcShowCart;

    @FindBy(css = "[class='action viewcart']")
    public WebElement arcEditCart;

    @FindBy(xpath = "//a[text()='shopping cart']")
    public WebElement arcGoToCart;

    @FindBy(css = "[class='action action-delete']")
    public WebElement arcDelete;

    @FindBy(css = "[title='Qty']")
    public WebElement arcCartQty;

    @FindBy(css = "[class='action update']")
    public WebElement arcUpdate;

    @FindBy(css = "[id='top-cart-btn-checkout']")
    public WebElement arcStale;

    @FindBy(css = "[class='cart-empty']")
    public WebElement arcCartEmpty;

    @FindBy(xpath = "//span[text()='See Details']")
    public List<WebElement> arcCount;

    @FindBy(css = "[aria-label='store logo']")
    public WebElement homePage;

    @FindBy(xpath = "(//img[@class='product-image-photo'])[5]")
    public WebElement fusionBackpack;

    @FindBy(xpath = "(//button[@title='Add to Cart'])[5]")
    public WebElement addToCart;

    @FindBy(css = "[class='counter-number']")
    public WebElement counterNumber;

    @FindBy(css = "[class='action showcart']")
    public WebElement basket;

    @FindBy(css = "[id='top-cart-btn-checkout']")
    public WebElement proceedToCheckout;

    @FindBy(css = "[type='radio']")
    public  WebElement shippingMethods;

    @FindBy(css = "[data-role='opc-continue']")
    public WebElement nextButton;

    @FindBy(css = "[class='action primary checkout']")
    public WebElement placeOrder;

//    @FindBy(xpath = "//ul[@class='header links']/li/a[text()='Create an Account']")
//    public WebElement createAccount;
//
//    @FindBy(id = "firstname")
//    public WebElement firstName;
//
//    @FindBy(id = "lastname")
//    public WebElement lastName;
//
//    @FindBy(id = "email_address")
//    public WebElement emailAddress;

    @FindBy(id = "password")
    public WebElement registrationPassword;

//    @FindBy(id = "password-confirmation")
//    public WebElement passwordConfirmation;

    @FindBy(xpath = "//*[@id='form-validate']/div/div[1]/button/span")
    public WebElement registerButton;

    @FindBy(id = "search")
    public WebElement searchInput;

    @FindBy(css = "[title='Search']")
    public WebElement searchButton;

    @FindBy(css = "[class='page-title'] span")
    public WebElement skuNumberText1;

    @FindBy(xpath = "//span[text()='Men']")
    public WebElement Man;

    @FindBy(xpath = "(//span[text()='Tops'])[2]")
    public WebElement tops;

    @FindBy(xpath = "(//span[text()='Jackets'])[2]")
    public WebElement jacketsButton;

    @FindBy(css = "[alt='Lando Gym Jacket']")
    public WebElement landoGmyJacketImg;

    @FindBy(css = "[itemprop='sku']")
    public WebElement skuNumberText2;

    @FindBy(xpath = "//a[@class='action towishlist' and @data-action='add-to-wishlist']")
    public WebElement wishAddButton;

    @FindBy(xpath = "//*[@id='wishlist-view-form']/div[1]")
    public WebElement wishListNotEmpty;
//
//    @FindBy(xpath = "//img[@class='product-image-photo' and @alt='Radiant Tee']")
//    public WebElement wishListProduct;

    @FindBy(css = "a[title='Remove Item']")
    public WebElement wishRemoveButton;

    @FindBy(xpath = "//span[text()='What's New']")
    public WebElement whatsNew;

    @FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/' and @title='Go to Home Page']")
    public WebElement homeButton;

//    @FindBy(xpath = "//span[text()='Women']") // Women
//    public WebElement women;
//
//    @FindBy(xpath = "//span[text()='Men']") // Men
//    public WebElement men;

    @FindBy(xpath = "//span[text()='Gear']") // Gear
    public WebElement gear;

    @FindBy(xpath = "//span[text()='Training']")
    public WebElement training;

    @FindBy(xpath = "//span[text()='Sale']")
    public WebElement sale;

    @FindBy(xpath = "(//span[text()='Tops'])[1]")
    public WebElement womenTops;

    @FindBy(xpath = "(//span[text()='Bottoms'])[1]")
    public WebElement womenBottoms;

    @FindBy(xpath = "(//span[text()='Tops'])[2]")
    public WebElement menTops;

    @FindBy(xpath = "(//span[text()='Bottoms'])[2]")
    public WebElement menBottoms;

    public WebElement getWebElement6(String strElementName) {
        switch (strElementName.trim()){
            case "signIn": return this.signIn;
            case "email": return this.email;
            case "signInButton": return this.signInButton;
            case "loginConfirmation": return this.loginConfirmation;
            case "customerMenuDropDown": return this.customerMenuDropDown;
            case "forgetPasswordButton": return this.forgetPasswordButton;
            case "myAccountButton":return this.myAccountButton;
            case "manageAddressesButton": return this.manageAddressesButton;
            case "addNewAddressButton": return this.addNewAddressButton;
            case "telephoneInput": return this.telephoneInput;
            case "street1Input": return this.street1Input;
            case "cityInput": return this.cityInput;
            case "regionIdInput": return this.regionIdInput;
            case "zipInput": return this.zipInput;
            case "saveAddressButton": return this.saveAddressButton;
            case "defaultBilling": return this.defaultBilling;
            case "defaultShipping": return this.defaultShipping;
            case "deleteOk": return this.deleteOk;
            case "messageText": return this.messageText;
            case "homePage": return this.homePage;
            case "arcProduct1": return this.arcProduct1;
            case "arcProduct2": return this.arcProduct2;
            case "arcAdd": return this.arcAdd;
            case "arcSize": return this.arcSize;
            case "arcColor": return this.arcColor;
            case "arcQty": return this.arcQty;
            case "arcShowCart": return this.arcShowCart;
            case "arcEditCart": return this.arcEditCart;
            case "arcDelete": return this.arcDelete;
            case "arcCartQty": return this.arcCartQty;
            case "arcUpdate": return this.arcUpdate;
            case "arcGoToCart": return this.arcGoToCart;
            case "fusionBackpack": return this.fusionBackpack;
            case "addToCart": return this.addToCart;
            case "basket": return this.basket;
            case "proceedToCheckout": return this.proceedToCheckout;
            case "shippingMethods": return this.shippingMethods;
            case "nextButton": return this.nextButton;
            case "placeOrder": return this.placeOrder;
            case "registrationPassword": return this.registrationPassword;
            case "registerButton": return this.registerButton;
            case "searchInput": return this.searchInput;
            case "searchButton": return this.searchButton;
            case "Man": return this.Man;
            case "tops": return this.tops;
            case "jacketsButton": return this.jacketsButton;
            case "landoGmyJacketImg": return this.landoGmyJacketImg;
            case "wishAddButton": return this.wishAddButton;
            case "wishListNotEmpty": return this.wishListNotEmpty;
            case "wishListProduct": return this.wishListProduct;
            case "wishRemoveButton": return this.wishRemoveButton;
            case "whatsNew": return this.whatsNew;
            case "women": return this.women;
            case "men": return this.men;
            case "gear": return this.gear;
            case "training": return this.training;
            case "sale": return this.sale;
            case "womenTops": return this.womenTops;
            case "womenBottoms": return this.womenBottoms;
            case "homeButton": return this.homeButton;
            case "menTops": return this.menTops;
            case "menBottoms": return this.menBottoms;


        }
        return null;
    }
}
