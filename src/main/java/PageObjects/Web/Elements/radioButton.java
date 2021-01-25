package PageObjects.Web.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class radioButton
{
    @FindBy(id = "yesRadio")
    public WebElement yesRadio_btn;

    @FindBy(id = "impressiveRadio")
    public WebElement impressiveRadio_btn;

    @FindBy(id = "noRadio")
    public WebElement noRadio_btn;

    @FindBy(xpath = "//span[@class='text-success']")
    public WebElement result_lbl;
}
