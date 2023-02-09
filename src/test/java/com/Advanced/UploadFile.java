package com.Advanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","M:\\Eclipse 64 bit\\eclipse\\SeleniumAdvancedConcept\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml");
		
		WebElement upload=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt89\']/span[1]"));
		upload.click();
		
		String file="C:\\Users\\91996\\Downloads\\happy life.jpg";
		
		//if("C:\\Users\\91996\\Downloads".equals(file)) {
			//System.out.println("open the page");
	//	}
		//else {
			//System.out.println("not open the page");
		//}
		StringSelection Selection = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
		
		Robot rr=new Robot();
		rr.keyPress(KeyEvent.VK_CONTROL);
		rr.keyPress(KeyEvent.VK_V);
		rr.keyRelease(KeyEvent.VK_V);
		rr.keyRelease(KeyEvent.VK_CONTROL);
		rr.keyPress(KeyEvent.VK_ENTER);
		rr.keyRelease(KeyEvent.VK_ENTER);
		
		
		

	}

}
