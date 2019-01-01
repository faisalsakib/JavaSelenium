package Broweser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify2Page {

	public static void main(String[] args) {
		WebDriver driver = null ;
		String x;
		x="sakib";
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\md sakib\\Desktop\\Selenium Practice\\chromedriver.exe");
	       
		 driver = new ChromeDriver();
	     driver.navigate().to("https://www.youtube.com/watch?v=g28hbPB2JIQ");
	     Thread.sleep(5000);
	     driver.manage().window().maximize();
	    String Url= driver.getCurrentUrl();
	    System.out.println("Current Url");
	    String url1="https://www.youtube.com/watch?v=g28hbPB2JIQ";
	    if (Url.equalsIgnoreCase(url1)) {
	    	System.out.println("Url is same and url is "+Url );}
	    	else
	    	{
	    		System.out.println("Url is not same");
	    	}
	    	
	    String CurrentPageTitle=driver.getTitle();
	    System.out.println("CurrentPageTitle :"+CurrentPageTitle);
	    
	     String CurrentPageTitleUtube="Selenium Online Class Part 6";
	     if (CurrentPageTitle.equals(CurrentPageTitleUtube)) {
	    	 System.out.println("Current title is similiar and :"+CurrentPageTitle);
	     }
	     else 
	     {
	    	 System.out.println("Tile is not similiar");
	     }
	     
	     
	     
	     
	     
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("catch block");
		}
		finally {
			System.out.println("It is finally block");
			driver.close();
		}

	}

}
