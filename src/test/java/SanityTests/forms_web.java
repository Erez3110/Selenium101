package SanityTests;

import Extensions.uiActions;
import Extensions.verifications;
import Utilities.commonOps;
import Utilities.helperMethods;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.listeners.class)
public class forms_web extends commonOps
{
    @Test(description = "Verify Mandatory Fields")
    @Description("Navigate to Forms > Practise Form and verify mandatory fields")
    public void test01_VerifyMandatoryFields()
    {
        webFlows.navigateToPage("forms","practise forms");
        uiActions.scrollTo(forms_practiseForms.submit_btn);
        uiActions.click(forms_practiseForms.submit_btn);
        uiActions.scrollTo(forms_practiseForms.firstName_txt);
        verifications.elementCSS(forms_practiseForms.firstName_txt,"border-color","220, 53, 69");
        verifications.elementCSS(forms_practiseForms.lastName_txt,"border-color","220, 53, 69");
        verifications.elementCSS(forms_practiseForms.male_lbl,"color","220, 53, 69");
        verifications.elementCSS(forms_practiseForms.female_lbl,"color","220, 53, 69");
        verifications.elementCSS(forms_practiseForms.other_lbl,"color","220, 53, 69");
        verifications.elementCSS(forms_practiseForms.cellPhone_txt,"border-color","220, 53, 69");
        softAssert.assertAll();
    }

    @Test(description = "Submit Form")
    @Description("Fill all the fields in the form and submit")
    public void test02_FillEntireForm()
    {
        webFlows.navigateToPage("forms","practise forms");
        webFlows.fillMandatoryFields("Erez","Toblem","male","0501234567");
        webFlows.fillOptionalFields("erez@gmail.com","31/10/1988",'c',"music","The Shire");
        uiActions.click(forms_practiseForms.submit_btn);
        verifications.elementDisplayed(forms_practiseForms.modalContainer);
    }

    @Test(description = "Submit Form With Mandatory Fields Only")
    @Description("Fill all the mandatory fields in the form and submit")
    public void test03_FillMandatoryFieldsOnly()
    {
        webFlows.navigateToPage("forms","practise forms");
        webFlows.fillMandatoryFields("Erez","Toblem","male","0501234567");
        uiActions.click(forms_practiseForms.submit_btn);
        verifications.elementDisplayed(forms_practiseForms.modalContainer);
    }

    @Test(description = "Validate Text Box Format - Email")
    @Description("Fill mandatory fields and email and validate email format")
    public void test04_ValidateEmailFormat()
    {
        webFlows.navigateToPage("forms","practise forms");
        webFlows.fillMandatoryFields("Erez","Toblem","male","0501234567");
        uiActions.updateText(forms_practiseForms.userEmail_txt, "erez");
        uiActions.scrollTo(forms_practiseForms.submit_btn);
        uiActions.click(forms_practiseForms.submit_btn);
        verifications.elementCSS(forms_practiseForms.userEmail_txt,"border-color", "220, 53, 69");
    }
}
