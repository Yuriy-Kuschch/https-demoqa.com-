package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends MainPage{

    public TextBoxPage(WebDriver webDriver) {
        super(webDriver);    }

    @FindBy(xpath = ".//div[@class='header-wrapper' ]/div [contains(text(),'Elements')]/parent::div")
    private WebElement menuItemElementsInDropdown;
    @FindBy(xpath = ".//ul/li/span[text()='Text Box']/parent::li")
    private WebElement menuItemInDropdownTextBox;
    @FindBy(xpath = ".//div[@class=\"main-header\" and text()='Elements']")
    private  WebElement namePageElements;
    @FindBy(xpath = ".//div[@class=\"main-header\" and text()='Text Box']")
    private  WebElement namePageTextBox;
    @FindBy(xpath = ".//input[@type='text']")
    private WebElement inputFullName;
    @FindBy(xpath = ".//input[@type='email']")
    private WebElement inputEmail;
    @FindBy(xpath = ".//textarea[@placeholder='Current Address']")
    private WebElement inputCurrentAddress;
    @FindBy(xpath = ".//textarea[@id='permanentAddress']")
    private WebElement inputPermanentAddress;
    @FindBy(xpath = ".//button[contains(text(),'Submit')]")
    private WebElement btnSubmitTextBox;
    @FindBy(xpath = ".//p[@id = 'name']")
    private WebElement fieldNameResultSubmited;
    @FindBy(xpath = ".//p[@id = 'email']")
    private WebElement fieldEmailResultSubmited;
    @FindBy(xpath = ".//p[@id = 'currentAddress']")
    private WebElement fieldCurrentAddressResultSubmited;
    @FindBy(xpath = ".//p[@id = 'permanentAddress']")
    private WebElement fieldPermanentAddressResultSubmited;

    @Override
    String getUrl() {
        return "/text-box";
    }

    public TextBoxPage clickToMenuInDropdownTextBox(){
        clickOnElement(menuItemInDropdownTextBox);
        return this;
    }
    public TextBoxPage checkPageElementsIsDisplayed(){
        checkIsElementDisplayed("Name page is not displayed", namePageElements);
        return this;
    }
    public TextBoxPage checkTextBoxPageNameIsDisplayed(){
        checkIsElementDisplayed("Name page is not displayed", namePageTextBox);
        return this;
    }
    public TextBoxPage enterTextIntoFullNameInput(String text){
        enterTextIntoElement(inputFullName, text);
        return this;
    }
    public TextBoxPage enterTextIntoEmailInput(String text){
        enterTextIntoElement(inputEmail, text);
        return this;
    }
    public TextBoxPage enterTextIntoCurrentAddressInput(String text){
        enterTextIntoElement(inputCurrentAddress, text);
        return this;
    }
    public TextBoxPage enterTextIntoPermanentAddressInput(String text){
        enterTextIntoElement(inputPermanentAddress, text);
        return this;
    }
    public TextBoxPage clickOnBtnSubmit(){
        clickOnElement(btnSubmitTextBox);
        return this;
    }
    public TextBoxPage scrollButtom(){
        JavascriptExecutor jse = (JavascriptExecutor)webDriver;
        jse.executeScript("scroll(0, 250);");
        return this;
    }
    public TextBoxPage checkFieldNameResultSubmitedIsDisplayed(){
        checkIsElementDisplayed("Name page is not displayed", fieldNameResultSubmited);
        return this;
    }
    public TextBoxPage checkFieldEmailResultSubmitedIsDisplayed(){
        checkIsElementDisplayed("Email page is not displayed", fieldEmailResultSubmited);
        return this;
    }
    public TextBoxPage checkFieldCurrentAddressResultSubmitedIsDisplayed(){
        checkIsElementDisplayed("Name page is not displayed", fieldCurrentAddressResultSubmited);
        return this;
    }
    public TextBoxPage checkFieldPermanentResultSubmitedIsDisplayed(){
        checkIsElementDisplayed("Name page is not displayed", fieldPermanentAddressResultSubmited);
        return this;
    }
    public TextBoxPage checkTextBoxPageIsDisplayed(){
        checkUrl();
        checkTextBoxPageNameIsDisplayed();
        return this;
    }
}
