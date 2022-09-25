package utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations            //by using Methods
{
	
	 public static ChromeDriver driver=null;

		public static void browserLaunch(String key, String exeLocation)
		
		{
			String brKey=key;
			String webDexeLoc = exeLocation;
			System.setProperty(brKey, webDexeLoc);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		public static void openApp(String url)  //openapp
		{
			String strgUrl=url;
			driver.get(strgUrl);
		}
		public static void clickOnElement(String xpath)//click
		{
			String locator=xpath;
			driver.findElementByXPath(locator).click();
		}
	      public static void mouseOverAction (String xpath) //mouseover
		{
		String locator =xpath;
			Actions act=new Actions (driver);
			WebElement abc =driver.findElement(By.xpath(locator));
			act.moveToElement(abc).build().perform();
		}
	      public static void myProfile(String xpath )
	  	{
	  		String path=xpath;
	  		
	  		driver.findElementByXPath(path).click();
	  		
	  	} 
		public static void mobileNo(String xpath , String no )
		{
			String path=xpath;
			String mobNo=no ;
			driver.findElementByXPath(path).sendKeys(mobNo);
			
		}
		
		public static void passW(String xpath , String text )
		{
			String path=xpath;
			String pass=text;
			driver.findElementByXPath(path).sendKeys(pass);
			
		}
		public static void submit(String xpath) 
		{
			String path=xpath;
			driver.findElementByXPath(path).click();
			
		}
		public static void main(String[]args)
		{	browserLaunch("webdriver.chrome.driver", "E:\\Automation support\\chromedriver.exe");
			openApp("https://www.flipkart.com/");
			clickOnElement("//*[@class='_2KpZ6l _2doB4z']");
			mouseOverAction("(//*[@class='_28p97w'])[1]");
			myProfile("//*[text()='My Profile']");
			
			mobileNo("(//*[@type='text'])[2]", "7507452740");
			passW("//*[@type='password']","studofstat");
			submit("(//*[@type='submit'])[2]");
			}
	}



