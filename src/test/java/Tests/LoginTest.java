package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import BaseTests.BaseTest;
import Pages.HomePage;
import Pages.Login.LoginPage;

public class LoginTest extends BaseTest {

	
	@Test
	public void loginpageTest() {
		HomePage homepage= page.getInstance(LoginPage.class).doLogin("demo@demo.com", "demo2018");
		assertTrue(homepage.EstoyHomePage());
	}
	
}
