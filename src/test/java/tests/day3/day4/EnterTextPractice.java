package tests.day3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class EnterTextPractice {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement inputBox= driver.findElement(By.name("email"));
        inputBox.sendKeys("random@email.com");

        WebElement button = driver.findElement(By.id("form_submit"));
        button.click();
        String expectedUrl = "http://practice.cybertekschool.com/email_sent";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test passed");

        }else {
            System.out.println("Test failed");
        }

        String expectedMess = "Your e-mail's been sent!";
        WebElement actualMes= driver.findElement(By.name("Your e-mail's been sent!"));
        String Url= String.valueOf(actualMes);
        if (Url.equals(expectedMess)){
            System.out.println("Test passed");

        }else {
            System.out.println("Test failed");
        }


        BrowserUtils.wait(4);
        driver.close();


    }

}
