package com.BasicConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","M:\\Eclipse 64 bit\\eclipse\\SeleniumAdvancedConcept\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		
		driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]")).click();
		Alert  b=driver.switchTo().alert();
		b.dismiss();
		
		driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt95\']/span[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt98\']/span[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt104\']/span[2]")).click();
		Alert prompt=driver.switchTo().alert();
		prompt.sendKeys("deepika");
		prompt.accept();
		
		
		
		
		
		
	}

}
