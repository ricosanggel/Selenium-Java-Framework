package TsuitesPP;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagesobject.loginProd;
import pagesobject.ppProd;
import pagesobject.registerProd;

public class RegressionPP {


	ChromeDriver driver;

	@BeforeTest
	public void setUpTest () {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ProBook\\eclipse-workspace\\SeleniumJavaFrameworkLegacy\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test (priority = 1)
	public void login() throws InterruptedException {	
		WebDriver driver = new ChromeDriver();
			driver.get("https://member.partaiperindo.com/?_gl=1*192iyxn*_ga*MTY3NzI2MDQ5OS4xNjQwMTQxNjAy*_ga_F1L7J6WSC2*MTY0MjEzMjQyNy4zNS4wLjE2NDIxMzI0MjcuMA..#/");
			driver.manage().window().maximize();
			loginProd.button_login(driver).click();
				Thread.sleep(500);
			loginProd.input_username(driver).sendKeys("081223257356");
			loginProd.input_password(driver).sendKeys("Gagger_12345");
				Thread.sleep(500);
			loginProd.button_login2(driver).click();		
	}
	@Test (priority = 2)
	public void searchAgenda() throws InterruptedException, AWTException {	
			WebDriver driver = new ChromeDriver();
			driver.get("http://partaiperindo.com");
			driver.manage().window().maximize();
				Thread.sleep(1000);
			ppProd.search_button(driver).click();
			ppProd.search_textfield(driver).sendKeys("perindo");
			try {
			    Robot robot = new Robot();
			    robot.keyPress(KeyEvent.VK_ENTER);
			    robot.keyRelease(KeyEvent.VK_ENTER);
			    robot.delay(200);
				} finally {					
				}
			Thread.sleep(5000);
			ppProd.Agenda(driver).click();
	}
	@Test (priority = 3)
	public void searchAksi() throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
			driver.get("http://partaiperindo.com");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			ppProd.search_button(driver).click();
			ppProd.search_textfield(driver).sendKeys("perindo");
		try {
		    Robot robot = new Robot();
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
		    robot.delay(200);
				} finally {					
				}
			Thread.sleep(5000);
			ppProd.Aksi(driver).click();
	}
	@Test (priority = 4)
	public void register() throws InterruptedException {	
		WebDriver driver = new ChromeDriver();
			driver.get("https://member.partaiperindo.com/?_gl=1*192iyxn*_ga*MTY3NzI2MDQ5OS4xNjQwMTQxNjAy*_ga_F1L7J6WSC2*MTY0MjEzMjQyNy4zNS4wLjE2NDIxMzI0MjcuMA..#/");
			driver.manage().window().maximize();
			registerProd.button_register(driver).click();
				Thread.sleep(1000);
			registerProd.input_Phone_Number(driver).sendKeys("081382648636");
			registerProd.input_password(driver).sendKeys("Gagger_12345");
			registerProd.input_Konfirmasi_password(driver).sendKeys("Gagger_12345");
			registerProd.checkbox(driver).click();
				Thread.sleep(500);
			registerProd.button_register2(driver).click();
	}
	
	@AfterTest
	public void  tearDownTest()	{
		driver.quit();
	}
}
