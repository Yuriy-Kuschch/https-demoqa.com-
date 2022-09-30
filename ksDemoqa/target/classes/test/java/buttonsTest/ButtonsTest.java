package buttonsTest;

import baseTest.ParentTest;
import org.junit.Test;

public class ButtonsTest extends ParentTest {

    @Test
    public void validBtnTest(){

        mainPage.openMainPage()
                .clickToButtonElements();
        buttonsPage.clickToMenuInDropdownButtons()
                .checkButtonsDisplayed()
                .clickToBtnClickMe()
                .clickbtnRightClickMe()
                .clickbtnDoubleClickMe()
                .checkdynamicClickIsDisplayed()
                .checkRightClickIsDisplayed()
                .checkDoubleClickResultIsDisplayed()
        ;
    }
}
