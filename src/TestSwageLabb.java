import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class TestSwageLabb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		String name="standard_user";
		String pass= "secret_sauce";

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(name);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pass);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(5000);


		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		
		


		
	}

}
