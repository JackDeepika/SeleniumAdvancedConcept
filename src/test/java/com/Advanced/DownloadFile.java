package com.Advanced;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","M:\\Eclipse 64 bit\\eclipse\\SeleniumAdvancedConcept\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml");
		
		WebElement download=driver.findElement(By.id("j_idt93:j_idt95"));
		download.click();
		File loc=new File("");
		File[] ff=loc.listFiles();
		for (File all : ff) {
			if(all.getName().equals("j_idt93:j_idt95"))
			{
				System.out.println("file is download");
				break;
			}
			
		}
		
		

	}

}
