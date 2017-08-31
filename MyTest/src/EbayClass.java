import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * After clicking on gift cards check that on the left side there are these sections. 
 * Dont want  is under these. Just check these are present. And fail the test case for the last one since spelling is incorrect
 * 1. Sales & Events
2. eBay Gift Cards
3. Featured Brands
4.Shop by Category
5.Shop by Recipient
6.Shop by Occaxxxxsion

 */

public class EbayClass {
//ebay motors click by xPath
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/Users/kpendelabalavenk/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//*[@id='w0-container']/li[4]")).click();

	}

}
