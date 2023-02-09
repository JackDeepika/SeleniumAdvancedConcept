package com.Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","M:\\Eclipse 64 bit\\eclipse\\SeleniumAdvancedConcept\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node01fj86xd60r2081u49jlkvmkr875585.node0");


		driver.switchTo().frame(0);
		WebElement button=driver.findElement(By.id("Click"));
		button.click();
		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);

		driver.switchTo().defaultContent();
		List<WebElement> count= driver.findElements(By.tagName("iframe"));
		int size=count.size();
		System.out.println(size);
         
		//nested frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2); //find position of the frame
		driver.switchTo().frame("frame2");
		WebElement nested= driver.findElement(By.id("Click"));
		nested.click();
		String text1=driver.findElement(By.id("Click")).getText();
		System.out.println(text1);

	}

}
