package com.java;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotProject {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Nithya\\Eclipse workspace\\TestSele\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions ac= new Actions(driver);
		Robot r= new Robot();
		
		
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		ac.contextClick(findElement).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);

		WebElement findElement2 = driver.findElement(By.xpath("//a[text()='Sell']"));	
		ac.contextClick(findElement2).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		
		WebElement findElement3 = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		ac.contextClick(findElement3).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement findElement4 = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		ac.contextClick(findElement4).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		int size = driver.getWindowHandles().size();//to get no. of windows opened
		System.out.println("No of windows opened:  "+size);
		
		String windowHandle = driver.getWindowHandle();//to get the ID of parent window
		System.out.println(windowHandle);
		
		
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);//to get the id of allwindows
		
		
		Set<String> windoweach = driver.getWindowHandles();

		for(String str: windoweach) {//to print title of each window
			
			String title = driver.switchTo().window(str).getTitle();
			System.out.println(title);
		}
		
		String ref="Amazon.in: Selling on Amazon - Start Selling Now";
		for(String s:allwindow) {
			Thread.sleep(2000);
			if(ref.equals(driver.switchTo().window(s).getTitle()))
			{
				break;
			}
		}
		//Thread.sleep(3000);
		for(String cp:allwindow) {
			if(cp.equals(windowHandle)) {
				//Thread.sleep(3000);
				driver.switchTo().window(cp);
				driver.close();
				
			}
		}
				
		
	}
	

}
