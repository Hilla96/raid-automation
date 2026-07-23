package com.gerentesdepiso.tests;

import com.gerentesdepiso.base.BaseTest;
import com.gerentesdepiso.pages.RaidPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RaidTest extends BaseTest {
    @Test(description = "Verify that the raid application page loads successfully")
    public void verifyRaidApplicationPageLoadsSuccessfully() {

        RaidPage raidPage = new RaidPage(page);

        raidPage.navigateToRaidPage();

        String actualTitle = raidPage.getPageTitle();
        System.out.println("Loaded page title " + actualTitle);

        Assert.assertNotNull(actualTitle, "Page title should not be null");
        Assert.assertFalse(actualTitle.isEmpty(), "Page title should not be empty");

    }
    @Test(description = "Verify that the Application Button visible and clickable")
    public void verifyApplicationButtonIsVisibleAndClickable() {
        // Instantiate the RaidPage object
        RaidPage raidPage = new RaidPage(page);

        // Navigate to the Raid application
        raidPage.navigateToRaidPage();

        // Assert that the application button is visible
        Assert.assertTrue(raidPage.isClickApplyButtonVisible(), "Application button is not visible");

        // Click the Application Button
        raidPage.clickApplyButton();

        // Verify redirection to /raid URL
        Assert.assertEquals(raidPage.getCurrentUrl(), "https://gerentesdepiso.online/raid", "URL should be redirected to /raid");

        // Verify that the 'Abrir registro raid' button is visible in the new section
        Assert.assertTrue(raidPage.isOpenRaidRegisterButtonVisible(), "Open raid register button is not visible");
    }
}
