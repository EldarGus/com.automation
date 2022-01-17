package tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumScript {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        
       String actualResult= driver.getTitle();
       String expectResult="Google";
       if (actualResult.equals(expectResult)){
           System.out.println("pass");
       }else{
           System.out.println("failed");
       }
driver.close();
    }
}
