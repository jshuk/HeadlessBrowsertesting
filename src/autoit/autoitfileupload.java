package autoit;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class autoitfileupload {


	
	
public static void main(String[]args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\Testing\\setup\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/IBM_ADMIN/Desktop/fileupload.html");
	driver.findElement(By.xpath("//*[@type='file']")).click();
	Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\Autoit\\fileupload.exe");
	
}
}
