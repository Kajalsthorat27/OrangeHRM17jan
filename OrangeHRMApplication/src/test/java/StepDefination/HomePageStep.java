package StepDefination;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Then;

public class HomePageStep extends BaseClass{

	
	
	@Then("user validate url and title")
	public void user_validate_url_and_title() {
	    
		HomePage obj=new HomePage();
		obj.homepage();
		
	}
	
}
