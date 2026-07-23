package com.gerentesdepiso.pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.AriaRole;

/**
 * Page Object class representing the Raid application main page.
 * Stores locators and actions for page interactions.
 */

public class RaidPage {

    // Private variables (Fields)
    private final Page page;
    private final String pageUrl = "https://gerentesdepiso.online/raid" ;

    // Locators
    private final Locator homeButton;

    // Class constructor
    public RaidPage(Page page) {
        this.page = page;
        //Locator for the home button/link using its accesible role ande visible name
        this.homeButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Inicio").setExact(true));
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

    /**
     * Checks if the Home Button is visible on the page.
     * @return boolean true if visible, false otherwise
     */
    public boolean isHomeButtonVisible() {
        return homeButton.isVisible();
    }

    public void clickHomeButton() {
        homeButton.click();
    }


}
