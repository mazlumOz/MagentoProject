package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends ParentPage{

    public DialogContent() {PageFactory.initElements(GWD.getDriver(), this); }

    @FindBy(xpath = "//span[text()='Women']")
    public WebElement women;

    @FindBy(xpath = "(//span[text()='Tops'])[1]")
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

    @FindBy(xpath = "(//span[text()='Tops'])[1]")
    public WebElement topsMen;

    @FindBy(xpath = "(//span[text()='Jackets'])[1]")
    public WebElement jacketsMen;

    @FindBy(xpath = "(//span[text()='Hoodies & Sweatshirts'])[1]")
    public WebElement hoodiesSweatshirtsMen;

    @FindBy(xpath = "(//span[text()='Tees'])[1]")
    public WebElement teesMen;

    @FindBy(xpath = "(//span[text()='Bras & Tanks'])[1]")
    public WebElement BrasTanksMen;

    @FindBy(xpath = "(//span[text()='Bottoms'])[1]")
    public WebElement BottomsMen;


    @FindBy(xpath = "(//span[text()='Pants'])[1]")
    public WebElement pantsMen;

    @FindBy(xpath = "(//span[text()='Shorts'])[1]")
    public WebElement shortsMen;

    @FindBy(xpath = "(//ol[@class='items'])[1]")
    public WebElement topsText;

    @FindBy(xpath = "//div[text()='Category']")
    public WebElement categoryClick;



    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {
            case "women" : return this.women;
            case "topsWomen" : return this.topsWomen;
            case "jacketsWomen" : return this.jacketsWomen;
            case "hoodiesSweatshirtsWomen" : return this.hoodiesSweatshirtsWomen;
            case "teesWomen" : return this.teesWomen;
            case "BrasTanksWomen" : return this.BrasTanksWomen;
            case "pantsWomen" : return this.pantsWomen;
            case "BottomsWomen" : return this.BottomsWomen;
            case "shortsWomen" : return this.shortsWomen;
            case "men" : return this.men;
            case "topsMen" : return this.topsMen;
            case "jacketsMen" : return this.jacketsMen;
            case "hoodiesSweatshirtsMen" : return this.hoodiesSweatshirtsMen;
            case "teesMen" : return this.teesMen;
            case "BrasTanksMen" : return this.BrasTanksMen;
            case "BottomsMen" : return this.BottomsMen;
            case "pantsMen" : return this.pantsMen;
            case "shortsMen" : return this.shortsMen;
            case "topsText" : return this.shortsMen;
            case "categoryClick" : return this.shortsMen;


        }

        return null;
    }



}
