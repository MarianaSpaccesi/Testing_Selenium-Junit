package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Register extends BasePage {
    By registerLink = By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a");
    By fullName = By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input");
    By lastName = By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input");
    By address = By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input");
    By city = By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input");
    By state = By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/input");
    By zipCode = By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/input");
    By phone = By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[7]/td[2]/input");
    By ssn = By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input");
    By userName = By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[10]/td[2]/input");
    By password = By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[11]/td[2]/input");
    By confirm = By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[12]/td[2]/input");
    By buttonRegister = By.xpath(" /html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input");
    By confirmationMessage = By.xpath("/html/body/div[1]/div[3]/div[2]/p");

    public Register(WebDriver webDriver) {
    }


    public void registerPage () throws InterruptedException {
        click(registerLink);
        Thread.sleep(4000);
        writeText("Mariana", fullName);
        writeText("Spaccesi", lastName);
        writeText("direccion", address);
        writeText("cordoba",city);
        writeText("Cordoba", state);
        writeText("5000", zipCode);
        writeText("343434", phone);
        writeText("123mbn", ssn);
        writeText("Mari123", userName);
        writeText("1234567", password);
        writeText("1234567", confirm);
        Thread.sleep(2000);
        click(buttonRegister);
        String confirmation = driver.findElement(confirmationMessage).getText();
        assertTrue(confirmation.contains("successfully"));
    }

}
