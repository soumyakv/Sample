package in.selenium.openbrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFox 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumTrainingByJitendra\\Downloads\\SeleniumSoftwares\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
	}
}
