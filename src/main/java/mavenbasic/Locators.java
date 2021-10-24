package mavenbasic;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	
	static WebDriver driver;
	
	
	public static void xpathchrome()
	{
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.linkedin.com/signup/cold-join?trk=guest_homepage-basic_nav-header-join");
	
		
		
		try {
			/// weelement 
		} 
		catch (NoSuchElementException sanjay) {
			
			
			System.out.println(sanjay);
		}
/*		
 * 
 * 
 * 

 * 
		id
		na,me
		linktext
		partial text
		Classname
		tagname attribute 
		<input> type = text
		button type = cancel & submit		
	<a>  src TEXT ima
		
		
		Xpath
		Css*/
	}

	public static void main(String[] args) {
		

	}

}
