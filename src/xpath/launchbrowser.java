package xpath;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import library.data;

public class launchbrowser {
	public static WebDriver driver;
	public static void launchingbrowser() throws IOException
	{   
		data.datacalling();
		String chromedriver=data.prop.getProperty("chrome1");
		String chromepath=data.prop.getProperty("chrome2");
		String firefoxdriver=data.prop.getProperty("firefox1");
		String firefoxpath=data.prop.getProperty("firefox2");
		String iedriver=data.prop.getProperty("ie1");
		String iepath=data.prop.getProperty("ie2");
		String launchbrowser=data.prop.getProperty("browser");
		String launchurl=data.prop.getProperty("url");
		if(launchbrowser.equals("chrome"))
		{
			System.setProperty(chromedriver, chromepath);
			driver=new ChromeDriver();
		}
		else if(launchbrowser.equals("firefox"))
		{
			System.setProperty(firefoxdriver,firefoxpath);
			driver=new FirefoxDriver();
		}
		else if(launchbrowser.equals("ie"))
		{
			System.setProperty(iedriver,iepath);
			driver=new InternetExplorerDriver();
		}
		driver.get(launchurl);
		
		
	}

}


