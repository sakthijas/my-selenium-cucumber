package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.baseClass;

public class wikiHome extends baseClass{
	/* Page Factory-OR */
	@FindBy(css = "#searchInput")
	public static WebElement searchInput;

	@FindBy(css = "#www-wikipedia-org > h1 > div > div")
	public static WebElement wikipedia;
	
	// Initializing the Page Objects:
	public wikiHome() throws Throwable {
		PageFactory.initElements(driver, this);
	}

}
