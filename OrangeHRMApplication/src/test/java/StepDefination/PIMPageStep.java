package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.PIMPage;
import io.cucumber.java.en.Then;

public class PIMPageStep extends BaseClass {
	private static PIMPage pimpage;
	
	@Then("user click on pim page")
	public void user_click_on_pim_page() {
		 pimpage= new PIMPage();
		 pimpage.PimpageClick();
	}
	@Then("user enter first name and last name and click on save button")
	public void user_enter_first_name_and_last_name_and_click_on_save_button() throws InterruptedException {
	    pimpage.addEmpDetails("abc", "pqr");
	}

}
