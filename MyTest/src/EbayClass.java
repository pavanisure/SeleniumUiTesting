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

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/Users/kpendelabalavenk/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		//driver.get("http://test1.absofttrainings.com/shop");
		//WebElement findElement=driver.findElement(By.linkText("Motors"));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//findElement.click();
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Motors")));
		//wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Motors")));
		//driver.findElement(By.className("hl-cat-nav_js-tab")).click();
		//driver.findElement(By.xpath("//li[@class='hl-cat-nav_js-tab' & @href='https://www.ebay.com/motors']"));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(100);
//		List<WebElement> elems = driver.findElements(By.cssSelector("ul.hl-cat-nav__container>li.hl-cat-nav__js-tab> div>a"));
//		 elems.get(3).click();//for the 3rd element
		//driver.findElement(By.cssSelector("[href*='/motors']")).click();
		driver.findElement(By.xpath("//*[@id='w0-container']/li[4]")).click();
		//driver.findElement(By.partialLinkText("Gift Cards")).click();

	}

}
