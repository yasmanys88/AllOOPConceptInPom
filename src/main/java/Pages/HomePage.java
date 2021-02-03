package Pages;

import org.openqa.selenium.WebDriver;

import BasePages.BasePage;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public Boolean EstoyHomePage() {
		return true;
	}
}
