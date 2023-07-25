package login_step_def;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class pocruries {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.pocruises.com/");
//		Select dropdown= new Select(driver.findElement(By.xpath("//span[@class='dropdown-title']")));
	//	dropdown.selectByVisibleText("Caribbean");
	//	driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		driver.findElement(By.xpath("(//button[@class='filter-item item-container  destinations '])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Caribbean']")).click();
		Thread.sleep(3000);
		String[] n=driver.findElement(By.xpath("//div[@class='result-count']")).getAttribute("innerHTML").split(" ");
		
//		System.out.println(n[0]);
		
		driver.findElement(By.xpath("//li[@class='filter-border search-button']")).click();
		String[] r=driver.findElement(By.xpath("//div[@class='result-count']")).getAttribute("innerHTML").split(" ");
//		System.out.println(r[0]);
		Assert.assertEquals(n[0],r[0]);
		
//		if(Assert.assertEquals(n[0],r[0]);) {
			System.out.println("Search results are equal:"+n[0]+" results");
//		}
			driver.quit();
	}

}
