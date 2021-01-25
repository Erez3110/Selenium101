package PageObjects.Web.Widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class accordian
{
    @FindBy(xpath = "//div[@class='card']")
    public List<WebElement> textHeader_list;

    @FindBy(xpath = "//div[@class='card']/div[2]")
    public List<WebElement> textBlock_list;
}
