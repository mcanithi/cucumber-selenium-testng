package com.nithya.testing.stepdef;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.nithya.testing.UIMap.UIMap_googleHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GoogleHomePage {
	
	ScriptHelper helper;
	protected static WebDriver driver;
	//String searchString;
	
	public GoogleHomePage(ScriptHelper helper) {
		this.helper=helper;
	}
	
	@Given("^User is on (.*)$")
	public void userOnGoolgeHomePage(String url) {
		String pageUrl = helper.getDriver().getCurrentUrl();
		System.out.println("Google Home Page Title :"+ pageUrl);
		Assert.assertTrue(pageUrl.toLowerCase().contains(url.toLowerCase()));
		
	}
	@When("^search for (.*)$")
	public void search_ducks(String searchString) {
		WebElement element = helper.getDriver().findElement(UIMap_googleHomePage.txtSearchGoogle);
		element.sendKeys(searchString);
		helper.setSearchString(searchString); 
		element.submit();	
		
	}
	


}
