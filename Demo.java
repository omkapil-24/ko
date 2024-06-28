package NewDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	public static void main(String[] args) throws Exception {
		
		WebDriver wd =new FirefoxDriver();
		//open website
		wd.get("https://demo.automationtesting.in/Register.html");
		
		//radio button click
		wd.findElement(By.xpath("//input[@value='Male']")).click();
		//checkbox click 
		wd.findElement(By.xpath("//input[@id='checkbox2']")).click();
		
		//for handle dropdown list, we will use class select
		Select sel = new Select(wd.findElement(By.xpath("//select[@id='Skills']")));
		//to automate dropdown list, we will use 3 methods
		//1. visibleText (use for characters)
		//2. value (use for numbers)
		//3. index(it is always start with 0)
		Thread.sleep(2000);
		sel.selectByVisibleText("AutoCAD");
		
		Select year = new Select(wd.findElement(By.xpath("//select[@id='yearbox']")));
		Select month = new Select(wd.findElement(By.xpath("//select[@placeholder='Month']")));
		Select date = new Select(wd.findElement(By.xpath("//select[@id='daybox']")));
		
		Thread.sleep(2000);
		year.selectByValue("2000");
		Thread.sleep(1000);
		month.selectByIndex(9);
		Thread.sleep(1000);
		date.selectByIndex(20);
		
		//how to generate your own xPath ?
		
		

		
	}
}













