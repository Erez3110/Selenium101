package PageObjects.Web.Widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class toolTips
{
    @FindBy(id = "toolTipButton")
    public WebElement toolTip_btn;

    @FindBy(id = "toolTipTextField")
    public WebElement toolTip_txt;

    @FindBy(xpath = "//a[contains(text(),'Contrary')]")
    public WebElement contraryToolTip_link;

    @FindBy(xpath = "//a[contains(text(),'1.10.32')]")
    public WebElement sectionToolTip_link;

    @FindBy(xpath = "//div[@class='tooltip-inner']")
    public WebElement toolTip_lbl;
}
