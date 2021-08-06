package com.StepDef;

import java.io.IOException;

//import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageFactory.MainpageFactory;

import conFigFile.ConFig;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver;
	
	@Given("^User can open any browser$")
	public void user_can_open_any_browser()   {
		System.setProperty("webdriver.chrome.driver", "C:./Driver/chromedriver.exe");
		driver = new ChromeDriver();
	  
	   
	}

	@Given("^User able to enter the URL$")
	public void user_able_to_enter_the_URL() throws IOException  {
	    driver.get(ConFig.getConfig("URL"));
	   
	}

	@When("^User able to click login button$")
	public void user_able_to_click_login_button()  {
		MainpageFactory obj= new MainpageFactory(driver);
		obj.getGetsiginbutton().click();
	   
	}

	@When("^User able to enter username$")
	public void user_able_to_enter_username() throws IOException  {
		MainpageFactory obj= new MainpageFactory(driver);
		obj.getGetusername().sendKeys(ConFig.getConfig("User"));
	   
		
	}

	@When("^User able to enter the pasword$")
	public void user_able_to_enter_the_pasword() throws IOException  {
		MainpageFactory obj= new MainpageFactory(driver);
		obj.getGetpassword().sendKeys(ConFig.getConfig("PW"));
	   
	}

	@When("^User able to click on Submit button$")
	public void user_able_to_click_on_Submit_button() throws InterruptedException  {
		MainpageFactory obj= new MainpageFactory(driver);
		Thread.sleep(4000);
		obj.getGetsubmit().click();
	   
	}

	@Then("^User able to verify sucessful login$")
	public void user_able_to_verify_sucessful_login()  {
	    
	   
	}

	@Then("^User can see his name in the homepage$")
	public void user_can_see_his_name_in_the_homepage()  {
	    
	   
	}
}
