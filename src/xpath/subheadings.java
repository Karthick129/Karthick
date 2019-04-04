package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import library.data;

public class subheadings extends mainheadings{
	public static void sublist()
	{
	System.out.println("*****************************");
	System.out.println("Subheadings are:");
	String xpath=data.prop.getProperty("xpathsubheadings");
	List<WebElement> sublist=driver.findElements(By.xpath(xpath));
	for(WebElement s:sublist)
	{
		System.out.println(s.getText());
	}
	driver.quit();
	}
	

}
