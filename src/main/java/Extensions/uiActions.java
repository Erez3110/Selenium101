package Extensions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class uiActions extends commonOps
{
    @Step("Click on Element")
    public static void click(WebElement elem)
    {
        if(!getData("platformType").equalsIgnoreCase("mobile")
                && !getData("platformType").equalsIgnoreCase("electron")
                && !getData("platformType").equalsIgnoreCase("desktop"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        elem.click();
    }

    @Step("Click on Element")
    public static void doubleClick(WebElement elem)
    {
        if(!getData("platformType").equalsIgnoreCase("mobile")
                && !getData("platformType").equalsIgnoreCase("electron")
                && !getData("platformType").equalsIgnoreCase("desktop"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        action.doubleClick(elem).build().perform();
    }

    @Step("Send Text to TextBox")
    public static void updateText(WebElement elem, String value)
    {
        if(!getData("platformType").equalsIgnoreCase("mobile")
                && !getData("platformType").equalsIgnoreCase("electron")
                && !getData("platformType").equalsIgnoreCase("desktop"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        elem.clear();
        elem.sendKeys(value);
    }

    @Step("Update DropDown")
    public static void updateDropDown(WebElement elem, String value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select myValue = new Select(elem);
        myValue.selectByVisibleText(value);
    }

    @Step("Hover to Element")
    public static void mouseHoverElements(WebElement elem1, WebElement elem2)
    {
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }

    @Step("Check Radio Button or Check Box")
    public static void check(WebElement elem)
    {
        if(!getData("platformType").equalsIgnoreCase("mobile")
                && !getData("platformType").equalsIgnoreCase("electron")
                && !getData("platformType").equalsIgnoreCase("desktop"))
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(elem).click().perform();
    }

    @Step("Scroll Page to Element")
    public static void scrollTo(WebElement elem)
    {
        js.executeScript("arguments[0].scrollIntoView(true);", elem);
    }

    public static void keyboardCommand(String command, int reps)
    {
        if(command.equalsIgnoreCase("down"))
        {
            for(int i = 0; i < reps; i++)
            {
                action.sendKeys(Keys.ARROW_DOWN).build().perform();
            }
            action.sendKeys(Keys.ENTER).build().perform();
        }
        else if(command.equalsIgnoreCase("up"))
        {
            for(int i = 0; i < reps; i++)
            {
                action.sendKeys(Keys.ARROW_UP).build().perform();
            }
        }
        else if(command.equalsIgnoreCase("right"))
        {
            for(int i = 0; i < reps; i++)
            {
                action.sendKeys(Keys.ARROW_RIGHT).build().perform();
            }
        }
        else if(command.equalsIgnoreCase("left"))
        {
            for(int i = 0; i < reps; i++)
            {
                action.sendKeys(Keys.ARROW_LEFT).build().perform();
            }
        }
        else if(command.equalsIgnoreCase("enter"))
        {
            for(int i = 0; i < reps; i++)
            {
                action.sendKeys(Keys.ENTER).build().perform();
            }
        }
    }

    @Step("Switch to New Tab")
    public static void switchToNewTab()
    {
        for (String winHandle:driver.getWindowHandles())
        {
            driver.switchTo().window(winHandle);
        }
    }

    @Step("Hover to element")
    public static void hoverTo(WebElement elem)
    {
        uiActions.scrollTo(widgets_toolTips.toolTip_btn);
        wait.until(ExpectedConditions.visibilityOf(elem));
        action.moveToElement(elem).build().perform();
    }
}
