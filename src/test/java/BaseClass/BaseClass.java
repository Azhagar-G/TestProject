package BaseClass;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	
	private void browserlaunch() {
		try {
			if(driver==null) {
			launchbrowser();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void launchbrowser() {
		WebDriverManager.chromedriver().setup();
	}
}
