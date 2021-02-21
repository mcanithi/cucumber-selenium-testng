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
	
	public GoogleHomePage(ScriptHelper helper) {
		this.helper=helper;
	}
	
	@Given("User is on Google HomePage")
	public void userOnGoolgeHomePage() {
		String pageTitle = helper.getDriver().getTitle();
		System.out.println("Google Home Page Title :"+pageTitle);
		Assert.assertEquals(pageTitle, "Google");
		
	}
	@When("search ducks")
	public void search_ducks() throws InterruptedException {
		WebElement element = helper.getDriver().findElement(UIMap_googleHomePage.txtSearchGoogle);
		element.sendKeys("ducks");
		element.submit();	
		
	}
	


}
