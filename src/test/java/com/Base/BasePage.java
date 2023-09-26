package com.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {

    protected static WebDriver driver;

    public WebDriver chromeDriverConnection() {
        System.setProperty("user.dir", "/src/test/resources/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(options);
        return driver;

    }

    public void writeText(String imputText, By locator) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(imputText);
    }

    public static void click(By locator) {
        driver.findElement(locator).click();
    }

    public void getLink (String url) {
        driver.get(url);
    }
}
