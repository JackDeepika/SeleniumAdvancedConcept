package com.Advanced;

import java.awt.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHnadling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"M:\\Eclipse 64 bit\\eclipse\\SeleniumAdvancedConcept\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node01hdbhd7c114r81q3rxlnf8j9su76210.node0");
		String oldwindow = driver.getWindowHandle();
		
		String old=driver.getWindowHandle();



		
		  // open multiple window find the number
		  driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span")).click();
		  int num=driver.getWindowHandles().size();
		  System.out.println("number of windows:"+num); Thread.sleep(3000);
		  
		  
		  // close all windows expected primary
		  driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]")).click();
		  Set<String> newwindow = driver.getWindowHandles(); 
		  for (String allwindow : newwindow)
		  { 
	      if (!allwindow.equals(oldwindow)) {
		  driver.switchTo().window(allwindow); 
		  driver.close();
		  
		  }
		  
		  }
		 


		// close and confirm new window open
		driver.findElement(By.xpath("//*[@id=\'j_idt88:new\']/span")).click();
		Set<String> handles = driver.getWindowHandles(); 
	    for (String new1 : handles)
		{ 
			driver.switchTo().window(new1);
			Thread.sleep(3000);
		   WebElement nextpage=driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
			//Thread.sleep(3000);
			nextpage.click();
		//	driver.close();

		}

	}

}
