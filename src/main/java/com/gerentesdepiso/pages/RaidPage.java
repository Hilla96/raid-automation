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
    private final String pageUrl = "https://gerentesdepiso.online" ;

    // Locators
    private final Locator applicationButton;
    private final Locator openRaidRegisterButton;

    // Class constructor
    public RaidPage(Page page) {
        this.page = page;
        //Locator for the ap button/link using its accesible role and visible name
        this.applicationButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Postular a raid 12.1").setExact(true));

        // Best Practice: Locate "Abrir registro raid" button by accessible role and visible text name
        this.openRaidRegisterButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Abrir registro raid").setExact(true));
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
     * Retrieves the current URL of the page.
     * @return String containing current page URL
     */
    public String getCurrentUrl() {
        return page.url();
    }

    /**
     * Checks if the postulation button is visible on the page.
     * @return boolean true if visible, false otherwise
     */
    public boolean isClickApplyButtonVisible() {
        return applicationButton.isVisible();
    }

    /**
     * Clicks on the apply for raid button.
     */
    public void clickApplyButton() {
        applicationButton.click();
    }

    /**
     * Checks if the "Abrir registro raid" button is visible.
     * @return boolean true if visible, false otherwise.
     */
    public boolean isOpenRaidRegisterButtonVisible() {
        return openRaidRegisterButton.isVisible();
    }

    /**
     * Clicks on the "Abrir registro raid" button.
     */
    public void clickOpenRaidRegisterButton() {
        openRaidRegisterButton.click();
    }


}
