package PageObjects.Web.Widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class progressBar
{
    @FindBy(id = "startStopButton")
    public WebElement startStop_btn;

    @FindBy(xpath = "//div[@role='progressbar']")
    public WebElement bar_lbl;
}
