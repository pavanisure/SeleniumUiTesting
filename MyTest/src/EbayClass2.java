import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayClass2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/Users/kpendelabalavenk/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		
//**************************	1) sales and events*****************************	
		System.out.println(driver.findElement(By.className("nav-wrapper")).getText());
		System.out.println(driver.findElement(By.className("nav-wrapper")).getText().contains("Sales & Events"));
		System.out.println(driver.findElement(By.className("nav-wrapper")).isDisplayed());
		
		
//*************************2) ebay gift cards********************************		
		System.out.println(driver.findElement(By.xpath("//div[@_sp='p2051541.m4646.l1']/li/h2/div")).getText());

		System.out.println(driver.findElement(By.xpath("//div[@_sp='p2051541.m4646.l1']/li/h2/div")).getText().contains("eBay Gift Cards"));
		
		System.out.println(driver.findElement(By.xpath("//div[@_sp='p2051541.m4646.l1']/li/h2/div")).isDisplayed());
	
//************************3)Featured Brands************************************ 
		System.out.println(driver.findElement(By.xpath("//div[@_sp='p2051541.m4643.l1']/li/h2/div")).getText());

		System.out.println(driver.findElement(By.xpath("//div[@_sp='p2051541.m4643.l1']/li/h2/div")).getText().contains("Featured Brands"));
		
		System.out.println(driver.findElement(By.xpath("//div[@_sp='p2051541.m4643.l1']/li/h2/div")).isDisplayed());

//************************4)	Shop by category*************************************
		System.out.println(driver.findElement(By.xpath("//div[@_sp='p2051541.m4646.l2']/li/h2/div")).getText());

		System.out.println(driver.findElement(By.xpath("//div[@_sp='p2051541.m4646.l2']/li/h2/div")).getText().contains("Shop by Category"));
		
		System.out.println(driver.findElement(By.xpath("//div[@_sp='p2051541.m4646.l2']/li/h2/div")).isDisplayed());

//***********************5)Shop by Recipient***************************************
		System.out.println(driver.findElement(By.xpath("//div[@_sp='p2051541.m4646.l3']/li/h2/div")).getText());

		System.out.println(driver.findElement(By.xpath("//div[@_sp='p2051541.m4646.l3']/li/h2/div")).getText().contains("Shop by Recipient"));
		
		System.out.println(driver.findElement(By.xpath("//div[@_sp='p2051541.m4646.l3']/li/h2/div")).isDisplayed());

//*********************** 6)Shop by Occasion***************************************
		System.out.println(driver.findElement(By.xpath("//div[@_sp='p2051541.m4646.l4']/li/h2/div")).getText());

		System.out.println(driver.findElement(By.xpath("//div[@_sp='p2051541.m4646.l4']/li/h2/div")).getText().contains("Shop by Occaxxxxsion"));
		
		System.out.println(driver.findElement(By.xpath("//div[@_sp='p2051541.m4646.l4']/li/h2/div")).isDisplayed());

	
	}

}
