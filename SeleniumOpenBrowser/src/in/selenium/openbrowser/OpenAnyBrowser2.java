package in.selenium.openbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class OpenAnyBrowser2 
{
	public static WebDriver openBrowser(String bn)
	{
		if(bn.equalsIgnoreCase("chrome"))
		{
			//Open Browser
			System.setProperty("webdriver.chrome.driver", ".\\AllBrowsers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			
			

//			Options o = driver.manage();
//			Window w = o.window();
//			w.maximize();
			
			//The above 3 lines can be written in a single line like below
			driver.manage().window().maximize();
			
			return driver;			
			
		}
		else if(bn.equalsIgnoreCase("firefox"))
		{
			//Open Browser
			System.setProperty("webdriver.gecko.driver", ".\\AllBrowsers\\geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			return driver;
		}
		else if(bn.equalsIgnoreCase("Internet Explorer") || bn.equalsIgnoreCase("ie") || bn.equalsIgnoreCase("explorer"))
		{
			//Open Browser
			System.setProperty("webdriver.ie.driver", ".\\AllBrowsers\\IEDriverServer.exe");
			InternetExplorerDriver driver = new InternetExplorerDriver();
			return driver;
		}
		else if(bn.equalsIgnoreCase("phantom"))
		{
			//Open Browser
			System.setProperty("phantomjs.binary.driver", ".\\AllBrowsers\\phantomjs.exe");
			PhantomJSDriver driver = new PhantomJSDriver();
			return driver;
		}
		return null;
	}
}
