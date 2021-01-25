package SanityTests;

import Extensions.uiActions;
import Extensions.verifications;
import Utilities.commonOps;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Utilities.listeners.class)
public class elements_web extends commonOps
{
    @Test(description = "Check Text Box Functionality")
    @Description("Navigate to Elements > Text Box and check functionality")
    public void test01_verifyMainLogo()
    {
        verifications.visualElement(toolsQA_homePage.mainLogo_img,"Main_Logo");
    }

    @Test(description = "Check Text Box Functionality")
    @Description("Navigate to Elements > Text Box and check functionality")
    public void test02_TextBox()
    {
        webFlows.navigateToPage("elements","text box");
        webFlows.fillTextBox("erez","erez@erez.com","ramat gan", "tel aviv");
        verifications.textFormat(elements_textBox.userEmail_txt);
    }

    @Test(description = "Check Radio Button Functionality")
    @Description("Navigate to Elements > Radio Button and check functionality")
    public void test03_RadioButton() throws InterruptedException
    {
        webFlows.navigateToPage("elements", "radio button");
        uiActions.check(elements_radioBtn.yesRadio_btn);
        verifications.textInElement(elements_radioBtn.result_lbl, "Yes");
    }

    @Test(description = "Check Button Functionality")
    @Description("Navigate to Elements > Buttons and check buttons functionality")
    public void test04_Buttons_doubleClick()
    {
        webFlows.navigateToPage("elements","buttons");
        uiActions.doubleClick(elements_buttons.doubleClick_btn);
        verifications.elementDisplayed(elements_buttons.doubleClick_lbl);
    }

    @Test(description = "Check Dynamic Properties of Element")
    @Description("Navigate to Elements > Dynamic Properties and find element")
    public void test05_DynamicProperties_id()
    {
        webFlows.navigateToPage("elements", "dynamic properties");
        verifications.elementDisplayed(elements_dynamicProperties.dynamicId_lbl);
    }

    @Test(description = "Check Dynamic Properties of Element")
    @Description("Navigate to Elements > Dynamic Properties and verify text color")
    public void test06_DynamicPropertied_textColor()
    {
        webFlows.navigateToPage("elements", "dynamic properties");
        verifications.elementCSS(elements_dynamicProperties.colorChangeElem, "color", "220, 53, 69");
    }
}
