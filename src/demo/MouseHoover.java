package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoover {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
        WebElement contentLink= driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/a"));
        Actions action = new Actions(driver);
        action.moveToElement(contentLink).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText("COURSES")).click();
        Thread.sleep(3000);
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);




        driver.quit();
    }
}
