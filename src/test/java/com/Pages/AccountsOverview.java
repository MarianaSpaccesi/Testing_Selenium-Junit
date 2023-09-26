package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountsOverview extends BasePage {
    By userName = By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input");
    By password = By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[2]/input");
    By loginButton = By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input");
    By accountOverview = By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[2]/a");
    By textBalance = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tfoot/tr/td");

    public AccountsOverview(WebDriver webDriver) {
    }

    public void accountsOverviewChecked () throws InterruptedException {
        writeText("Mari123", userName);
        writeText("1234567", password);
        click(loginButton);
        Thread.sleep(4000);
        click(accountOverview);
        Thread.sleep(4000);
        String confirmation = driver.findElement(textBalance).getText();
        assertTrue(confirmation.contains("Balance includes deposits that may be subject to holds"));
    }
}
