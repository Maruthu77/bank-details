package org.bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Iobbank {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		
		
		
		WebElement txtname=driver.findElement(By.name("username"));
		txtname.sendKeys("Maruthu");
		
		WebElement txtpass=driver.findElement(By.name("password"));
		txtpass.sendKeys("Pandi");
		
		//WebElement txtclick=driver.findElement(By.className("title mb-0 center"));
		//txtclick.click();
		
		//button[@id="u_0_5_gP"]
		
	}

}
