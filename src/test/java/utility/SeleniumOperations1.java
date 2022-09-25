package utility;
	import org.openqa.selenium.By;                //using Array
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	public class SeleniumOperations1 
	
	{
		public static ChromeDriver driver=null;
		
		//browserLaunch
		          public static void browserLaunch(Object[]inputParameters)
		          {
		        	  String strBrowserKey=(String) inputParameters[0];
		        	  String webDriverExePath=(String) inputParameters[1];	        	  
		        	  System.setProperty(strBrowserKey, webDriverExePath);
		        	   driver=new ChromeDriver();
		        	  driver.manage().window().maximize();
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
		        	  
		        	  driver.findElementByXPath(locator).click();
		        	  
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
		        	 
		        	  driver.findElementByXPath(locator).sendKeys(sendText);
		          }
		          
		          
		          
		         
		          public static void main(String[] args) throws InterruptedException 
		          {
		        	  
		        	  //browserLaunch
		        	  Object[] input=new Object[2];
		        	           input[0]="webdriver.chrome.driver" ;
		        	           input[1]="E:\\\\Automation support\\\\chromedriver.exe";
		        	           browserLaunch(input);
	        	 
		        	  //openApplication
		        	  Object[] input1=new Object[1];
	   	             		   input1[0]="https://www.flipkart.com";
	   	                       openApplication(input1);     
	           
	   	         
	   	              //clickOnElement
	   	              Object[] input2=new Object[1];
	   	              		   input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		                       clickOnElement(input2);     
		           
		           
		             //mouseOverOnElement
		        	  Object[] input3=new Object[1];
	  	                       input3[0]="//*[@class='_1_3w1N']";
	  	                       mouseOverAction(input3);
		        	
	  	             //clickOnMyProfile
	   	              Object[] input4=new Object[1];
		                       input4[0]="(//*[@class='_2NOVgj'])[1]";
		                       clickOnElement(input4);     
		           
		              Thread.sleep(5000);         
		             //enterUsername
		        	  Object[] input5=new Object[2];
		        	           input5[0]="//*[@class='_2IX_2- VJZDxU']";
		        	           input5[1]="7507452740";
		        	           sendText(input5);
		        	  
		        	  //enterPassword
		     	        Object[] input6=new Object[2];
		     	        	     input6[0]="//*[@type='password']";
		     	        	     input6[1]="studofstat";
		     	        	     sendText(input6);  
		     	        	           
		     	       //clickOnLoginButton
		     	         Object[] input7=new Object[1];
		     	               input7[0]="(//*[text()='Login'])[3]";
		     	        	   clickOnElement(input7);         	           
		        	  
				  }
		
	 
	}

