package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.baseClass;
import pages.wikiHome;

public class wikiHome_stepdef extends baseClass{
	wikiHome homePage;
	
	@Given("^the user is on wikiHome page$")
	public void Wiki_HomePageCheck() throws Throwable {
		baseClass.setup();
		homePage = new wikiHome();
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(homePage.wikipedia));
		System.out.println("Page : "+homePage.wikipedia.getText());
	}
	
	@When("^the user enters value in searchbox$")
	public void user_enters_value_in_searchbox() throws Throwable {
		homePage = new wikiHome();
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(homePage.searchInput));
		homePage.searchInput.sendKeys("France");
	}
	
	@Then("^the user can see the typed in text$")
	public void user_can_see_the_typed_value_in_searchbox() throws Throwable {
		homePage = new wikiHome();
//		WebDriverWait wait = new WebDriverWait(driver, 3000);
//		wait.until(ExpectedConditions.visibilityOf(homePage.searchInput));
		Thread.sleep(2000);
		System.out.println("Page : "+homePage.searchInput.getText());
	}

}
