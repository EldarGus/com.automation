package tests.day3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class ConfurmatiinMes {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement input= driver.findElement(By.name("email"));
        input.sendKeys("random@email.com", Keys.ENTER);




        String expectedMess = "Your e-mail's been sent!";
        WebElement confirmMess= driver.findElement(By.name("confirmation_message"));
        String actualMess= confirmMess.getText();

        if (actualMess.equals(expectedMess)){
            System.out.println("Test passed");

        }else {
            System.out.println("Test failed");
        }


        BrowserUtils.wait(4);
        driver.close();


    }

}

