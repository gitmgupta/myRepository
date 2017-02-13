package createStagingActivities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class stockTaking {

	@Test
	public void stocktaking() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Workspace\\Scandit\\executablefiles\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://scandium-staging.scandit.com/customer/activities");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("amogh.pednekar@swqaindia.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("swqa1234");
		driver.findElement(By.cssSelector("body div div form div.sc-login-button-pane  button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
//		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/ul/li[3]/a/span")).click();
//		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/ul/li[2]/a/span"));
		
		System.out.println("click on activities");
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
//		jse.executeScript("window.scrollBy(0," + 800 + ")", "");
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div/div/div[4]/div[1]/div")).getText();
		driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div/div/div[4]/div[1]/div")).click();
		System.out.println("Click on stock taking");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("Stock Taking");
		driver.findElement(By.xpath(".//*[@id='activity_translation_5_name']")).sendKeys("Stock Taking_German");
		driver.findElement(By.xpath(".//*[@id='activity_translation_6_name']")).sendKeys("Stock Taking_English");
		driver.findElement(By.xpath(".//*[@id='activity_translation_7_name']")).sendKeys("Stock Taking_Italian");
		driver.findElement(By.cssSelector("#description")).sendKeys("Stock Taking");
		driver.findElement(By.xpath(".//*[@id='activity_translation_5_description']")).sendKeys("Stock Taking");
		driver.findElement(By.xpath(".//*[@id='activity_translation_6_description']")).sendKeys("Stock Taking");
		driver.findElement(By.xpath(".//*[@id='activity_translation_7_description']")).sendKeys("Stock Taking");
		driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[3]/form/div/div/div[3]/button")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[4]/div")).getText();
		
		System.out.println("list--------------------------1");
		
		List<WebElement> list = driver.findElements(By.xpath("html/body/div[1]/div/div[2]/div[4]/div/table/tbody/tr"));
		
		System.out.println("list--------------------------");
		
		list.size();
		System.out.println(list.size());
		
	}

}
