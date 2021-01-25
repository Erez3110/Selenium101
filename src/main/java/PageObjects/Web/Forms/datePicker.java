package PageObjects.Web.Forms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class datePicker
{
    @FindBy(xpath = "//select[@class='react-datepicker__month-select']")
    public WebElement month_select;

    @FindBy(xpath = "//select[@class='react-datepicker__year-select']")
    public WebElement year_select;

    @FindBy(xpath = "//div[contains(@class, 'react-datepicker__day')]")
    public List<WebElement> day_list;
}
