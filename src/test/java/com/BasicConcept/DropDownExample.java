package com.BasicConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","M:\\Eclipse 64 bit\\eclipse\\SeleniumAdvancedConcept\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		
		WebElement select = driver.findElement(By.xpath("//*[@id=\'j_idt87\']/div/div[1]/div[1]/div/div/select"));
		Select ss = new Select(select);
		ss.selectByVisibleText("Selenium");
        
		
		WebElement select1=driver.findElement(By.id("j_idt87:country_label"));
		Select ss1=new Select(select1);
		ss1.selectByIndex(1);


	}

}
