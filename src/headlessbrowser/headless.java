package headlessbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class headless {
	
	public void head() {
		WebDriver driver=new HtmlUnitDriver();
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}
	
	
	
	public static void main(String[]args) {
		headless h=new headless();
		h.head();
	}

}
