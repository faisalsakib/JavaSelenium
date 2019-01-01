package RadioButtonCheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbDemo {
  public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//Step-1
		
		try {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\md sakib\\Desktop\\Selenium Practice\\chromedriver.exe");
	     //step-2
		 driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement radioButtonForMale=driver.findElement(By.xpath("//input[@name='sex' ]/following::label[text()='Male']"));
		radioButtonForMale.click();
		// is diplayed is method of WebElement interface
		 boolean status=radioButtonForMale.isDisplayed();
		 System.out.println("Status of radio Button is Displayed ::"+status);
		boolean EnabledRadioButton= radioButtonForMale.isEnabled();
		 System.out.println("EnabledRadioButton :::"+EnabledRadioButton);
		 
		 boolean radioButtonIsSeleceted=radioButtonForMale.isSelected();
		 System.out.println(radioButtonIsSeleceted);
		}
		finally {
			driver.close();
		}
		
		
		

	}

}
