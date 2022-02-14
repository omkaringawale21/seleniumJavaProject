package seleniumProject;

import java.util.Base64;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	
	// encoded password converted into decoded pasward
	public static String encodedPassword = "QXBwaXVtMTIz";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromiumdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.xpath("html/body/child::div[@class='wrapper']/child::div[@class='lft_wrap']/child::div[@class='top_bar']/child::div[@class='cell']/child::form[1]/child::div[@class='floatL leftwidth']/child::div[@class='table']/child::div[@class='row']/child::div[2]/child::input[1]")).sendKeys("appautomator@rediffmail.com");
		driver.findElement(By.xpath("html/body/child::div[@class='wrapper']/child::div[@class='lft_wrap']/child::div[@class='top_bar']/child::div[@class='cell']/child::form[1]/child::div[@class='floatL leftwidth']/child::div[@class='table']/child::div[2]/child::div[2]/child::input[1]")).sendKeys(getDecodedPassword());
		driver.findElement(By.xpath("html/body/child::div[@class='wrapper']/child::div[@class='lft_wrap']/child::div[@class='top_bar']/child::div[@class='cell']/child::form[1]/child::div[@class='floatL leftwidth']/child::div[@class='table']/child::div[2]/child::div[2]/child::input[2]")).click();
		
	}
	
	public static String getDecodedPassword(){
		return new String(Base64.getDecoder().decode(encodedPassword.getBytes()));
	}

}
