package Helpers;

import Utilities.commonOps;
import Utilities.helperMethods;
import WorkFlows.webFlows;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;

public class visualTesting extends commonOps
{
    @Test
    public void createScreenShot() throws InterruptedException
    {
        helperMethods.takeElementScreenShot(toolsQA_homePage.mainLogo_img, "Main_Logo");
    }
}
