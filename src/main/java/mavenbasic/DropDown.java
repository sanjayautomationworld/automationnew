package mavenbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		 driver.get("https://www.opencart.com/index.php?route=account/register");
		 
		 WebElement element=driver.findElement(By.id("input-country"));
		 
		 Select drpcount=new Select(element);
		 drpcount.selectByVisibleText("")
		 
		 
		 List<WebElement>option =element.get
		 
		 
	
		

	}

}
