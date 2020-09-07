package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class test {

    public static String url = "https://opensource-demo.orangehrmlive.com/";
    private static String username = "Admin";
    private static String pw = "admin123";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(pw);
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        Thread.sleep(3000);


        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.quit();



    }
}
