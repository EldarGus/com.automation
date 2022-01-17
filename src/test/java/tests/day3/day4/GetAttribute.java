package tests.day3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class GetAttribute {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");



        WebElement input= driver.findElement(By.name("email"));
        System.out.println(input.getAttribute("pattern"));
        input.sendKeys("random@email.com");
        System.out.println(input.getAttribute("value"));

        WebElement retrivePasswordButton =  driver.findElement(By.id("form_submit"));
        retrivePasswordButton.submit();
        BrowserUtils.wait(2);
    }
}

