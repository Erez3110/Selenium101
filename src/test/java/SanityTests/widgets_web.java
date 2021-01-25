package SanityTests;

import Extensions.uiActions;
import Extensions.verifications;
import Utilities.commonOps;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Utilities.listeners.class)
public class widgets_web extends commonOps
{
    @Test(description = "Verify Accordian Functionality")
    @Description("Navigate to Widgets > Accordian and verify functionality")
    public void test01_Accordian()
    {
        webFlows.navigateToPage("widgets","accordian");
        verifications.checkCollapsedElement(widgets_accordian.textBlock_list,0,false);
        uiActions.scrollTo(widgets_accordian.textHeader_list.get(1));
        uiActions.click(widgets_accordian.textHeader_list.get(1));
        verifications.checkCollapsedElement(widgets_accordian.textBlock_list,0,true);
        softAssert.assertAll();
    }

    @Test(description = "Verify Slider Functionality")
    @Description("Navigate to Widgets > Slider and verify functionality")
    public void test02_Slider()
    {
        webFlows.navigateToPage("widgets","slider");
        webFlows.moveSlider(78);
        verifications.textInElement(widgets_slider.sliderValue_txt.getAttribute("value"),"78");
    }

    @Test(description = "Verify Progress Bar Functionality")
    @Description("Navigate to Widgets > Progress Bar and verify functionality")
    public void test03_PregressBar()
    {
        webFlows.navigateToPage("widgets","progress bar");
        webFlows.progressBar(45);
        verifications.textInElement(widgets_progressBar.bar_lbl.getAttribute("aria-valuenow"),"45");
    }

    @Test(description = "Verify Tooltip Text")
    @Description("Navigate to Widgets > Tool Tips and verify text")
    public void test04_Tooltip()
    {
        webFlows.navigateToPage("widgets","tool tips");
        uiActions.hoverTo(widgets_toolTips.toolTip_btn);
        verifications.textInElement(widgets_toolTips.toolTip_lbl, "You hovered over the Button");
    }

    @Test(description = "Verify Tooltip Text")
    @Description("Navigate to Widgets > Tool Tips and verify text")
    public void test05_Tooltip()
    {
        webFlows.navigateToPage("widgets","tool tips");
        uiActions.hoverTo(widgets_toolTips.toolTip_btn);
    }
}
