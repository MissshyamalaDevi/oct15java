package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practise {
	
	public static void main (String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Actions a = new Actions(driver);
		a.doubleClick().perform(); 
		Robot r = new Robot ();
		
		System.out.println("Step1: To check the functionality of the login button");
				
		
		
		

}

}