package com.gerentesdepiso.pages;

import com.microsoft.playwright.Page;

/**
 * Page Object class representing the Raid application main page.
 * Stores locators and actions for page interactions.
 */

public class RaidPage {

    // Private variables (Fields)
    private final Page page;
    private final String pageUrl = "https://gerentesdepiso.online/raid" ;

    // Class constructor
    public RaidPage(Page page) {
        this.page = page;
    }

    /**
     * Navigates directly to the Raid application URL
     */
    public void navigateToRaidPage() {
        page.navigate(pageUrl);
    }

    /**
     * Retrieves the current title of web page
     * @return String containing the page title
     */
    public String getPageTitle() {
        return page.title();
    }
}
