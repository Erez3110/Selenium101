package PageObjects.Web.Widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class sideMenu
{
    @FindBy(xpath = "//span[text()=\"Accordian\"]")
    public WebElement accordian_btn;

    @FindBy(xpath = "//span[text()=\"Auto Complete\"]")
    public WebElement autoComplete_btn;

    @FindBy(xpath = "//span[text()=\"Date Picker\"]")
    public WebElement datePicker_btn;

    @FindBy(xpath = "//span[text()=\"Slider\"]")
    public WebElement slider_btn;

    @FindBy(xpath = "//span[text()=\"Progress Bar\"]")
    public WebElement progressBar_btn;

    @FindBy(xpath = "//span[text()=\"Tabs\"]")
    public WebElement tabs_btn;

    @FindBy(xpath = "//span[text()=\"Tool Tips\"]")
    public WebElement toolTips_btn;

    @FindBy(xpath = "//span[text()=\"Menu\"]")
    public WebElement menu_btn;

    @FindBy(xpath = "//span[text()=\"Select Menu\"]")
    public WebElement selectMenu_btn;
}
