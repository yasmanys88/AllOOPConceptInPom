package Pages.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BasePages.BasePage;
import Pages.HomePage;

public class LoginPage extends BasePage {

	By emaillogin = By.xpath("//input[@name='email']");
	By passlogin = By.xpath("//input[@name='password']");
	By buttonlogin = By.tagName("//button");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public HomePage doLogin(String user, String pass) {
		getEmaillogin().sendKeys(user);
		getPasslogin().sendKeys(pass);
		getButtonlogin().click();
		return getInstance(HomePage.class);
	}
	
	private WebElement getButtonlogin() {
		return getElement(buttonlogin);
	}

	private WebElement getEmaillogin() {
		return getElement(emaillogin);
	}

	private WebElement getPasslogin() {
		return getElement(passlogin);
	}


}
