package com.BasicConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxEample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"M:\\Eclipse 64 bit\\eclipse\\SeleniumAdvancedConcept\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");


		driver.findElement(By.id("j_idt88:name")).sendKeys("Deepika");
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("Salem");
		boolean disable=driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div[3]/div")).isDisplayed();
		System.out.println("The text box disable:"+disable);
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		String value1= driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		System.out.println(value1);
		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("deepi@29");
		WebElement bold=driver.findElement(By.id("j_idt88:j_idt101"));
		bold.sendKeys("im deepika Thirukumaran my love my happiness my sadd my kind my solu mine");
		WebElement boldEdit=driver.findElement(By.className("ql-editor ql-blank"));
		boldEdit.sendKeys("im deepika Thirukumaran my love my happiness my sadd my kind my solu mine");
		//WebElemenr
		boldEdit.click();
		
		

	}

}
