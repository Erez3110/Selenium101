package PageObjects.Web.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class textBox
{
    @FindBy(id = "userName")
    public WebElement userName_txt;

    @FindBy(id = "userEmail")
    public WebElement userEmail_txt;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress_txt;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddress_txt;

    @FindBy(id = "submit")
    public WebElement submit_btn;
}
