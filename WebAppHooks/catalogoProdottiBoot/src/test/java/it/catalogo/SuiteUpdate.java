package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SuiteUpdate {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSuiteUpdate_release_1_0() throws Exception {
    driver.get("http://localhost:8080/prodotti");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Elimina'])[2]/preceding::a[1]")).click();
    driver.findElement(By.id("descrizione")).click();
    driver.findElement(By.id("descrizione")).click();
    driver.findElement(By.id("descrizione")).click();
    driver.findElement(By.id("descrizione")).clear();
    driver.findElement(By.id("descrizione")).sendKeys("Marca Nike");
    driver.findElement(By.id("prezzo")).click();
    driver.findElement(By.id("prezzo")).clear();
    driver.findElement(By.id("prezzo")).sendKeys("95");
    driver.findElement(By.name("invia")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Elimina'])[2]/following::a[1]")).click();
    driver.findElement(By.id("descrizione")).click();
    driver.findElement(By.id("descrizione")).clear();
    driver.findElement(By.id("descrizione")).sendKeys("4 Fornelli");
    driver.findElement(By.id("prezzo")).click();
    driver.findElement(By.id("prezzo")).clear();
    driver.findElement(By.id("prezzo")).sendKeys("380");
    driver.findElement(By.name("invia")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Elimina'])[3]/following::a[1]")).click();
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).clear();
    driver.findElement(By.id("nome")).sendKeys("TV S150x");
    driver.findElement(By.id("prezzo")).click();
    driver.findElement(By.id("prezzo")).clear();
    driver.findElement(By.id("prezzo")).sendKeys("900");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Elimina'])[3]/following::a[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Elimina'])[3]/following::a[1]")).click();
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).clear();
    driver.findElement(By.id("nome")).sendKeys("TV S50x");
    driver.findElement(By.id("prezzo")).click();
    driver.findElement(By.id("prezzo")).clear();
    driver.findElement(By.id("prezzo")).sendKeys("800");
    driver.findElement(By.name("invia")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Elimina'])[2]/following::a[1]")).click();
    driver.findElement(By.id("descrizione")).click();
    driver.findElement(By.id("descrizione")).clear();
    driver.findElement(By.id("descrizione")).sendKeys("8 Fornelli");
    driver.findElement(By.id("prezzo")).click();
    driver.findElement(By.id("prezzo")).clear();
    driver.findElement(By.id("prezzo")).sendKeys("770");
    driver.findElement(By.name("invia")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Elimina'])[1]/following::a[1]")).click();
    driver.findElement(By.id("descrizione")).click();
    driver.findElement(By.id("descrizione")).clear();
    driver.findElement(By.id("descrizione")).sendKeys("Marca Adidas");
    driver.findElement(By.id("prezzo")).clear();
    driver.findElement(By.id("prezzo")).sendKeys("100");
    driver.findElement(By.name("invia")).click();
  }

  @After
  public void tearDown() throws Exception {
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
