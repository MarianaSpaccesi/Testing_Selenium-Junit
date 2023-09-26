package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NewAccount extends BasePage {

    By userName = By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input");
    By password = By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[2]/input");
    By loginButton = By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input");
    By openNewAccountLink = By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[1]/a");
    By optionSelect = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/select[1]");
    By savingsOption = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/select[1]/option[2]");
    By openNewAccountButton = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div/input");
    By confirmText = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/p[1]");

    public NewAccount(WebDriver webDriver) {
    }

    public void accountCreated () throws InterruptedException{
        writeText("Mari123", userName);
        writeText("1234567", password);
        click(loginButton);
        Thread.sleep(4000);
        click(openNewAccountLink);
        Thread.sleep(4000);
        click(optionSelect);
        click(savingsOption);
        click(openNewAccountButton);
        Thread.sleep(4000);
        String confirmation = driver.findElement(confirmText).getText();
        assertTrue(confirmation.contains("Congratulations"));
    }
}
