package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SuiteUpdateLocHooks {
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
  public void testSuiteUpdateLocHooks_loc_Hooks_release_1_0() throws Exception {
    driver.get("http://localhost:8080/prodotti");
    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][1]//*[@x-test-hook-50]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).sendKeys("Marca Nike");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).sendKeys("95");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-18]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][2]//*[@x-test-hook-50]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).sendKeys("4 Fornelli");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).sendKeys("380");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-18]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][3]//*[@x-test-hook-50]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-10]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-10]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-10]")).sendKeys("TV S150x");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).sendKeys("900");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-18]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][3]//*[@x-test-hook-50]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-10]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-10]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-10]")).sendKeys("TV S50x");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).sendKeys("800");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-18]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][2]//*[@x-test-hook-50]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).sendKeys("8 Fornelli");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).sendKeys("770");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-18]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][1]//*[@x-test-hook-50]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).sendKeys("Marca Adidas");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).sendKeys("100");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-18]")).click();
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
