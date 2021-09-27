package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	@FindBy(xpath = "//a[contains(@class, 'Element-sc-1dc3ws0-0 Link__StyledLink-sc-17puyxl-0 eklGNJ giYPMc atom-link') and normalize-space(text()) = 'Spend & Save']")
	private WebElement SpendAndSave_btn;
	@FindBy(xpath = "//a[contains(@class, 'Element-sc-1dc3ws0-0 Link__StyledLink-sc-17puyxl-0 eklGNJ giYPMc atom-link') and normalize-space(text()) = 'Credit']")
	private WebElement Credit_btn;
	@FindBy(xpath = "//a[contains(@class, 'Element-sc-1dc3ws0-0 Link__StyledLink-sc-17puyxl-0 eklGNJ giYPMc atom-link') and normalize-space(text()) = 'Who We Are']']")
	private WebElement WhoWeAre_btn;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	public void clickOnSpendAndSaveLink() throws Exception
	{
		this.click(SpendAndSave_btn);
	}
}
