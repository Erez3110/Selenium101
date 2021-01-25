package PageObjects.Web.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dynamicProperties
{
    @FindBy(xpath = "//div[@class=\"col-12 mt-4 col-md-6\"]/div/p")
    public WebElement dynamicId_lbl;

    @FindBy(id = "enableAfter")
    public WebElement disablesElem;

    @FindBy(id = "colorChange")
    public WebElement colorChangeElem;

    @FindBy(id = "visibleAfter")
    public WebElement invisibleElem;
}
