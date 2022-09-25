package utility;

	import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

	public class Login 
	{
		@Given ("^User provide browser name as \"(.*)\" and exe location as \"(.*)\"$")
		public static void browserLaunch(String name,String location ) throws InterruptedException
		{Thread.sleep(5000);
			Object[] input=new Object[2];
	           input[0]=name;
	           input[1]=location;
	         SeleniumOperations2.browserLaunch(input);	
		}

		@Given ("^User enter url as \"(.*)\"$")
	public static void openApplication(String url) throws InterruptedException
		{Thread.sleep(5000);
		Object[] input1=new Object[1];
		input1[0]=url;
		SeleniumOperations2.openApplication(input1);
		}

	@Given("^User cancel initial Login window$")
	public void user_cancel_initial_Login_window() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User navigate on Login tab$")
	public void user_navigate_on_Login_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User click on MyProfile$")
	public void user_click_on_MyProfile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Application shows user profile to user$")
	public void application_shows_user_profile_to_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


	}

