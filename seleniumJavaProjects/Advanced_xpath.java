package seleniumProject;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advanced_xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromiumdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.className("w3-hide-small")).click();
//		driver.findElement(By.id("navbtn_tutorials")).click();
//		driver.findElement(By.linkText("PYTHON")).click();
		driver.findElement(By.partialLinkText("JAVASCRIPT")).click();
		
//		List<WebElement> list = driver.findElements(By.tagName("a"));
//		System.out.println(list.size());
//		for(int i=0; i<list.size(); i++){
//			System.out.println(list.get(i).getText());
//			if(list.get(i).getText().equals("SQL")){
//				list.get(i).click();
//				break;
//			}
//		}
		
		

	}

}
