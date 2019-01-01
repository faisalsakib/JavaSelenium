package Broweser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailErrorMassageGet {

	public static void main(String[] args) throws InterruptedException {
		try
		{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\md sakib\\Desktop\\Selenium Practice\\chromedriver.exe");
	       
		 driver = new ChromeDriver();
		 driver.navigate().to("https://www.facebook.com");
		 Thread.sleep(5000);
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ABCD");
         driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
	
         // driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	     driver.findElement(By.cssSelector("#loginbutton")).click();
	    String ErrorActualMsg= driver.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText();
	    System.out.println("ErrorActualMsg :"+ErrorActualMsg);
	      String ErrormsgExpct="The email or phone number you’ve entered doesn’t match any account. Sign up for an account.";
	      String xxx="null";
	      System.out.println(xxx.isEmpty());
	      if (ErrorActualMsg.equalsIgnoreCase(ErrormsgExpct)) {
	    	  System.out.println("SYstem passed");
	      }
	      else 
	      {
	    	  System.out.println("System failed");
	      }
	     // driver.quit();//it will close all the browser
	      driver.close();// it will close current browser
	      }
		catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("this is catch");
		}
		finally
		{
			System.out.println("It it finally block and it will execute no matter what");
		    
		}
	      
	}
	

}
