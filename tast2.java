package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tast2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		WebElement fname=driver.findElement(By.id("input-firstname"));
		fname.sendKeys("harsha");
		WebElement lname=driver.findElement(By.id("input-lastname"));
		lname.sendKeys("muthu");
		WebElement email=driver.findElement(By.id("input-email"));
		email.sendKeys("harsha@gmail.com");
		WebElement pass=driver.findElement(By.id("input-password"));
		pass.sendKeys("qwerty");
		
		
	}

}
