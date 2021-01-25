package PageObjects.Web.Widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class slider
{
    @FindBy(xpath = "//input[@class='range-slider range-slider--primary']")
    public WebElement slider_btn;

    @FindBy(id = "sliderValue")
    public WebElement sliderValue_txt;
}
