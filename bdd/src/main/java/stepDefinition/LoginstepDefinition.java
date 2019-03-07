package stepDefinition;

import Pages.HomePage;
import Pages.LoginPage;
import TestBase.testBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginstepDefinition extends testBase{
	
	
		HomePage home;
		LoginPage lpage;

		
		
		 static testBase tbase;   
		
		@Given("^User already on login page$")
		public void user_already_on_login_page() {
			testBase.initialization();
			lpage = new LoginPage();
		}

		@When("^User enter username and password$")
		public void user_enter_username_and_password() {
			lpage.login1(prop.getProperty("username"), prop.getProperty("password"));
		}

		@When("^User click login button$")
		public void user_click_login_button(){
			lpage.clickLogin();
		}
		
		@When("^User close Browser$")
		public void User_close_Browser(){
			driver.quit();
		}
			

	}

	


	

