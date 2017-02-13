package createStagingActivities;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dynamicXpath {

	@Test
	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Workspace\\Scandit\\executablefiles\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.yahoo.com");
		driver.findElement(By.xpath("//*[@id='UHSearchBox']")).sendKeys("java");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);
	    List<WebElement> list = driver.findElements(By.xpath("//*[starts-with(@id,'yui_3_1')]/li/a"));
	    Thread.sleep(5000);
	    System.out.println(list.size());
	    
		String word = "javatpoint";
	    
	    for (WebElement i:list)
	    {
	    	if(word.equalsIgnoreCase(i.getText().trim())){
	    	i.click();
	    	
	    break;
		
//		try
//		{
//		driver.get("someurl");
//		}
//		catch(UnreachableBrowserException e){}
		}
		
	}

	}
}
