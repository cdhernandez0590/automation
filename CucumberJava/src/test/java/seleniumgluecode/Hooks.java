package seleniumgluecode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import browser_manager.DriverManagerFactory;
import browser_manager.driverType;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks
{
	
private static WebDriver driver;
private browser_manager.DriverManager driverManager;

    @Before
    public void setUp()
    {
        //DriverManager = DriverManagerFactory.getManager(driverType.CHROME);
    	
    	driverManager = DriverManagerFactory.getManager(driverType.CHROME);
    	driver = driverManager.getDriver();
    	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	driver.get("https://www.aspiration.com");
    	driver.manage().window().maximize();
        
    }
    @After
    public void tearDown()
    {
        driverManager.quitDriver();
    }

    public static WebDriver getDriver()
    {
        return driver;
    }
}