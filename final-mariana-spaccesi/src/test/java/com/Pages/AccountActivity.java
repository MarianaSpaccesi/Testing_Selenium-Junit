package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountActivity extends BasePage {
    By userName = By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input");
    By password = By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[2]/input");
    By loginButton = By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input");
    By accountsOverviewLink = By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[2]/a");
    By textBalance = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tfoot/tr/td");
    By accountLink = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[1]/a");
    By accountDetailsText = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/h1");
    By activityPeriodSelect = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[2]/form/table/tbody/tr[1]/td[2]/select");
    By activityPeriodOption = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[2]/form/table/tbody/tr[1]/td[2]/select/option[1]");
    By typeSelect = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[2]/form/table/tbody/tr[2]/td[2]/select");
    By typeOption = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[2]/form/table/tbody/tr[2]/td[2]/select/option[1]");
    By goButton = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[2]/form/table/tbody/tr[3]/td[2]/input");

    public AccountActivity(WebDriver webDriver) {
    }

    public void accountActivityChecked() throws InterruptedException {
        writeText("Mari123", userName);
        writeText("1234567", password);
        click(loginButton);
        Thread.sleep(4000);
        click(accountsOverviewLink);
        Thread.sleep(3000);
        String confirmation = driver.findElement(textBalance).getText();
        assertTrue(confirmation.contains("Balance includes deposits that may be subject to holds"));
        Thread.sleep(3000);
        click(accountLink);
        Thread.sleep(3000);
        String confirmation2 = driver.findElement(accountDetailsText).getText();
        assertTrue(confirmation2.contains("Account Details"));
        click(activityPeriodSelect);
        Thread.sleep(3000);
        click(activityPeriodOption);
        Thread.sleep(3000);
        click(typeSelect);
        Thread.sleep(3000);
        click(typeOption);
        Thread.sleep(3000);
        click(goButton);
    }
}
