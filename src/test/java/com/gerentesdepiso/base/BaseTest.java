package com.gerentesdepiso.base;

import com.microsoft.playwright.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 * Base class for all automated test cases.
 * This class is responsible for initializing
 * and closing the browser before and after each test.
 */

public class BaseTest {

    // Playwright main instance
    protected Playwright playwright;
    // Browser instance used during test execution
    protected Browser browser;
    //Browser contest used to isolate each test session
    protected BrowserContext context;
    // Active browser page where test action are performed
    protected Page page;

    /**
     * Initializes Playwright, launches the browser,
     * and creates a new page before each test execution.
     */
    @BeforeMethod
    public void setUp() {

        // Create a new Playwright instance
        playwright = Playwright.create();
        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().
                        setHeadless(false));


       // Create an isolated browser context
       context = browser.newContext();
       // Create a new page instance
       page = context.newPage();
       page.navigate("https://www.google.com");

    }

}



