package ScreenShotDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


public class ScreenShot {
 public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\md sakib\\Desktop\\Selenium Practice\\chromedriver.exe");
		
       driver = new ChromeDriver();
       driver.get("https://www.udemy.com/");
       //**impotrtant give capture
       Capture("Udemy course");
	}
	@Test
	public static void Capture(String fileName) throws Exception {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    // by using FileHandler we can add loaction to copy
		try {
			FileHandler.copy(source, new File("C:\\Users\\md sakib\\Desktop\\java_new\\Selenium_demo\\src\\ScreenShot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ScreenShot is not working");
			}}}