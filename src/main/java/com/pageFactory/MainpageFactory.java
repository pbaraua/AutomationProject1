package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainpageFactory {
	
	public MainpageFactory(WebDriver driver) {
		//PageFactory.initElements(driver,);
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath ="//*[@class='login']")
	private WebElement getsiginbutton;
	@FindBy (xpath ="//*[@id='email']")
	private WebElement getusername;
	@FindBy (xpath ="//*[@id='passwd']")
	private WebElement getpassword;
	@FindBy (xpath ="//*[@type='submit']")
	private WebElement getsubmit;
	
	@FindBy (xpath ="(//*[@title='Dresses'])[2]")
	private WebElement getDresses;
	@FindBy (xpath ="(//*[@class='sf-with-ul'])[4]")
	private WebElement getcolor;
	@FindBy (xpath ="(//*[@title='Printed Summer Dress'])[5]")
	private WebElement getSummerDress;
	public WebElement getGetsiginbutton() {
		return getsiginbutton;
	}
	public WebElement getGetusername() {
		return getusername;
	}
	public WebElement getGetpassword() {
		return getpassword;
	}
	public WebElement getGetsubmit() {
		return getsubmit;
	}
	public WebElement getGetDresses() {
		return getDresses;
	}
	public WebElement getGetcolor() {
		return getcolor;
	}
	public WebElement getGetSummerDress() {
		return getSummerDress;
	}
	
		
	}

