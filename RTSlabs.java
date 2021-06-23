import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RTSlabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ryane\\Desktop\\Java project\\chromedriver.exe");
		
		// RTS Labs Google Search
		WebDriver driver=new ChromeDriver();
		driver.get("http://Google.com");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("RTS Labs" + "\n");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\'rso\']/div[1]/div/div/div/div/div/div[1]/a/h3")).click();
		
		Thread.sleep(3000);
		driver.quit();
	
		
	}

}
