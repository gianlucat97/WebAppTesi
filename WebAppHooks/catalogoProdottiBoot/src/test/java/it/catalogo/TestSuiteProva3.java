
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

class TestSuiteProva3 {
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
	  public void provaSuWikipedia_release_1_4() {
		  
		  //SpringApplication.run(CatalogoProdottiBootApplication.class);

			System.out.println("La suit di Test è iniziata");
			  
			driver.get("https://en.wikipedia.org/wiki/Web_container");
		    driver.findElement(By.linkText("Jakarta Servlets")).click();
		    driver.findElement(By.linkText("PHP")).click();
		    driver.findElement(By.linkText("interpreter")).click();
		    driver.findElement(By.linkText("intermediate representation")).click();
		    driver.findElement(By.linkText("data structure")).click();
		    
		    System.out.println("La suit di Test è terminata");
		    
		    
		  
		}
	 
	  
	  @Test
	  public void testSuLocalHostProva1_release_1_0() throws Exception {
		  
		
		
		System.out.println("La suit di Test è iniziata");
		  
		driver.get("http://localhost:8080/prodotti");
		System.out.println("Connesso a localhost:8080/prodotti");
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("nome")).click();
		System.out.println("Ho cliccato sul primo pulsante");
	    driver.findElement(By.id("nome")).clear();
	    driver.findElement(By.id("nome")).sendKeys("Infradito");
	    driver.findElement(By.id("descrizione")).clear();
	    driver.findElement(By.id("descrizione")).sendKeys("Abbigliamento mare");
	    driver.findElement(By.id("prezzo")).clear();
	    driver.findElement(By.id("prezzo")).sendKeys("10");
	    driver.findElement(By.name("invia")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Elimina'])[9]/following::a[1]")).click();
	    driver.findElement(By.xpath("//form[@id='datiProdotto']/div[3]")).click();
	    driver.findElement(By.id("prezzo")).clear();
	    driver.findElement(By.id("prezzo")).sendKeys("20");
	    driver.findElement(By.name("invia")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Abbigliamento mare'])[1]/following::a[1]")).click();
	    
	    System.out.println("La suit di Test è terminata");
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
