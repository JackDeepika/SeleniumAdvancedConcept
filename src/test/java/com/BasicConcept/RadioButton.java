package com.BasicConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "M:\\Eclipse 64 bit\\eclipse\\SeleniumAdvancedConcept\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml;jsessionid=node0hv75o72lrhnx1krjrakd2123s73409.node0");
		
		//your most fvrt browser
		driver.findElement(By.xpath("//*[@id=\'j_idt87:console1\']/tbody/tr/td[1]/div/div[2]")).click();
		
		//unselectable
		WebElement unselect=driver.findElement(By.xpath("//*[@id=\'j_idt87:city2\']/div/div[2]/label"));
		boolean check=unselect.isSelected();
		System.out.println(check);
		
		//find the default selected
		WebElement default1=driver.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[3]/div/div[2]"));
		boolean check1=default1.isEnabled();
		System.out.println(check1);

	}

}
