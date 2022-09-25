package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations2 
{
	public static WebDriver driver=null;
	
	//browserLaunch
	          public static void browserLaunch(Object[]inputParameters)
	          {
	        	  String bName=(String) inputParameters[0];
	        	  String webDriverExePath=(String) inputParameters[1];	        	  
	        	 
	          if(bName.equalsIgnoreCase("Chrome"))
	        	  { 
	        	  System.setProperty("webdriver.chrome.driver", webDriverExePath);
	        	  driver=new ChromeDriver();
	        	  driver.manage().window().maximize();
	              }
	          else if(bName.equalsIgnoreCase("Firefox"))
	          {
	        	  System.setProperty("webdriver.gecko.driver", webDriverExePath);
	        	  driver=new FirefoxDriver();
	        	  driver.manage().window().maximize(); 
	          }
	          }
	//openApplication
	          public static void openApplication(Object[]inputParameters)
	          {
	        	  String strgUrl=(String) inputParameters[0];        	
	        	  driver.get(strgUrl);	        	  	        	  
	          }
	         //click
	          public static void clickOnElement(Object[]inputParameters)
	          {
	        	  String locator=(String) inputParameters[0];       	
	        	   driver.findElement(By.xpath(locator)).click();
	        	  }
	   //mouseOver
	          public static void mouseOverAction(Object[]inputParameters)
	          {
	        	  String locator=(String) inputParameters[0];            	
	        	  Actions act=new Actions(driver);
	        	  WebElement abc=driver.findElement(By.xpath(locator));
	        	  act.moveToElement(abc).build().perform();	        	  
	        	  }
	      //sendkeys
	          public static void sendText(Object[]inputParameters)
	          {
	        	  String locator=(String) inputParameters[0];    
	        	  String sendText=(String) inputParameters[1];           	  
	        	  driver.findElement(By.xpath(locator)).sendKeys(sendText);
	          }
}

