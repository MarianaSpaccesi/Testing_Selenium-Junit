package com.FrontendTests;

import com.Pages.TransferFounds;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TransferFoundsTest {

    private static WebDriver driver;

    TransferFounds transferFounds;


    @BeforeEach
    public void setUp() throws Exception {
        transferFounds = new TransferFounds(driver);
        driver = transferFounds.chromeDriverConnection();
        transferFounds.getLink("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
    }


    @AfterEach
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void testingTransferFounds() throws InterruptedException {
        transferFounds.transferedFounds();
    }
}
