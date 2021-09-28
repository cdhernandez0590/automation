package seleniumgluecode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import browser_manager.DriverManagerFactory;
import browser_manager.driverType;
import dataProvider.ConfigFileReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks
{
	
private static WebDriver driver;
ConfigFileReader configFileReader;
private browser_manager.DriverManager driverManager;

    @Before
    public void setUp()
    {
        //DriverManager = DriverManagerFactory.getManager(driverType.CHROME);
    	
    	driverManager = DriverManagerFactory.getManager(driverType.CHROME);
    	driver = driverManager.getDriver();
    	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	driver.get(configFileReader.getApplicationUrl());
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