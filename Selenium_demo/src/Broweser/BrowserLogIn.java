package Broweser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLogIn {

	public static void main(String[] args) {
		try{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\md sakib\\Desktop\\Selenium Practice\\chromedriver.exe");
       
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=CHBbkoJaLvM");
		driver.navigate().to("http://www.bcc.cuny.edu/academics/student-success-programs/honors-program/");
		System.out.println(driver.getTitle());
		System.out.println("It is working");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		String Titile=driver.getTitle();
		System.out.println("Title"+Titile);
		
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.close();
  
		}
		catch(Exception ex) {
			ex.printStackTrace();
		System.out.println("it is catch Block");
			
		}
		finally {
			System.out.println("It is finally block");
		}
		
		
	}

}
