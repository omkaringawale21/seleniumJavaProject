package seleniumProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromiumdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).click();
		driver.findElement(By.xpath("html/body/child::div[@class='wrapper']/child::div[@class='lft_wrap']/child::div[@class='top_bar']/child::div[@class='cell']/child::form[@name='loginform']/child::div[@class='floatR rightwidth']/child::div[@class='create-new-account']/child::a[@title='Create new Rediffmail account']")).click();
		WebElement dropdown = driver.findElement(By.xpath("html/body//child::td[@colspan='3']/select[@name='DOB_Day852d4505']"));
		List<WebElement> option = dropdown.findElements(By.tagName("option"));     // size()=32
		System.out.println(option.size());
		
//		List<WebElement> option = driver.findElements(By.tagName("option"));       // size()=475
//		System.out.println(option.size());
		
		String element;
		for(int i=0; i<option.size(); i++){
			element = option.get(i).getAttribute("value");
			if(element.equals("10")){
				option.get(i).click();
				break;
			}
		}

	}

}
