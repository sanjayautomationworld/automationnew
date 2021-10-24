package mavenbasic;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInTest {
	
	static WebDriver driver;
	
	static String url= "https://github.com/bonigarcia/webdrivermanager";
	
	static String name="hsds";

	public static void main(String[] args) {
		
		Cookie ck= new Cookie(name, url);
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver test=new ChromeDriver();
	
		 driver=new ChromeDriver();

		driver.get(url);
		
		driver.manage().deleteAllCookies();
		driver.manage().addCookie(ck);
		
		
		
		
		
		

	}

}
