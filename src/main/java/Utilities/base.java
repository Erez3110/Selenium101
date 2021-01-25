package Utilities;

import PageObjects.Web.AlertsAndFrames.sideMenu;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import java.util.Set;

public class base
{
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;
    public static Screenshot imageScreenShot;
    public static ImageDiffer imageDiff = new ImageDiffer();
    public static ImageDiff diff;
    public static JavascriptExecutor js = null;
    public static SoftAssert softAssert = new SoftAssert();

    public static PageObjects.Web.homePage toolsQA_homePage;
    public static PageObjects.Web.Elements.sideMenu elements_sideMenu;
    public static PageObjects.Web.Elements.textBox elements_textBox;
    public static PageObjects.Web.Elements.radioButton elements_radioBtn;
    public static PageObjects.Web.Elements.buttons elements_buttons;
    public static PageObjects.Web.Elements.dynamicProperties elements_dynamicProperties;
    public static PageObjects.Web.Forms.practiseForms forms_practiseForms;
    public static PageObjects.Web.Forms.datePicker forms_datePicker;
    public static PageObjects.Web.AlertsAndFrames.sideMenu alertsAndFrames_sideMenu;
    public static PageObjects.Web.AlertsAndFrames.browseWindows alertsAndFrames_browseWindows;
    public static PageObjects.Web.AlertsAndFrames.alerts alertsAndFrames_alerts;
    public static PageObjects.Web.Widgets.sideMenu widgets_sideMenu;
    public static PageObjects.Web.Widgets.accordian widgets_accordian;
    public static PageObjects.Web.Widgets.slider widgets_slider;
    public static PageObjects.Web.Widgets.progressBar widgets_progressBar;
    public static PageObjects.Web.Widgets.toolTips widgets_toolTips;
}
