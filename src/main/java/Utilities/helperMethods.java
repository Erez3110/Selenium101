package Utilities;

import Extensions.uiActions;
import com.google.protobuf.StringValue;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.util.List;


public class helperMethods extends commonOps
{
    public static void takeElementScreenShot(WebElement imageElem, String imageName)
    {
        imageScreenShot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(ShootingStrategies.scaling(1.5f), 1000)).takeScreenshot(driver,imageElem); //win 10
        //imageScreenShot = new AShot().takeScreenshot(driver,imageElem); //win 7
        try
        {
            ImageIO.write(imageScreenShot.getImage(),"png", new File(getData("imageRepo") + imageName + ".png"));
        }
        catch (Exception e)
        {
            System.out.println("Error writing image file, see details: " + e);
        }
    }

    public static String trimRGB(String format)
    {
        String[] temp = format.split("\\(");
        String[] rgb = temp[1].split(",");
        String r = rgb[0].trim();
        String g = rgb[1].trim();
        String b = rgb[2].trim().replace(")","");
        return r + ", " + g + ", " + b;
    }

    public static void datePicker(String date) // Date Format: dd/mm/yyyy
    {
        String[] dateParts = date.split("/");

        Select month = new Select(forms_datePicker.month_select);
        month.selectByValue(String.valueOf((Integer.parseInt(dateParts[1])-1)));
        Select year = new Select(forms_datePicker.year_select);
        year.selectByVisibleText(dateParts[2]);
        for (WebElement day:forms_datePicker.day_list)
        {
            if(day.getText().equalsIgnoreCase(dateParts[0]))
            {
                uiActions.click(day);
                break;
            }
        }
    }
}
