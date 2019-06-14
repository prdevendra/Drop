package org.dev;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Down {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","D:\\java2\\Drop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement mon=driver.findElement(By.id("month"));
		Select s=new Select(mon);
		s.selectByVisibleText("Mar");
		List<WebElement> opp=s.getOptions();
		System.out.println("Counnt Optiions"+opp.size());
		
		for(int i=0; i<opp.size();i++) {
			WebElement we=opp.get(i);
			String text=we.getText();
			System.out.println(text);
			
			
			}
		}
		
		
	}
