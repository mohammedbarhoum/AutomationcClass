import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestKey {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webDriver.chrome.driver", "");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.booking.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"__bui-c706508-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"__bui-c706508-1\"]")).sendKeys("amman"+Keys.ARROW_DOWN.ENTER);
	}

}
