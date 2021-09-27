package browser_manager;

public class DriverManagerFactory 
{
	public static DriverManager getManager(driverType type) 
	{
		DriverManager driverManager = null;
		
		switch (type) 
		{
		case CHROME:
			driverManager = new ChromeDriverManager();
			break;
		case FIREFOX:
			driverManager = new FirefoxDriverManager();
			break;
		}
		return driverManager;
	} 
}
