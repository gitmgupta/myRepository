package createStagingActivities;
// import
import java.io.IOException;
import java.sql.Driver;
import java.util.NoSuchElementException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class delete {

	static WebDriver driver;
	@Test
	public void Delete() {

		System.setProperty("webdriver.chrime.driver", "D:\\Workspace\\Scandit\\executablefiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://scandium-staging.scandit.com/customer/activities");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("amogh.pednekar@swqaindia.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("swqa1234");
		driver.findElement(By.cssSelector("body div div form div.sc-login-button-pane  button")).click();
		
		}
	

public static void clickElementInGrid(String pageName, String tableName, String valueInRow, int columnNumber) throws Exception {
		  int totalRows = getGridRowCount(pageName, tableName);
		  int totalColumns = getGridColumnCount(pageName, tableName);
		  // LogUtility.log("total Rows = " + totalRows + " and totalCol = " + totalColumns);

		  for (int rowIndex = 1; rowIndex <= totalRows; rowIndex++) {

		   for (int colIndex = 1; colIndex <= totalColumns; colIndex++) {
		    String generatedXPathForColumn = getValueFor(pageName, tableName).concat("/tbody/tr[" + rowIndex + "]/td[" + colIndex + "]");
		    String valueInCell = driver.getElementDirectly(generatedXPathForColumn).getText();
		    if (valueInRow.equalsIgnoreCase(valueInCell)) {
		     String generatedXPathForEditColumn = ConfigurationProperty.getValueFor(pageName, tableName).concat("/tbody/tr[" + rowIndex + "]/td[" + columnNumber + "]/input");
		    //  LogUtility.log("generatedXPathForEditColumn = " + generatedXPathForEditColumn);
		     clickOnButton(generatedXPathForEditColumn);
		     break;
		    }
		   }
		  }
		  
public static int getGridColumnCount(String pageName, String tableName) throws NoSuchElementException, IOException {

			  String actualTableName = getValueFor(pageName, tableName).concat("/tbody/tr[1]/td");
			  return driver.getElementDirectly(actualTableName).size();
			 }

public static int getGridRowCount(String pageName, String tableName) throws Exception {
			  String actualTableName = getValueFor(pageName, tableName).concat("/tbody/tr");
			  return driver.getElementDirectly(actualTableName).size();
			 }

public WebElement getElementDirectly(String xPathLocation) throws NoSuchElementException {
	  return driver.findElement(By.xpath(xPathLocation));
	 }
		
	}


