package WorkFlows;

import Extensions.uiActions;
import Utilities.commonOps;
import Utilities.helperMethods;
import io.qameta.allure.Step;
import org.boon.di.In;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class webFlows extends commonOps
{
    @Step("Fill all the fields in the Text Box page")
    public static void fillTextBox(String fullName, String email, String currAddress, String permAddress)
    {
        uiActions.updateText(elements_textBox.userName_txt, fullName);
        uiActions.updateText(elements_textBox.userEmail_txt, email);
        uiActions.updateText(elements_textBox.currentAddress_txt, currAddress);
        uiActions.updateText(elements_textBox.permanentAddress_txt, permAddress);
        uiActions.scrollTo(elements_textBox.submit_btn);
        uiActions.click(elements_textBox.submit_btn);
    }

    @Step("Navigate to a page")
    public static void navigateToPage(String category, String subCategory)
    {
        if(category.equalsIgnoreCase("elements"))
        {
            uiActions.click(toolsQA_homePage.elements_btn);
            if(subCategory.equalsIgnoreCase("text box"))
            {
                uiActions.click(elements_sideMenu.textBox_btn);
            }
            else if(subCategory.equalsIgnoreCase("check box"))
            {
                uiActions.click(elements_sideMenu.checkBox_btn);
            }
            else if(subCategory.equalsIgnoreCase("radio button"))
            {
                uiActions.click(elements_sideMenu.radioButton_btn);
            }
            else if(subCategory.equalsIgnoreCase("web tables"))
            {
                uiActions.scrollTo(elements_sideMenu.webTables_btn);
                uiActions.click(elements_sideMenu.webTables_btn);
            }
            else if(subCategory.equalsIgnoreCase("buttons"))
            {
                uiActions.scrollTo(elements_sideMenu.buttons_btn);
                uiActions.click(elements_sideMenu.buttons_btn);
            }
            else if(subCategory.equalsIgnoreCase("links"))
            {
                uiActions.scrollTo(elements_sideMenu.links_btn);
                uiActions.click(elements_sideMenu.links_btn);
            }
            else if(subCategory.equalsIgnoreCase("broken links"))
            {
                uiActions.scrollTo(elements_sideMenu.brokenLinksImages_btn);
                uiActions.click(elements_sideMenu.brokenLinksImages_btn);
            }
            else if(subCategory.equalsIgnoreCase("upload/download"))
            {
                uiActions.scrollTo(elements_sideMenu.uploadAndDownload_btn);
                uiActions.click(elements_sideMenu.uploadAndDownload_btn);
            }
            else if(subCategory.equalsIgnoreCase("dynamic properties"))
            {
                uiActions.scrollTo(elements_sideMenu.dynamicProperties_btn);
                uiActions.click(elements_sideMenu.dynamicProperties_btn);
            }
            else
            {
                System.out.println("Valid element types are:" +
                        "\ntext box" +
                        "\ncheck box" +
                        "\nradio button" +
                        "\nweb tables" +
                        "\nbuttons" +
                        "\nlinks" +
                        "\nbroken links" +
                        "\nupload/download" +
                        "\ndynamic properties");
            }
        }
        else if (category.equalsIgnoreCase("forms"))
        {
            uiActions.click(toolsQA_homePage.forms_btn);
            if(subCategory.equalsIgnoreCase("practise forms"))
            {
                uiActions.click(forms_practiseForms.practiseForms_btn);
            }
        }
        else if (category.equalsIgnoreCase("alerts")
                || category.equalsIgnoreCase("frames")
                || category.equalsIgnoreCase("windows"))
        {
            uiActions.click(toolsQA_homePage.alertsFramesAneWindows_btn);
            if(subCategory.equalsIgnoreCase("browser windows"))
            {
                uiActions.scrollTo(alertsAndFrames_sideMenu.browserWindows_btn);
                uiActions.click(alertsAndFrames_sideMenu.browserWindows_btn);
            }
            else if(subCategory.equalsIgnoreCase("alerts"))
            {
                uiActions.scrollTo(alertsAndFrames_sideMenu.alerts_btn);
                uiActions.click(alertsAndFrames_sideMenu.alerts_btn);
            }
            else if(subCategory.equalsIgnoreCase("frames"))
            {
                uiActions.scrollTo(alertsAndFrames_sideMenu.frames_btn);
                uiActions.click(alertsAndFrames_sideMenu.frames_btn);
            }
        }
        else if (category.equalsIgnoreCase("widgets"))
        {
            uiActions.click(toolsQA_homePage.widgets_btn);
            if(subCategory.equalsIgnoreCase("accordian"))
            {
                uiActions.scrollTo(widgets_sideMenu.accordian_btn);
                uiActions.click(widgets_sideMenu.accordian_btn);
            }
            else if(subCategory.equalsIgnoreCase("slider"))
            {
                uiActions.scrollTo(widgets_sideMenu.slider_btn);
                uiActions.click(widgets_sideMenu.slider_btn);
            }
            else if(subCategory.equalsIgnoreCase("progress bar"))
            {
                uiActions.scrollTo(widgets_sideMenu.progressBar_btn);
                uiActions.click(widgets_sideMenu.progressBar_btn);
            }
            else if(subCategory.equalsIgnoreCase("tool tips"))
            {
                uiActions.scrollTo(widgets_sideMenu.toolTips_btn);
                uiActions.click(widgets_sideMenu.toolTips_btn);
            }
        }
        else if (category.equalsIgnoreCase("interactions"))
        {
            uiActions.click(toolsQA_homePage.interactions_btn);
        }
    }

    @Step("Fill all the mandatory fields in the form")
    public static void fillMandatoryFields(String firstName, String lastName, String gender, String cellPhone)
    {
        uiActions.updateText(forms_practiseForms.firstName_txt,firstName);
        uiActions.updateText(forms_practiseForms.lastName_txt,lastName);
        if(gender.equalsIgnoreCase("male"))
            uiActions.check(forms_practiseForms.male_radio);
        else if(gender.equalsIgnoreCase("female"))
            uiActions.check(forms_practiseForms.female_radio);
        else if(gender.equalsIgnoreCase("other"))
            uiActions.check(forms_practiseForms.other_radio);
        uiActions.updateText(forms_practiseForms.cellPhone_txt,cellPhone);
    }

    @Step("Fill all the optional fields in the form")
    public static void fillOptionalFields(String email, String birthDate, char subject, String hobbies, String currentAddress)
    {
        uiActions.updateText(forms_practiseForms.userEmail_txt,email);
        uiActions.click(forms_practiseForms.birthDate_btn);
        helperMethods.datePicker(birthDate);
        uiActions.updateText(forms_practiseForms.subject_txt, String.valueOf(subject));
        uiActions.keyboardCommand("enter", 1);
        if(hobbies.equalsIgnoreCase("sports"))
            uiActions.check(forms_practiseForms.sports_checkBox);
        else if(hobbies.equalsIgnoreCase("reading"))
            uiActions.check(forms_practiseForms.reading_checkBox);
        else if(hobbies.equalsIgnoreCase("music"))
            uiActions.check(forms_practiseForms.music_checkBox);
        uiActions.updateText(forms_practiseForms.currentAddress_txt, currentAddress);
        uiActions.click(forms_practiseForms.state_txt);
        uiActions.keyboardCommand("enter", 1);
        uiActions.click(forms_practiseForms.city_txt);
        uiActions.keyboardCommand("enter", 1);
    }

    @Step("Toggle accordian element")
    public static void toggleAccordian(List<WebElement> cards, int index)
    {
        uiActions.scrollTo(cards.get(index));
        uiActions.click(cards.get(index));
    }

    @Step("Move slider to target value")
    public static void moveSlider(int targetValue)
    {
        uiActions.scrollTo(widgets_slider.slider_btn);
        uiActions.click(widgets_slider.slider_btn);
        if(Integer.parseInt(widgets_slider.sliderValue_txt.getAttribute("value")) > targetValue)
        {
            while(Integer.parseInt(widgets_slider.sliderValue_txt.getAttribute("value")) != targetValue)
            {
                uiActions.keyboardCommand("left",1);
            }
        }
        else if(Integer.parseInt(widgets_slider.sliderValue_txt.getAttribute("value")) < targetValue)
        {
            while(Integer.parseInt(widgets_slider.sliderValue_txt.getAttribute("value")) != targetValue)
            {
                uiActions.keyboardCommand("right",1);
            }
        }
    }

    @Step("Activate progress bar and stop at target value")
    public static void progressBar(int targetValue)
    {
        uiActions.scrollTo(widgets_progressBar.bar_lbl);
        uiActions.click(widgets_progressBar.startStop_btn);
        while(Integer.parseInt(widgets_progressBar.bar_lbl.getAttribute("aria-valuenow"))!=targetValue)
        {

        }
        uiActions.click(widgets_progressBar.startStop_btn);
    }
}
