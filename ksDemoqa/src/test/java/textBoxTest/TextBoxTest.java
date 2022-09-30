package textBoxTest;

import baseTest.ParentTest;
import org.junit.Test;

public class TextBoxTest extends ParentTest {

    @Test
    public void validDataInTextBox() {

        mainPage.openMainPage()
                .clickToButtonElements();
        textBoxPage.checkPageElementsIsDisplayed()
                    .clickToMenuInDropdownTextBox()
                    .checkTextBoxPageIsDisplayed()
                    .enterTextIntoFullNameInput("Full Name Test")
                    .enterTextIntoEmailInput("email@gmail.com")
                    .enterTextIntoCurrentAddressInput("TEST-1")
                    .enterTextIntoPermanentAddressInput("TEST-2")
                    .scrollButtom()
                    .clickOnBtnSubmit()
                    .checkFieldNameResultSubmitedIsDisplayed()
                    .checkFieldEmailResultSubmitedIsDisplayed()
                    .checkFieldCurrentAddressResultSubmitedIsDisplayed()
                    .checkFieldPermanentResultSubmitedIsDisplayed();

    }

}

