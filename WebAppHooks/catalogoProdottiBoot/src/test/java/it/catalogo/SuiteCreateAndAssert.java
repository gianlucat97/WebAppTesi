
//File risulta attualmente aggiornato per webdriver chrome headless!
package it.catalogo.test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class SuiteCreateAndAssert {
private static WebDriver driver;
private boolean acceptNextAlert = true;
private static StringBuffer verificationErrors = new StringBuffer();

	  @BeforeAll
	  public static void setUp() throws Exception {
		
		  // Init chromedriver
		  String chromeDriverPath = "/home/runner/work/WebAppTesi/WebAppTesi/chromedriver_v94_linux64/chromedriver";
		  System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		  System.setProperty("webdriver.chrome.whitelistedIps", "");
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--no-sandbox","--ignore-certificate-errors");
		  driver = new ChromeDriver(options);  
		  
		  
		  
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
  @Test
  public void testSuiteCreateAndAssert_release_1_1() throws Exception {
    driver.get("http://localhost:8080/prodotti");
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).clear();
    driver.findElement(By.id("nome")).sendKeys("Il ritratto di Dorian Gray");
    driver.findElement(By.id("descrizione")).click();
    driver.findElement(By.id("descrizione")).clear();
    driver.findElement(By.id("descrizione")).sendKeys("Libro");
    driver.findElement(By.id("prezzo")).click();
    driver.findElement(By.id("prezzo")).clear();
    driver.findElement(By.id("prezzo")).sendKeys("10");
    assertEquals("Il ritratto di Dorian Gray", driver.findElement(By.id("nome")).getAttribute("value"));
	assertEquals("Libro", driver.findElement(By.id("descrizione")).getAttribute("value"));
	assertEquals("10", driver.findElement(By.id("prezzo")).getAttribute("value"));
	driver.findElement(By.name("invia")).click();
    driver.findElement(By.xpath("//a[contains(@href, 'delete?id=371')]")).click();
  }


 @AfterAll
	  public static void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }

}
