package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class Test2 {


    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.popuptest.com/goodpopups.html");

        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parentWindow = it.next();
        System.out.println("Parent window id is: "+parentWindow);

        String childWindow = it.next();

        System.out.println("Child window Id is: "+childWindow);

        driver.switchTo().window(childWindow);
        System.out.println("Child window Title is: "+driver.getTitle());
        System.out.println("Child window URL: "+driver.getCurrentUrl());
        driver.close();
        driver.switchTo().window(parentWindow);
        System.out.println("Parent window Title is: "+driver.getTitle());

        driver.quit();

    }
}
