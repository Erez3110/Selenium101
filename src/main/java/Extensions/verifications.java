package Extensions;

import Utilities.commonOps;
import Utilities.helperMethods;
import io.appium.java_client.android.AndroidElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class verifications extends commonOps
{
    @Step("Verify Text in Element")
    public static void textInElement(WebElement elem, String expectedValue)
    {
        assertEquals(elem.getText(),expectedValue);
    }

    @Step("Verify Text in Element")
    public static void textInElement(String elem, String expectedValue)
    {
        assertEquals(elem,expectedValue);
    }

    @Step("Verify Number of Elements")
    public static void numberOfElements(List<WebElement> elems, int expectedValue)
    {
        if(!getData("platformType").equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size()-1)));
        assertEquals(elems.size(),expectedValue);
    }

    @Step("Verify Image")
    public static void visualElement(WebElement imageElement, String expectedImageName)
    {
        BufferedImage expectedImage = null;
        try
        {
            expectedImage = ImageIO.read(new File(getData("imageRepo") + expectedImageName + ".png"));
        }
        catch (Exception e)
        {
            System.out.println("Error reading image file, see details: " + e);
        }
        Screenshot imageScreenShot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(ShootingStrategies.scaling(1.5f), 1000)).takeScreenshot(driver,imageElement);
        BufferedImage actualImage = imageScreenShot.getImage();
        //imageDiff = new ImageDiffer(); אותחל במיין
        diff = imageDiff.makeDiff(actualImage,expectedImage);
        assertFalse(diff.hasDiff(), "Images are not the same");
    }

    @Step("Verify Text with Text")
    public static void text(String actualText, String expectedText)
    {
        assertEquals(actualText, expectedText);
    }

    @Step("Verify if Element is not Disabled By Class Name")
    public static void elementActivated(WebElement elem, boolean active)
    {
        String elemClass = elem.getAttribute("class");
        boolean actualState = !(elemClass.contains("disabled"));
        assertEquals(actualState,active);
    }

    @Step("Verify Element Does Not Exist")
    public static void elementExist(List<AndroidElement> elements, boolean expectedValue)
    {
        assertEquals(!elements.isEmpty(), expectedValue);
    }

    @Step("Verify if Text in a Text Box is in the Correct Format")
    public static void textFormat(WebElement elem)
    {
        String className = elem.getAttribute("class");
        assertTrue(!className.contains("field-error"),"Text in Element is in the Wrong Format");
    }

    @Step("Verify if Element is Displayed")
    public static void elementDisplayed(WebElement elem)
    {
        assertTrue(elem.isDisplayed());
    }

    @Step("Verify Text Color")
    public static void elementCSS(WebElement elem, String cssAttribute, String expectedValue)
    {
        if(cssAttribute.equalsIgnoreCase("color"))
        {
            wait.until(ExpectedConditions.attributeToBe(elem,cssAttribute,"rgba(" + expectedValue + ", 1)"));
            softAssert.assertEquals(helperMethods.trimRGB(elem.getCssValue(cssAttribute)), expectedValue);
        }
        else if(cssAttribute.equalsIgnoreCase("border-color"))
        {
            wait.until(ExpectedConditions.attributeToBe(elem,cssAttribute,"rgb(" + expectedValue + ")"));
            softAssert.assertEquals(helperMethods.trimRGB(elem.getCssValue(cssAttribute)), expectedValue);
        }
    }

    @Step("Check Popups")
    public static void checkPopup(String popupType)
    {
        if(popupType.equalsIgnoreCase("normal"))
        {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert popup = driver.switchTo().alert();
            assertEquals(popup.getText(),"You clicked a button");
            popup.accept();
        }
        else if(popupType.equalsIgnoreCase("delayed"))
        {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert popup = driver.switchTo().alert();
            assertEquals(popup.getText(),"This alert appeared after 5 seconds");
            popup.accept();
        }
        else if(popupType.equalsIgnoreCase("confirm"))
        {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert popup = driver.switchTo().alert();
            softAssert.assertEquals(popup.getText(),"Do you confirm action?");
            popup.accept();
            softAssert.assertEquals(alertsAndFrames_alerts.confirmResult_lbl.getText(),"You selected Ok");
            softAssert.assertAll();
        }
    }

    @Step("Check Prompt Alert")
    public static void checkPromptAlert(String name)
    {
        wait.until(ExpectedConditions.alertIsPresent());
        Alert popup = driver.switchTo().alert();
        softAssert.assertEquals(popup.getText(),"Please enter your name");
        popup.sendKeys(name);
        popup.accept();
        softAssert.assertEquals(alertsAndFrames_alerts.promptResult_lbl.getText(),"You entered " + name);
        softAssert.assertAll();
    }

    @Step("Check if element in accordian is collapsed")
    public static void checkCollapsedElement(List<WebElement> cards, int index, boolean collapse)
    {
        String elemClass = cards.get(index).getAttribute("class");
        boolean actualState = !(elemClass.contains("show"));
        softAssert.assertEquals(actualState,collapse);
    }
}
