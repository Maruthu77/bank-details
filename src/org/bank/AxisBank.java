package org.bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxisBank {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		
		driver.manage().window().maximize();
		
		WebElement txtfirst=driver.findElement(By.id("first_name"));
		txtfirst.sendKeys("Maruthu");
		String first=txtfirst.getAttribute("id");
		System.out.println(first);
		
		WebElement txtlast=driver.findElement(By.id("last_name"));
		txtlast.sendKeys("V");
		String last=txtlast.getAttribute("value");
		System.out.println(last);
		
		
		WebElement txtadd=driver.findElement(By.xpath("//textarea[@class=\"form-control address\"]"));
		txtadd.sendKeys("Chennai");
		String add=txtadd.getAttribute("value");
		System.out.println(add);
		
		WebElement txtmail=driver.findElement(By.id("email"));
		txtmail.sendKeys("maruthu@gmail.com");
		String mail=txtmail.getAttribute("value");
		System.out.println(mail);
		
		WebElement txtno=driver.findElement(By.id("phone"));
		txtno.sendKeys("9566658657");
		String no=txtno.getAttribute("value");
		System.out.println(no);
		
		
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("maruthu@123");
		String txt=pass.getAttribute("value");
		System.out.println(txt);
		
		WebElement cpass=driver.findElement(By.id("confirm-password"));
		cpass.sendKeys("maruthu@123");
		String txt1=pass.getAttribute("value");
		System.out.println(txt1);
	}

}
