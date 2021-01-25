package PageObjects.Web.AlertsAndFrames;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class browseWindows
{
    @FindBy(id = "tabButton")
    public WebElement newTab_btn;

    @FindBy(id = "sampleHeading")
    public WebElement sampleHeading_lbl;

    @FindBy(id = "windowButton")
    public WebElement newWindow_btn;

    @FindBy(id = "messageWindowButton")
    public WebElement newWindowMessage_btn;
}
