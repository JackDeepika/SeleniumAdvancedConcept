package com.BasicConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","M:\\Eclipse 64 bit\\eclipse\\SeleniumAdvancedConcept\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml;jsessionid=node01qx1uxiwad7nb1kowm5afvyfay73365.node0");
		driver.manage().window().maximize();
		  
		//click the box
		  driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt89\']/div[2]")).click();
		
		  //click the check box get notification
		 WebElement select=driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt91\']/div[2]"));
		 select.click();
		 
		 if(select.equals(select)) {
			 
			 System.out.println("get notification the box is selected");
		 }else {
			 System.out.println("get notification the box is unselected");
		 }
		 
		 //select the favrit language
		 driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[3]/div/div[2]")).click();
		 driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[1]/div/div[2]")).click();
		 
		 //get state
		  WebElement select1=driver.findElement(By.xpath("//*[@id=\'j_idt87:ajaxTriState\']/div[2]"));
		   select1.click();
		   
		  //verify is disable
		   WebElement verify=driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt102\']"));
		   boolean correct=verify.isDisplayed();
		   System.out.println(correct);
		   
		   //select multiple
		   WebElement select3=driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple\']/ul"));
		   select3.click();
		   
		  driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple_panel\']/div[2]/ul/li[1]/div/div[2]")).click();

		  driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple_panel\']/div[2]/ul/li[7]/div/div[2]")).click();
		  
		  driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple_panel\']/div[2]/ul/li[3]/div/div[2]")).click();		   
		   
		  driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple_panel\']/div[1]/a/span")).click();
		   
		   
		 
		 
		

	}

}
