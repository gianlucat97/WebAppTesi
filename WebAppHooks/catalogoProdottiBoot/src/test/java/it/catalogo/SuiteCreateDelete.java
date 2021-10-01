
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

class SuiteCreateDelete {
private static WebDriver driver;
private boolean acceptNextAlert = true;
private static StringBuffer verificationErrors = new StringBuffer();

	  @BeforeAll
	  public static void setUp() throws Exception {
		
		  // Init chromedriver
		  String chromeDriverPath = "/home/runner/work/WebAppTesi/WebAppTesi/chromedriver_v94_linux64/chromedriver";
		  System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
		  driver = new ChromeDriver(options);  
		  
		  
		  
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
  @Test
  public void testSuiteCreateDelete_release_1_0() throws Exception {
    driver.get("http://localhost:8080/prodotti");
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).clear();
    driver.findElement(By.id("nome")).sendKeys("Cellulare");
    driver.findElement(By.id("descrizione")).clear();
    driver.findElement(By.id("descrizione")).sendKeys("Prodotto Samsung");
    driver.findElement(By.id("prezzo")).clear();
    driver.findElement(By.id("prezzo")).sendKeys("400");
    driver.findElement(By.name("invia")).click();
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).clear();
    driver.findElement(By.id("nome")).sendKeys("Lavagna");
    driver.findElement(By.id("descrizione")).clear();
    driver.findElement(By.id("descrizione")).sendKeys("Prodotto Scolastico");
    driver.findElement(By.id("prezzo")).clear();
    driver.findElement(By.id("prezzo")).sendKeys("60");
    driver.findElement(By.name("invia")).click();
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).clear();
    driver.findElement(By.id("nome")).sendKeys("Dipinto");
    driver.findElement(By.id("descrizione")).clear();
    driver.findElement(By.id("descrizione")).sendKeys("Dimensioni 60cmx90cm");
    driver.findElement(By.id("prezzo")).click();
    driver.findElement(By.id("prezzo")).clear();
    driver.findElement(By.id("prezzo")).sendKeys("25");
    driver.findElement(By.name("invia")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Modifica'])[12]/preceding::a[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Modifica'])[11]/preceding::a[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Modifica'])[10]/preceding::a[1]")).click();
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
