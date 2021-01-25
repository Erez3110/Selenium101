package PageObjects.Web.AlertsAndFrames;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class sideMenu
{
    @FindBy(xpath = "//span[text()=\"Browser Windows\"]")
    public WebElement browserWindows_btn;

    @FindBy(xpath = "//span[text()=\"Alerts\"]")
    public WebElement alerts_btn;

    @FindBy(xpath = "//span[text()=\"Frames\"]")
    public WebElement frames_btn;

    @FindBy(xpath = "//span[text()=\"Nested Frames\"]")
    public WebElement nestedFrames_btn;
}
