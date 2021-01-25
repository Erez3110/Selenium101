package Utilities;

import PageObjects.Web.AlertsAndFrames.sideMenu;
import org.openqa.selenium.support.PageFactory;

public class managePages extends base
{
    public static void init()
    {
        toolsQA_homePage = PageFactory.initElements(driver, PageObjects.Web.homePage.class);
        elements_sideMenu = PageFactory.initElements(driver, PageObjects.Web.Elements.sideMenu.class);
        elements_textBox = PageFactory.initElements(driver, PageObjects.Web.Elements.textBox.class);
        elements_radioBtn = PageFactory.initElements(driver, PageObjects.Web.Elements.radioButton.class);
        elements_buttons = PageFactory.initElements(driver, PageObjects.Web.Elements.buttons.class);
        elements_dynamicProperties = PageFactory.initElements(driver, PageObjects.Web.Elements.dynamicProperties.class);
        forms_practiseForms = PageFactory.initElements(driver, PageObjects.Web.Forms.practiseForms.class);
        forms_datePicker = PageFactory.initElements(driver, PageObjects.Web.Forms.datePicker.class);
        alertsAndFrames_sideMenu = PageFactory.initElements(driver, PageObjects.Web.AlertsAndFrames.sideMenu.class);
        alertsAndFrames_browseWindows = PageFactory.initElements(driver, PageObjects.Web.AlertsAndFrames.browseWindows.class);
        alertsAndFrames_alerts = PageFactory.initElements(driver, PageObjects.Web.AlertsAndFrames.alerts.class);
        widgets_sideMenu = PageFactory.initElements(driver, PageObjects.Web.Widgets.sideMenu.class);
        widgets_accordian = PageFactory.initElements(driver, PageObjects.Web.Widgets.accordian.class);
        widgets_slider = PageFactory.initElements(driver, PageObjects.Web.Widgets.slider.class);
        widgets_slider = PageFactory.initElements(driver, PageObjects.Web.Widgets.slider.class);
        widgets_progressBar = PageFactory.initElements(driver, PageObjects.Web.Widgets.progressBar.class);
        widgets_toolTips = PageFactory.initElements(driver, PageObjects.Web.Widgets.toolTips.class);
    }
}
