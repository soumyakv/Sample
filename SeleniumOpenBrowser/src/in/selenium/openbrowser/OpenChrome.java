package in.selenium.openbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome 
{
	public static void main(String[] args)
	{
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTrainingByJitendra\\Downloads\\SeleniumSoftwares\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("http://newtours.demoaut.com/");
	}
}
