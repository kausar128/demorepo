package SeleniumDemo;

//import java.lang.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AA {
	public static void main(String[] args) throws Exception {

		WebDriver wb = new FirefoxDriver();
		wb.get("file:///G:/Java%20By%20Kiran%20April%202019/Selenium%20Software/Offline%20Website/index.html");

		WebElement email = wb.findElement(By.xpath(".//*[@id='email']"));
		email.sendKeys("kiran@gmail.com");

		WebElement pass = wb.findElement(By.xpath(".//*[@id='password']"));
		pass.sendKeys("123456");

		WebElement signIN = wb.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		signIN.click();

		WebElement users = wb.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
		users.click();

		WebElement addUser = wb.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
		addUser.click();
		Thread.sleep(500);
		
		WebElement userName = wb.findElement(By.xpath(".//*[@id='username']"));
		userName.sendKeys("Kausar");

		WebElement mobile = wb.findElement(By.xpath(".//*[@id='mobile']"));
		mobile.sendKeys("9764227723");

		WebElement userEmail = wb.findElement(By.xpath(".//*[@id='email']"));
		userEmail.sendKeys("kausar128@gmail.com");

		WebElement gender = wb.findElement(By.xpath(".//*[@id='Female']"));
		gender.click();

		Select state = new Select(wb.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select")));
		state.selectByVisibleText("Maharashtra");
		
		WebElement userPassword = wb.findElement(By.xpath(".//*[@id='password']"));
		userPassword.sendKeys("123789");
		
		WebElement submitUser = wb.findElement(By.xpath(".//*[@id='submit']"));
		submitUser.click();
		
		Alert al = wb.switchTo().alert();
		al.accept();
		
		Thread.sleep(3000);
	
	}
}
