package in.selenium.openbrowser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;

public class OpenAnyBrowser
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fs = new FileInputStream(".\\Config\\config.properties");
		Properties p = new Properties();
		p.load(fs);
		
		String browserName = p.getProperty("browsername");
		
		WebDriver webdriver = OpenAnyBrowser2.openBrowser(browserName);

		webdriver.get("https://www.facebook.com/");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please Enter the browser name : ");
//		String browserName = sc.next();
//		
//		WebDriver webdriver = OpenAnyBrowser2.openBrowser(browserName);
//		
//		//First way opening a URL
//		//webdriver.get("https://www.facebook.com/");
//		
//		//Second way opening a URL
//		Navigation n = webdriver.navigate();
//		n.to("https://www.facebook.com/");
//		
//		//Third way opening a URL
//		//webdriver.navigate().to("https://www.google.com");
//		
	}

}
