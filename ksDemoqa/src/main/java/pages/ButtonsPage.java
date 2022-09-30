package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends MainPage{

    public ButtonsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//ul/li/span[text()='Buttons']/parent::li")
    private WebElement menuItemInDropdownButtons;
    @FindBy(xpath = ".//div[@class=\"main-header\" and text()='Buttons']")
    private WebElement namePageButtons;
    @FindBy(xpath = ".//button[text()='Double Click Me']")
    private WebElement btnDoubleClickMe;
    @FindBy(xpath = ".//button[text()='Right Click Me']")
    private WebElement btnRightClickMe;
    @FindBy(xpath = ".//button[text()='Click Me']")
    private WebElement btnClickMe;
    @FindBy(xpath = ".//p[text()='You have done a double click']")
    private WebElement doubleClickResult;
    @FindBy(xpath = ".//p[text()='You have done a right click']")
    private WebElement rightClickResult;
    @FindBy(xpath = ".//p[text()='You have done a dynamic click']")
    private WebElement dynamicClickResult;

    Actions actions = new Actions(webDriver);
    @Override
    String getUrl() {
        return "/buttons";
    }

    public ButtonsPage checkButtonsPageIsDisplayed(){
        checkIsElementDisplayed("Name page is not displayed", namePageButtons);
        return this;
    }
    public ButtonsPage checkButtonsDisplayed(){
        checkUrl();
        checkButtonsPageIsDisplayed();
        return this;
    }
    public ButtonsPage clickToBtnClickMe(){
        clickOnElement(btnClickMe);
        return this;
    }
    public ButtonsPage clickbtnRightClickMe(){
        actions.contextClick(btnRightClickMe).perform();
        return this;
    }
    public ButtonsPage clickbtnDoubleClickMe(){
        actions.doubleClick(btnDoubleClickMe).perform();
        return this;
    }
    public ButtonsPage clickToMenuInDropdownButtons(){
        clickOnElement(menuItemInDropdownButtons);
        return this;
    }
    public ButtonsPage checkdynamicClickIsDisplayed(){
        checkIsElementDisplayed("Name page is not displayed", dynamicClickResult);
        return this;
    }
    public ButtonsPage checkRightClickIsDisplayed(){
        checkIsElementDisplayed("Name page is not displayed", rightClickResult);
        return this;
    }
    public ButtonsPage checkDoubleClickResultIsDisplayed(){
        checkIsElementDisplayed("Name page is not displayed", doubleClickResult);
        return this;
    }

}
