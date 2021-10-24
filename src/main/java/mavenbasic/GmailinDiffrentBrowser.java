package mavenbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailinDiffrentBrowser {
	
	static WebElement element;

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().deleteAllCookies();
		element=driver.findElement(By.id("identifierId"));
		element.sendKeys("Sk8332324@gmail.com");
		element=driver.findElement(By.className("VfPpkd-vQzf8d"));
		element.click();
		driver.close();
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/AddSession/identifier?hl=en&continue=https%3A%2F%2Fmail.google.com&service=mail&ec=GAlAFw&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().deleteAllCookies();
		element=driver.findElement(By.id("identifierId"));
		element.sendKeys("Sk8332324@gmail.com");
		element=driver.findElement(By.className("VfPpkd-vQzf8d"));
		element.click();
		driver.close();
		
		WebDriverManager.edgedriver().setup();
	     driver=new EdgeDriver();
	     driver.get("https://accounts.google.com/AddSession/identifier?hl=en&continue=https%3A%2F%2Fmail.google.com&service=mail&ec=GAlAFw&flowName=GlifWebSignIn&flowEntry=AddSession");
		 driver.manage().deleteAllCookies();
		 element=driver.findElement(By.id("identifierId"));
		 element.sendKeys("Sk8332324@gmail.com");
		 element=driver.findElement(By.className("VfPpkd-vQzf8d"));
		 element.click();
		 driver.close();

	}

}
