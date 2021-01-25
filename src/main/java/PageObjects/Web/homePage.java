package PageObjects.Web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage
{
    @FindBy(xpath = "//div[@class='category-cards']/div[1]")
    public WebElement elements_btn;

    @FindBy(xpath = "//div[@class='category-cards']/div[2]")
    public WebElement forms_btn;

    @FindBy(xpath = "//div[@class='category-cards']/div[3]")
    public WebElement alertsFramesAneWindows_btn;

    @FindBy(xpath = "//div[@class='category-cards']/div[4]")
    public WebElement widgets_btn;

    @FindBy(xpath = "//div[@class='category-cards']/div[5]")
    public WebElement interactions_btn;

    @FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
    public WebElement mainLogo_img;

    @FindBy(xpath = "//img[@src='/images/WB.svg']")
    public WebElement banner_img;
}
