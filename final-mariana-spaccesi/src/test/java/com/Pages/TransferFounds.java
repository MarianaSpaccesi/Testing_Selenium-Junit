package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TransferFounds extends BasePage {
    By userName = By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input");
    By password = By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[2]/input");
    By loginButton = By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input");
    By transferFoundsLink = By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[3]/a");
    By  transferFoundsText= By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/h1");
    By  amount = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/p/input");
    By  fromAccountSelect = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select[1]");
    By  fromAccountOption= By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select[1]/option[1]");
    By  toAccountSelect = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select[2]");
    By  toAccountOption = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select[2]/option[2]");
    By  transferButton = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[2]/input");
    By  transferCompleteText = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/h1");

    public TransferFounds(WebDriver webDriver) {
    }

    public void transferedFounds() throws InterruptedException{
        writeText("Mari123", userName);
        writeText("1234567", password);
        click(loginButton);
        Thread.sleep(4000);
        click(transferFoundsLink);
        Thread.sleep(4000);
        String confirmation = driver.findElement(transferFoundsText).getText();
        assertTrue(confirmation.contains("Transfer Funds"));
        writeText("1000", amount);
        click(fromAccountSelect);
        Thread.sleep(4000);
        click(fromAccountOption);
        Thread.sleep(4000);
        click(toAccountSelect);
        Thread.sleep(3000);
        click(toAccountOption);
        Thread.sleep(3000);
        click(transferButton);
        Thread.sleep(4000);
        String confirmation2 = driver.findElement(transferCompleteText).getText();
        assertTrue(confirmation2.contains("Transfer Complete!"));

    }
}
