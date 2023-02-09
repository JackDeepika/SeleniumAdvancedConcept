package com.BasicConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTestExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"M://Eclipse 64 bit//eclipse//SeleniumAdvancedConcept//Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml");

		WebElement link=driver.findElement(By.linkText("Go to Dashboard"));
		link.click();
		driver.navigate().back();

		WebElement Where=driver.findElement(By.partialLinkText("Find the URL "));
		String value= Where.getAttribute("href");
		System.out.println("go to url"+value);

		WebElement broken=driver.findElement(By.linkText("Broken?"));
		broken.click();
		String title=  driver.getTitle();
		System.out.println("get title"+title);
		
		driver.navigate().back();
		
		List<WebElement> totalcount=driver.findElements(By.tagName("a"));
		int linkcount=totalcount.size();
		System.out.println("total count of the link:"+linkcount);
		
		List<WebElement> laytotal=driver.findElements(By.partialLinkText("How many links"));
		int laycount=laytotal.size();
		System.out.println("get lay total:"+laycount);
		
		WebElement duplicate=driver.findElement(By.linkText("Go to Dashboard"));
		duplicate.click();
		driver.navigate().back();
		
		


	}

}
