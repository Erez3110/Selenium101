package PageObjects.Web.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class buttons
{
    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClick_btn;

    @FindBy(id = "doubleClickMessage")
    public WebElement doubleClick_lbl;
}
