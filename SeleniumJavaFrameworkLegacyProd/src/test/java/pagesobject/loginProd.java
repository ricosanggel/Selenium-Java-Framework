package pagesobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginProd {
	
	private static WebElement element= null;
	
	//Member.Partaiperindo button
	public static WebElement button_login (WebDriver driver) {
		
			element = driver.findElement (By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/a[2]/button"));
		return element;
		
	
	}
	public static WebElement input_username (WebDriver driver) {
			
			element = driver.findElement (By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div[1]/input"));
		return element;
	}
	public static WebElement input_password (WebDriver driver) {
				
			element = driver.findElement (By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div[2]/input"));
		return element;	
	}
	
	public static WebElement button_login2 (WebDriver driver) {
					
					element = driver.findElement (By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/button"));
		return element;				
	}
}
