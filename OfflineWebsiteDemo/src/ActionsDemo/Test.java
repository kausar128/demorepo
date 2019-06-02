package ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///G:/Java%20By%20Kiran%20April%202019/Selenium%20Software/Offline%20Website/index.html");
		Actions action = new Actions(driver);
		
		action.doubleClick(driver.findElement(By.xpath(".//*[@id='email']"))).sendKeys("kiran@gmail.com").build().perform();
		
	}
}
