package SanityTests;

import Extensions.uiActions;
import Extensions.verifications;
import Utilities.commonOps;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.listeners.class)
public class alertsAndFrames_web extends commonOps
{
    @Test(description = "Check New Tab Functionality")
    @Description("Navigate to Alerts, Frame & Windows > Browser Windows and verify new tab header")
    public void test01_newTab()
    {
        webFlows.navigateToPage("alerts", "browser windows");
        uiActions.click(alertsAndFrames_browseWindows.newTab_btn);
        uiActions.switchToNewTab();
        verifications.textInElement(alertsAndFrames_browseWindows.sampleHeading_lbl.getText(),"This is a sample page");
    }

    @Test(description = "Check New Window Functionality")
    @Description("Navigate to Alerts, Frame & Windows > Browser Windows and verify new window header")
    public void test02_newWindow()
    {
        webFlows.navigateToPage("alerts", "browser windows");
        uiActions.click(alertsAndFrames_browseWindows.newWindow_btn);
        uiActions.switchToNewTab();
        verifications.textInElement(alertsAndFrames_browseWindows.sampleHeading_lbl.getText(),"This is a sample page");
    }

    @Test(description = "Check Alert")
    @Description("Navigate to Alerts, Frame & Windows > Alerts and check alert functionality")
    public void test03_checkAlert()
    {
        webFlows.navigateToPage("alerts", "alerts");
        uiActions.click(alertsAndFrames_alerts.alert_btn);
        verifications.checkPopup("normal");
    }

    @Test(description = "Check Delayed Alert")
    @Description("Navigate to Alerts, Frame & Windows > Alerts and check delayed alert functionality")
    public void test04_checkDelayedAlert()
    {
        webFlows.navigateToPage("alerts", "alerts");
        uiActions.click(alertsAndFrames_alerts.delayedAlert_btn);
        verifications.checkPopup("delayed");
    }

    @Test(description = "Confirm Alert")
    @Description("Navigate to Alerts, Frame & Windows > Alerts confirm alert and verify result")
    public void test05_confirmAlert()
    {
        webFlows.navigateToPage("alerts", "alerts");
        uiActions.click(alertsAndFrames_alerts.confirmAlert_btn);
        verifications.checkPopup("confirm");
    }

    @Test(description = "Prompt Alert")
    @Description("Navigate to Alerts, Frame & Windows > Alerts check prompt alert functionality and verify result")
    public void test06_promptAlert()
    {
        webFlows.navigateToPage("alerts", "alerts");
        uiActions.click(alertsAndFrames_alerts.promptAlert_btn);
        verifications.checkPromptAlert("Erez");
    }
}
