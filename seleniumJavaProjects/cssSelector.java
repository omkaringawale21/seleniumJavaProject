package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectors {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromiumdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//input[@id='srchquery_tbox']")).sendKeys("sparx shoes");
//		driver.findElement(By.cssSelector("input[id='srchquery_tbox']")).sendKeys("sparx shoes");
//		driver.findElement(By.cssSelector("a[title='Already a user? Sign in']")).click();
		driver.findElement(By.cssSelector("div[class='cell alignR toprlinks'] p a[title='Create Rediffmail Account']")).click();
		// space gives like in xpath'/' i.e. child

	}

}
