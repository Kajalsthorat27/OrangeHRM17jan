package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilesLayer.Wait;

public class LoginPage extends BaseClass
{
	@FindBy(name="username")
	private WebElement username;  
	
	@FindBy(name="password")
	private WebElement  password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginFunctionality(String UserName, String Password)
	{
		Wait.sendKeys(username, UserName);
		Wait.sendKeys(password, Password);
	}
	public void loginButton()
	{
		Wait.click(loginBtn);
	}
}
