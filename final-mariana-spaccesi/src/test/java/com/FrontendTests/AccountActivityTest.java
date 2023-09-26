package com.FrontendTests;

import com.Pages.AccountActivity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class AccountActivityTest {
    private static WebDriver driver;

    AccountActivity accountActivity;

    @BeforeEach
    public void setUp() throws Exception {
        accountActivity = new AccountActivity(driver);
        driver = accountActivity.chromeDriverConnection();
        accountActivity.getLink("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
    }


    @AfterEach
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void testingAccountActivity() throws InterruptedException {
        accountActivity.accountActivityChecked();
    }
}
