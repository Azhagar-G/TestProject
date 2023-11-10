package java_programs;

//import java.lang.reflect.Array;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectors { //class----> public/protected/private  - access modifier ,abstract & final  - Specifier, No return type, class Name
	//abstract class not able to create object
	
	{ //Static Block ---initialize, whenever create object for the class
		
		System.out.println("Static Block");
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//	driver.get("https://www.spicejet.com/");	
	
		this.Locators();  //this --->keyword for access inner class & variable
	//super ---> Keyword for access parent class & variable

	}
public String Locators() { //----> Static method can access without creating object--by calling method name in main class

	System.out.println("Css Selectors");
String a="return";
return a;
}

public static void main(String[] args) {
	CssSelectors m=new CssSelectors();
//	m.Locators();
}


}
