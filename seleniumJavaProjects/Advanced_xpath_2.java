package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advanced_xpath_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromiumdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//*[@class='w3-col l10 m12']/child::div/following-sibling::h1/following-sibling::div/child::a[text()='? Home']")).click();
//		driver.findElement(By.xpath("//a[starts-with(text(),'JAVASCRIPT')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'PYTHON')]")).click();
//		driver.findElement(By.xpath("//a[contains(@title,'Tutorials')]")).click();
//		driver.findElement(By.xpath("//div[@id='pagetop']/child::a[starts-with(text(),'Tutorials ')]")).click();
		
//		driver.findElement(By.xpath("(//div[@id='pagetop']/child::a)[last()-1]")).click();
		driver.findElement(By.xpath("(//div[@id='pagetop']/child::a)[position()='3']")).click();

	}

}
