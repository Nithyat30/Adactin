package com.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotConcept {
public static void main(String[] args) throws AWTException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Nithya\\Eclipse workspace\\TestSele\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_CAPS_LOCK);
	r.keyRelease(KeyEvent.VK_CAPS_LOCK);
	Thread.sleep(3000);
	
	r.keyPress(KeyEvent.VK_CAPS_LOCK);
	r.keyRelease(KeyEvent.VK_CAPS_LOCK);
	Thread.sleep(3000);

	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_T);

	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_T);

	
	
	
}
}
