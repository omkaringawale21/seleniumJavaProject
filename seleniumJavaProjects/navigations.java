package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigations {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\chromiumdriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://www.rediff.com/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).click();
		 Thread.sleep(5000);
		 
		 driver.navigate().back();
		 Thread.sleep(5000);
		 
		 driver.navigate().forward();
		 Thread.sleep(5000);
		 
		 driver.navigate().refresh();

	}

}
