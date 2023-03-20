package com.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProjectDemo {
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Nithya\\Eclipse workspace\\TestSele\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
		findElement.sendKeys("Nithyat30");
		
		WebElement findElement2 = driver.findElement(By.xpath("//input[@type='password']"));
		findElement2.sendKeys("Nithya@30");
		
		WebElement findElement3 = driver.findElement(By.xpath("//input[@type='Submit']"));
		findElement3.click();
		
		WebElement findElement4 = driver.findElement(By.xpath("//select[@name='location']"));
		Select sc=new Select(findElement4);
		sc.selectByValue("London");
		
		
		WebElement findElement5 = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select sc1=new Select(findElement5);
		sc1.selectByIndex(3);
		
		WebElement findElement6 = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select sc2=new Select(findElement6);
		sc2.selectByVisibleText("Double");
		
		WebElement findElement7 = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select sc3=new Select(findElement7);
		sc3.selectByValue("1");
		
		WebElement findElement8 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		findElement8.clear();
		findElement8.sendKeys("20/03/2023");
		
		WebElement findElement9 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		findElement9.clear();
		findElement9.sendKeys("25/03/2023");
		
		WebElement findElement10 = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select sc4=new Select(findElement10);
		sc4.selectByVisibleText("3 - Three");
		
		WebElement findElement11 = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select sc5=new Select(findElement11);
		sc5.selectByValue("1");
		
		WebElement findElement12 = driver.findElement(By.xpath("//input[@type='submit']"));
		findElement12.click();
		
		WebElement findElement13 = driver.findElement(By.xpath("//input[@value='0']"));
		findElement13.click();
		
		WebElement findElement14 = driver.findElement(By.xpath("//input[@name='continue']"));
		findElement14.click();
		
		WebElement findElement15 = driver.findElement(By.xpath("//input[@name='first_name']"));
		findElement15.sendKeys("Nithya");
		
		WebElement findElement16 = driver.findElement(By.xpath("//input[@name='last_name']"));
		findElement16.sendKeys("T");
		
		WebElement findElement17 = driver.findElement(By.xpath("//textarea[@name='address']"));
		findElement17.sendKeys("No 14 Lakshmi Appt, AnnaNagar Pammal Chennai 600085");
		
		WebElement findElement18 = driver.findElement(By.xpath("//input[@name='cc_num']"));
		findElement18.sendKeys("4785 1256 2586 4523");
		
		WebElement findElement19 = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select sc6=new Select(findElement19);
		sc6.selectByVisibleText("VISA");
		
		WebElement findElement20 = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select sc7=new Select(findElement20);
		sc7.selectByVisibleText("March");
		
		WebElement findElement21 = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select sc8=new Select(findElement21);
		sc8.selectByVisibleText("2022");
		
		WebElement findElement22 = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		findElement22.sendKeys("784");
		
		WebElement findElement23 = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
		findElement23.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//driver.switchTo().alert();
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_ALT);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_ALT);
//		r.keyRelease(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
		
		WebElement findElement24 = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
		findElement24.click();
		
	}

}
