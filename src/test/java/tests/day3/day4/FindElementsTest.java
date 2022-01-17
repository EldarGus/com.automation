package tests.day3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class FindElementsTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        String expectedTitle = driver.getTitle();

        WebElement button = driver.findElement(By.id("form_submit"));
        button.click();

        String actualTitile = driver.getTitle();
        if(actualTitile.equals(expectedTitle)){
            System.out.println("Test pasesd");

        }else{
            System.out.println("Test failed");
        }
        BrowserUtils.wait(2);
    }
}
