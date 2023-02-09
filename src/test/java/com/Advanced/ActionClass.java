package com.Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","M:\\Eclipse 64 bit\\eclipse\\SeleniumAdvancedConcept\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml;jsessionid=node0e1a4u33kprvpg5x54osgwna476372.node0");
		
		 WebElement from=driver.findElement(By.id("form:conpnl_content"));
		 WebElement To=driver.findElement(By.className("card"));
		
		  Actions act = new Actions(driver);
		  act.clickAndHold(from).moveToElement(To).release(To).build().perform();
		  
		  
		  WebElement from1=driver.findElement(By.id("form:drag_content"));
		  WebElement To1=driver.findElement(By.id("form:drop_content"));
		  
		  act.clickAndHold(from1).moveToElement(To1).release(To1).build().perform();
			 
		
		
	}
	

}
