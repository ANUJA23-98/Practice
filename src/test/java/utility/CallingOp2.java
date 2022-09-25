package utility;

public class CallingOp2
{
	public static void main(String[] args) throws InterruptedException 
    {
//browserLaunch
  	  Object[] input=new Object[2];
  	           input[0]="Chrome" ;
  	           input[1]="E:\\Automation support\\chromedriver.exe";
  	         SeleniumOperations2.browserLaunch(input);
  	  //openApplication
  	  Object[] input1=new Object[1];
          		   input1[0]="https://www.flipkart.com";
          		 SeleniumOperations2.openApplication(input1);     
 
          	Thread.sleep(5000);
	          //clickOnElement
           Object[] input2=new Object[1];
           		   input2[0]="//*[@class='_2KpZ6l _2doB4z']";
           		SeleniumOperations2.clickOnElement(input2);     

       //mouseOverOnElement
  	  Object[] input3=new Object[1];
                   input3[0]="//*[@class='_1_3w1N']";
                   SeleniumOperations2.mouseOverAction(input3);
  	
         //clickOnMyProfile
           Object[] input4=new Object[1];
                 input4[0]="(//*[@class='_2NOVgj'])[1]";
                 SeleniumOperations2.clickOnElement(input4);     
     
       //enterUsername
  	Thread.sleep(5000);
                 Object[] input5=new Object[2];
  	           input5[0]="(//*[@type='text'])[2]";    //"//*[@class='_2IX_2- VJZDxU']";
  	           input5[1]="7507452740";
  	         SeleniumOperations2.sendText(input5);
  	  
  	  //enterPassword
	        Object[] input6=new Object[2];
	        	     input6[0]="//*[@type='password']";
	        	     input6[1]="studofstat";
	        	     SeleniumOperations2.sendText(input6);  
	        	           
	       //clickOnLoginButton
	         Object[] input7=new Object[1];
	               input7[0]="(//*[text()='Login'])[3]";
	               SeleniumOperations2.clickOnElement(input7);         	       
	        	  }

	
	}


