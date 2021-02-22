package com.nithya.testing.stepdef;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.nithya.testing.UIMap.UIMap_googleSearchResultListPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class GoogleSearchResultListPage  {
	
	private ScriptHelper helper;
	protected static WebDriver driver;
	//String searchString;
	
	public GoogleSearchResultListPage(ScriptHelper helper) {
		this.helper = helper;
	}
	
	@Then("verify the search result")
	public void verify_searchResult() {
		WebDriverWait wait = new WebDriverWait(helper.getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(UIMap_googleSearchResultListPage.spanTxt));
		List<WebElement> elements = helper.getDriver().findElements(UIMap_googleSearchResultListPage.spanTxt);
		for (WebElement element: elements) {
			System.out.println(element.getText());
			String txt = element.getText();
			String searchString = helper.getSearchString();
			
			if (txt.toLowerCase().contains(searchString)){
				Assert.assertTrue(true);
				System.out.println("Search result contain "+ searchString);
			}
			else 
				Assert.assertFalse(true, "Search Result not contain Duck");
		}
		
	}
	@And("close browser")
	public void closeBrowser() {
		helper.getDriver().close();
	}

}
