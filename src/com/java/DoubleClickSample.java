package com.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickSample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Nithya\\Eclipse workspace\\TestSele\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://artoftesting.com/samplesiteforselenium");
	
	driver.manage().window().maximize();
	Actions ac=new Actions(driver);
	
	
	Thread.sleep(3000);
	WebElement findElement = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
	ac.doubleClick(findElement).build().perform();
	Thread.sleep(3000);
	
	Alert a1=driver.switchTo().alert();
	a1.accept();
	Thread.sleep(3000);
	
	WebElement findElement2 = driver.findElement(By.xpath("(//a[text()='Selenium Sample Script'])[1]"));
	ac.contextClick(findElement2).build().perform();
	
	
	
	
}
}
