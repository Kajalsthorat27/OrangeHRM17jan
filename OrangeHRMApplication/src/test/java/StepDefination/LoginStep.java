package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass {
	protected static 	LoginPage loginpage;
	
	@Given("User is on LoginPage")
	public void user_is_on_login_page() {
		BaseClass.initialization();
	    
	}
	@When("User enter Username and Password")
	public void user_enter_username_and_password() {
		 loginpage = new LoginPage();
		loginpage.loginFunctionality("Admin", "admin123");
	}
	@Then("clcik on Login Button")
	public void clcik_on_login_button() {
		loginpage.loginButton();
	}

}
