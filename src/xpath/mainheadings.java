package xpath;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import library.data;

	public class mainheadings extends launchbrowser {
		public static void mainheadinglist()
		{
			String testing=data.prop.getProperty("xpathheadings");
			List<WebElement>list=driver.findElements(By.xpath(testing));
			for(WebElement headings:list)
			{
			System.out.println(headings.getText());
			}
			
		}
		

}
