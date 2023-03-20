package com.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakemytripProject {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Nithya\\Eclipse workspace\\TestSele\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		Actions ac= new Actions(driver);	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement findElement = driver.findElement(By.xpath("//span[text()='From']"));
		ac.click(findElement).build().perform();
		
		WebDriverWait waitt  =(new WebDriverWait(driver,10));		//WebElement findElement2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		findElement.sendKeys("Chennai");		
		Select sc=new Select(findElement);
		sc.selectByVisibleText("Chennai, India");
	
	
		
		
		
	}
}
