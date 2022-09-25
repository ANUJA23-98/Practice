package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tempt             //Selenium simple program
{
@SuppressWarnings("deprecation")
	public static void main(String [] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation support\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");                                              //open web
		
		driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("7507452740");  //mob enter
        driver.findElementByXPath("//*[@type='password']").sendKeys("studofstat");         //enter pass
        driver.findElementByXPath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']").click();	 //login
        
        Thread.sleep(5000);
        Actions act=new Actions(driver);                                                    
     	WebElement mouseover= driver.findElement(By.xpath("//*[text()='Anuja']"));   //mouse over account
     	act.moveToElement(mouseover).build().perform();

     	Actions act1=new Actions(driver); 
        WebElement mouseover1 = driver. findElement(By.xpath("//*[text()='My Profile']"));     //mouse over my profile
     	act1.moveToElement(mouseover1).click().build().perform();

        driver. getMouse().mouseMove(null); 
        
        Actions act2=new Actions(driver); 
        WebElement mouseover2 = driver.findElementByXPath("(//*[@class='NS64GK'])[1]");            
        act2.moveToElement(mouseover2).click().build().perform();                           
        
        Thread.sleep(5000);
        driver.findElementByXPath("(//*[@class='_1QhEVk'])[1]").click();
        driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("Anuja");  
        driver.findElementByXPath("(//*[@type='text'])[3]").sendKeys("7507452740");
        driver.findElementByXPath("(//*[@type='text'])[4]").sendKeys("414106");
        driver.findElementByXPath("(//*[@type='text'])[5]").sendKeys("Tisgaon");                    
        driver.findElementByXPath("//*[@name='addressLine1']").sendKeys("Near Sagar Hotel Tisgaon");
        Thread.sleep(5000);
        driver.findElementByXPath("(//*[@type='text'])[6]").sendKeys("");                          
        driver.findElementByXPath("(//*[@type='text'])[7]").sendKeys("Nagar road");                 
        driver.findElementByXPath("(//*[@type='text'])[8]").sendKeys("-");
  
        Select  sel=new Select(driver.findElementByXPath("(//*[@name='state'])"));                      
        sel.selectByVisibleText("Maharashtra");                                                 
        
        driver.findElementByXPath("(//*[@class='_1XFPmK'])[1]").click();                                
        driver.findElementByXPath("(//*[@type='button'])[2]").click();
        
        driver.close();
	}
}
