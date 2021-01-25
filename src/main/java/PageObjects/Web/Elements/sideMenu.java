package PageObjects.Web.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class sideMenu
{
    @FindBy(xpath = "//div[@class='element-list collapse show']/ul/li[1]")
    public WebElement textBox_btn;

    @FindBy(xpath = "//div[@class='element-list collapse show']/ul/li[2]")
    public WebElement checkBox_btn;

    @FindBy(xpath = "//div[@class='element-list collapse show']/ul/li[3]")
    public WebElement radioButton_btn;

    @FindBy(xpath = "//div[@class='element-list collapse show']/ul/li[4]")
    public WebElement webTables_btn;

    @FindBy(xpath = "//div[@class='element-list collapse show']/ul/li[5]")
    public WebElement buttons_btn;

    @FindBy(xpath = "//div[@class='element-list collapse show']/ul/li[6]")
    public WebElement links_btn;

    @FindBy(xpath = "//div[@class='element-list collapse show']/ul/li[7]")
    public WebElement brokenLinksImages_btn;

    @FindBy(xpath = "//div[@class='element-list collapse show']/ul/li[8]")
    public WebElement uploadAndDownload_btn;

    @FindBy(xpath = "//div[@class='element-list collapse show']/ul/li[9]")
    public WebElement dynamicProperties_btn;
}
