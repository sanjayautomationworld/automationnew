package mavenbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserMethodLaunch {

	static WebDriver driver;

	public static void chrome() throws InterruptedException 
	{ 
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(); 
		
		
		driver.manage().deleteAllCookies();
				driver.manage().window().maximize();


				
				String urlSQ = "https://www.google.com/";
				driver.get(urlSQ);
				
				String s1 = "https://www.google.com/";
			
				// diference between 
				
			Thread.sleep(2000);

				driver.navigate().to(	"https://www.amazon.com/"); 
				driver.navigate().refresh();
				driver.navigate().to(	"https://www.flipkart.com/");
				
				
				driver.get(s1);

				driver.navigate().back();
				System.out.println(driver.getTitle());
				
				
				driver.navigate().back();
				System.out.println(driver.getTitle());
				
				driver.navigate().forward();
				System.out.println(driver.getTitle());
				
				driver.navigate().forward();
				System.out.println(driver.getTitle());
	}

	public static void main(String[] args) throws InterruptedException {

		chrome();
		//firefox();

	}

}
