package seleniumProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromiumdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='yschsp']")).sendKeys("selenium");
		Thread.sleep(5000);
		
		List<WebElement> list = driver.findElements(By.xpath("//*[starts-with(@class,'sa-item prog-sugg')]"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++){
//			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("selenium ide")){
				list.get(i).click();
				break;
			}
		}
	
		

	}

}
