package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonPage extends MainPage{
    public RadioButtonPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//label[@for='yesRadio']")
    private WebElement radioBtnYes;
    @FindBy(xpath = ".//label[text()='Impressive']/parent::div")
    private WebElement radioBtnImpressive;
    @FindBy(xpath = ".//p[@class='mt-3']/span")
    private WebElement resultSelected;
    @FindBy(xpath = ".//div[@class='main-header' and text()='Radio Button']")
    private  WebElement namePage;
    @FindBy(xpath = ".//ul/li/span[text()='Radio Button']/parent::li")
    private WebElement menuItemInDropdownRadioBtn;

    @Override
    String getUrl() {
        return "/radio-button";
    }

    public RadioButtonPage checkRadioButtonPageNameIsDisplayed(){
        checkIsElementDisplayed("Name page is not displayed", namePage);
        return this;
    }
    public RadioButtonPage checkRadioButtonPageIsDisplayed(){
        checkUrl();
        checkRadioButtonPageNameIsDisplayed();
        return this;
    }
    public RadioButtonPage clickToMenuInDropdownRadioBtn(){
        clickOnElement(menuItemInDropdownRadioBtn);
        return this;
    }
    public RadioButtonPage clickToYesRadioBtn(){
        clickOnElement(radioBtnYes);
        return this;
    }
    public RadioButtonPage clickToimpressiveRadioBtn(){
        clickOnElement(radioBtnImpressive);
        return this;
    }
    public void checkIsClickToRadioBtn(){
        try {
            String yes = radioBtnYes.getText();
            String result = resultSelected.getText();
            if (result.equals(yes)) {
                logger.info("Element Yes is displayed");
            }
            else {Assert.fail("Element Yes is not displayed");}

        }catch (Exception e){
            logger.info("Element is notdisplayed" + e);
            Assert.fail("Can not work with element" + e);
        }
    }
}
