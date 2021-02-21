package com.nithya.testing.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptHelper {
	
	private final WebDriver driver;

	public ScriptHelper(){
		System.setProperty("webdriver.gecko.driver", "/home/nit/Desktop/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	public WebDriver getDriver() {
		return driver;
	}
	


}
