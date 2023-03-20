package com.java;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionByMouse {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Nithya\\Eclipse workspace\\TestSele\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	//driver.get("https://www.google.com/");
	driver.get("https://demoqa.com/droppable");
	
	driver.manage().window().maximize();
	Actions ac= new Actions(driver);
	
	Thread.sleep(3000);
	
	//WebElement findElement = driver.findElement(By.xpath("//a[text()='Images']"));
	//ac.click(findElement).build().perform();
	
	WebElement findElement = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement findElement2 = driver.findElement(By.xpath("//div[@id='droppable']"));
	
	
	//ac.dragAndDrop(findElement, findElement2).build().perform();
	ac.clickAndHold(findElement).moveToElement(findElement).release(findElement2).build().perform();
	
	
	
	
}}
