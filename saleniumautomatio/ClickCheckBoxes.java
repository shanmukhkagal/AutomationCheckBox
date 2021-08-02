package com.saleniumautomatio;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("file:///C:/Users/VINAYAK/Desktop/ck1.html");
		 
		 List<WebElement>  elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
		 System.out.println("Total Number of CheckBoxes present is "+elements.size());
		 for(WebElement el : elements) {
			 el.click();
		 }
		 Thread.sleep(2000);
		 
		 for(int i = elements.size()-1; i >=0; i--) {
			 WebElement el1 = elements.get(i);
			 el1.click();
		 }
		 driver.close();

	}
}
