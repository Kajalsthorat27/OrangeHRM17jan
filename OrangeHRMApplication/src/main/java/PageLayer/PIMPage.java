package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilesLayer.Wait;

public class PIMPage extends BaseClass {
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pimLink;
	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement addEmp;
	
	@FindBy(name="firstName")
	private WebElement fname;
	
	@FindBy(name="lastName")
	private WebElement lname;
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement save;
	
	public PIMPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void PimpageClick() {
		
		Wait.click(pimLink);
	}
	
	public void addEmpDetails(String Fname,String Lname) throws InterruptedException {
		Wait.click(addEmp);
		Thread.sleep(3000);
		Wait.sendKeys(fname, Fname);
		Wait.sendKeys(lname, Lname);
		Wait.click(save);
	}
	
}
