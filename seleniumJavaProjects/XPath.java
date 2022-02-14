package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromiumdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//a[@href='html_css.asp']/following-sibling::a")).click();
//		driver.findElement(By.xpath("//div[@id='leftmenuinnerinner']/child::a[13]")).click();
//		driver.findElement(By.xpath("//a[text()='HTML JavaScript']")).click();
//		driver.findElement(By.xpath("//div[@class='w3-panel w3-info intro']/parent::div/parent::div/parent::div/following-sibling::a")).click();
		driver.findElement(By.xpath("//div[@class='w3-panel w3-info intro']/parent::div/parent::div/parent::div/preceding-sibling::div/child::a[4]")).click();
		
//		driver.get("https://www.shadi.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//a[@alt='read more']")).click();

	}

}
