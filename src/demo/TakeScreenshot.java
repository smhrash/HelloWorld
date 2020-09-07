package demo;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TakeScreenshot {

    public static void main(String[] args) throws IOException {

        String url = "http://www.popuptest.com/goodpopups.html";

        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        Date currentDate = new Date();
        //System.out.println(currentDate);
        String screenshotFileName = currentDate.toString().replace(" ","-").replace(":","-");

        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile,new File(".//screenshot//"+screenshotFileName+".png"));


        driver.quit();


    }
}
