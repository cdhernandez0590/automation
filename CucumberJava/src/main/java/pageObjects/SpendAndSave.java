package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpendAndSave extends BasePage
{
	WebDriver driver;
	public SpendAndSave(WebDriver driver)
	{
		super(driver);
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------ASPIRATION CARD--------------------------------------------------------------------------------------------------
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//div[@class='card-original']")
	private WebElement aspirationOriginalCard_img;
	@FindBy(xpath = "//h2[normalize-space(text())='Aspiration']")
	private WebElement aspirationCard_Text;
	@FindBy(xpath = "//h3[contains(text(), 'Pay What Is Fair')]")
	private WebElement aspirationPayWhatIsFare_Text;
	@FindBy(xpath = "(//li[contains(text(), 'fund fossil fuel exploration or production')])[1]")
	private WebElement aspirationDeposits_Text;
	@FindBy(xpath = "(//li[contains(text(), '55,000 free in-network ATMs')])[1]")
	private WebElement aspirationATMs_Text;
	@FindBy(xpath = "//li[contains(text(), ' 3-5% cash back on Conscience Coalition purchases')]")
	private WebElement aspirationCashBack_Text;
	@FindBy(xpath = "//li[contains(text(), ' 3-5% cash back on Conscience Coalition purchases')]//following-sibling::i[@ng-click='showInfoConscienceCoalition()']")
	private WebElement aspirationCoalitionPurchases_btn;
	@FindBy(xpath = "(//li[contains(text(), 'Personal impact score to help you shop to match your values')])[1]")
	private WebElement aspirationPersonalImpact_Text;
	@FindBy(xpath = "(//li[contains(text(), 'Option to plant a tree with every roundup')])[1]")
	private WebElement aspirationOptionToPlant_Text;
	@FindBy(xpath = "(//li[contains(text(), 'Get paid up to 2 days early')])[1]")
	private WebElement aspirationGetPaid_Text;
	@FindBy(xpath = "//button[@ng-click='getAspirationOriginal()']")
	private WebElement getAspiration_btn;

	public void clickASPCoalition_button()
	{
		aspirationCoalitionPurchases_btn.click();
	}

	public void clickgetAspiration_button()
	{
		getAspiration_btn.click();
	}

	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------ASPIRATION PLUS CARD--------------------------------------------------------------------------------------------------
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//div[@class='card-plus']")
	private WebElement aspirationPlusCard_img;
	@FindBy(xpath = "//li[contains(text(), 'Up to 1.00% APY on your savings')]")
	private WebElement aspirationPlusSavings_Text;
	@FindBy(xpath = "//li[contains(text(), ' Carbon offsets for all your gas purchases with Planet Protection')]")
	private WebElement aspirationPlusCarbonOffsets_Text;
	@FindBy(xpath = "//i[@ng-click='showInfoPlanetProtection()']")
	private WebElement aspirationPlusCarbonOffsetsinfo_btn;
	@FindBy(xpath = "//h2[normalize-space(text())='Aspiration Plus']")
	private WebElement aspirationPlusCard_Text;
	@FindBy(xpath = "//h3[contains(@class, 'ng-binding') and contains(text(), ' $5.99/mo.(billed annually)')]")
	private WebElement aspirationPlusbilledAnnually_Text;
	@FindBy(xpath = "(//li[contains(text(), 'fund fossil fuel exploration or production')])[2]")
	private WebElement aspirationPlusDeposit_Text;
	@FindBy(xpath = "(//li[contains(text(), '55,000 free in-network ATMs')])[2]")
	private WebElement aspirationPlusATMs_Text;
	@FindBy(xpath = "//b[normalize-space(text())='10% cash back']")
	private WebElement aspirationPlus10percentCashBack_Text;
	@FindBy(xpath = "//li[contains(text(), ' on Conscience Coalition purchases')]//following-sibling::i[@ng-click='showInfoConscienceCoalition()']")
	private WebElement aspirationPlusCoalitionPurchases_btn;
	@FindBy(xpath = "(//li[contains(text(), 'Personal impact score to help you shop to match your values')])[2]")
	private WebElement aspirationPlusPersonalImpact_Text;
	@FindBy(xpath = "(//li[contains(text(), 'Option to plant a tree with every roundup')])[2]")
	private WebElement aspirationPlusOptionToPlant_Text;
	@FindBy(xpath = "(//li[contains(text(), 'Get paid up to 2 days early')])[2]")
	private WebElement aspiraPlustionGetPaid_Text;
	@FindBy(xpath = "//button[@ng-click='getAspirationPlus()']")
	private WebElement getAspirationPlus_btn;
	public void clickAspPlusCoalition_btn()
	{
		aspirationPlusCoalitionPurchases_btn .click();
	}
	public void clickAspPlusCarbonOffsetInfo_btn()
	{
		aspirationPlusCarbonOffsetsinfo_btn .click();
	}
	public void clickgetSApirationPlus_button()
	{
		getAspirationPlus_btn.click();
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------INVESTNG--------------------------------------------------------------------------------------------------
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//*[normalize-space(text())='Investing']")
	private WebElement investingTitle_Text;
}
