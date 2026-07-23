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
}
