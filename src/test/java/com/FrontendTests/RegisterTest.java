package com.FrontendTests;

import com.Pages.Register;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class RegisterTest {

	private static WebDriver driver;

	Register registerPage;

	@BeforeEach
	public void setUp() throws Exception {
		registerPage = new Register(driver);
		driver = registerPage.chromeDriverConnection();
		registerPage.getLink("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	}


	@AfterEach
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testingRegister() throws InterruptedException {
		registerPage.registerPage();
	}
}
