package mavenbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestOct132021 {

	static WebDriver  driver;
	
	
	public static void chromeshow()
	{
		System.out.println("dshajja");
	}
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		 driver.get("https://www.amazon.com/");
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.xyz.com/");
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		System.out.println("all operations are done");
		chromeshow();
		driver.close();
		
		
		
	
		
		
	

	}

}
