package com.nithya.testing.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptHelper {
	
	private final WebDriver driver;
	private String searchString;

	public ScriptHelper(){
		System.setProperty("webdriver.gecko.driver", "/home/nit/Desktop/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	public WebDriver getDriver() {
		return driver;
	}
	public String getSearchString() {
		return searchString;
	}
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
	


}
