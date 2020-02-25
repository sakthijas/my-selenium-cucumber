package stepDefs;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import pages.wikiHome;
import utils.baseClass;

public class wikiFrance_stepdef extends baseClass{
	wikiHome homePage;
	@Then("^the user hits enter and see the page related to France$")
	public void user_can_see_the_typed_value_in_searchbox() throws Throwable {
		homePage = new wikiHome();
		Thread.sleep(2000);
		homePage.searchInput.sendKeys(Keys.RETURN);
		
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.titleContains("France"));
	}

}
