import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class autoGooglemate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tcsak\\Downloads\\chromedriver\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		WebElement searchBar = driver.findElement(By.name("q"));
		
		searchBar.sendKeys("Selenium Webdriver");
		
		searchBar.submit();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
	}

}
