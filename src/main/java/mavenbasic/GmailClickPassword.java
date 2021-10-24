package mavenbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailClickPassword {
	
static WebElement element;

	public static void main(String[] args) {
	
		
	WebDriverManager.firefoxdriver().setup();
	
	WebDriver driver=new FirefoxDriver();
	
	driver.manage().deleteAllCookies();
	
	
	 driver.get("https://accounts.google.com/AddSession/identifier?hl=en&continue=https%3A%2F%2Fmail.google.com%2Fmail&service=mail&ec=GAlAFw&flowName=GlifWebSignIn&flowEntry=AddSession");

element = driver.findElement(By.id("identifierId"));
element.sendKeys("sanjaysigh46@gmail.com");



element = driver.findElement(By.className("VfPpkd-vQzf8d"));
element.click();

/*
 * driver.findElement(By.name("password")).sendKeys("sanjay@123");
 * driver.findElement(By.cssSelector("#c11"));
 * driver.findElement(By.cssSelector("#passwordNext")).click();
 * 
 * 
 */
	
	
	

	}

}
