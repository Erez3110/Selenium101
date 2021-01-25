package PageObjects.Web.AlertsAndFrames;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class alerts
{
    @FindBy(id = "alertButton")
    public WebElement alert_btn;

    @FindBy(id = "timerAlertButton")
    public WebElement delayedAlert_btn;

    @FindBy(id = "confirmButton")
    public WebElement confirmAlert_btn;

    @FindBy(id = "confirmResult")
    public WebElement confirmResult_lbl;

    @FindBy(id = "promtButton")
    public WebElement promptAlert_btn;

    @FindBy(id = "promptResult")
    public WebElement promptResult_lbl;
}
