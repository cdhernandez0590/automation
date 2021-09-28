package StepDefinitions;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.SpendAndSave;
import seleniumgluecode.Hooks;

@SuppressWarnings("deprecation")
public class Steps 
{
	private WebDriver driver = Hooks.getDriver();
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	String titleHomePage = "Aspiration | Green Financial Services";
	Assert.assertEquals(titleHomePage, driver.getTitle());
	
		
	}

	@When("User clicks on Save and Spend link")
	public void user_clicks_on_save_and_spend_link() throws Exception {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnSpendAndSaveLink();
		}

	@Then("User should be redirected to Spend and Save page")
	public void user_should_be_redirected_to_spend_and_save_page() {
		String titleSpndSvPage = "Cash Management Services - Investing & Retirement Planning | Aspiration";
		SpendAndSave spendAndSavePage = new SpendAndSave(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertEquals(titleSpndSvPage, driver.getTitle());
		
		
	}

}
