package com.BasicConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.setProperty("webdriver.chrome.driver","M:\\Eclipse 64 bit\\eclipse\\SeleniumAdvancedConcept\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		/*
		 * List<WebElement> findElements =
		 * driver.findElements(By.xpath("//div[@class='example'][6]//option"));
		 * 
		 * for(int i=0;i<findElements.size();i++) { String text =
		 * findElements.get(i).getText(); System.out.println(text); }
		 */
		
		WebElement element = driver.findElement(By.id("dropdown1"));
		Select dd1=new Select(element);
		dd1.selectByVisibleText("UFT/QTP");
		
		WebElement element2 = driver.findElement(By.name("dropdown2"));
		Select dd2=new Select(element2);
		dd2.selectByIndex(1);
		
		WebElement element3 = driver.findElement(By.id("dropdown3"));
		Select dd3=new Select(element3);
		dd3.selectByValue("1");
		
		WebElement element4=driver.findElement(By.className("dropdown"));
		Select dd4=new Select(element4);
		dd4.selectByIndex(1);
	}

}
