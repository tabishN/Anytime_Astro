package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.WebDriverUtility;

public class LoginPage extends WebDriverUtility {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	 @FindBy(xpath="//span[text()='Sign In ']")
	 private WebElement signinlink;
	 
	 @FindBy(xpath="//a[text()='Login_Via_Email']")
	 private WebElement loginViaEmail;
	 
	 @FindBy(id="txtLoginEmail")
	 private WebElement emailtxt;
	 
	 @FindBy(id="Password")
	 private WebElement passwordtxt;
	 
	 @FindBy(id="login")
	 private WebElement loginbtn;
	 
	
	

	public WebElement getSigninlink() {
		return signinlink;
	}

	public WebElement getLoginViaEmail() {
		return loginViaEmail;
	}

	public WebElement getEmailtxt() {
		return emailtxt;
	}

	public WebElement getPasswordtxt() {
		return passwordtxt;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}


	 public void signin() {
		 signinlink.click();
	 }
	
	 public void loginEmail() throws InterruptedException
	 {
		 Thread.sleep(2000);
			loginViaEmail.click();
	 }
	public void login(String username, String password, WebDriver driver) {	
	
		emailtxt.sendKeys(username);
		passwordtxt.sendKeys(password);
		loginbtn.click();
	}
	
	 
	 

	 
	 
	
	
	
	
	

}
