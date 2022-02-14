package seleniumProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFrame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromiumdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://jqueryui.com/draggable/");
//		driver.get("https://jqueryui.com/droppable/");
//		driver.get("https://jqueryui.com/slider/");
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//iframe
//		List<WebElement> list = driver.findElements(By.tagName("iframe"));
//		System.out.println(list.size());
		
		//1st method
//		driver.switchTo().frame(0);
//		WebElement element = driver.findElement(By.xpath("//div[@id='draggable']"));
//		System.out.println(element.getText());
//		
//		driver.switchTo().defaultContent();
//		WebElement pageElement = driver.findElement(By.xpath("//h1[@class='entry-title']"));
//		System.out.println(pageElement.getText());
		
		//2nd method
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		
//		WebElement element = driver.findElement(By.xpath("//div[@id='draggable']"));
//		System.out.println(element.getText());
//		
//		driver.switchTo().defaultContent();
//		WebElement pageElement = driver.findElement(By.xpath("//h1[@class='entry-title']"));
//		System.out.println(pageElement.getText());
//		
//		driver.switchTo().defaultContent();
//		WebElement fc = driver.findElement(By.xpath("//h3[@class='widget-title'] [text()='Widgets']"));
//		System.out.println(fc.getText());
		
		//3rd method
//		driver.switchTo().frame("class=demo-frame");
//		
//		WebElement element = driver.findElement(By.xpath("//div[@id='draggable']"));
//		System.out.println(element.getText());
//		
//		driver.switchTo().defaultContent();
//		WebElement pageElement = driver.findElement(By.xpath("//h1[@class='entry-title']"));
//		System.out.println(pageElement.getText());
//		
//		driver.switchTo().defaultContent();
//		WebElement fc = driver.findElement(By.xpath("//h3[@class='widget-title'] [text()='Widgets']"));
//		System.out.println(fc.getText());
		
		
		//drag
//		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//		System.out.println(frames.size());
//		WebElement fr = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(fr);
		
//		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
//		System.out.println(drag.getText());
//		
//		Actions action = new Actions(driver);
//		action.moveToElement(drag).dragAndDropBy(drag, 50, 50).build().perform();
		
		
		//drag and drop
//		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//		System.out.println(frames.size());
//		WebElement fr = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(fr);
		
//		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
//		System.out.println(drag.getText());
//		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(drag).dragAndDrop(drag, drop).build().perform();
		
		
		//slider
//		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//		System.out.println(frames.size());
//		
//		WebElement fr = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(fr);
		
//		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/child::span"));
//		System.out.println(slider.getText());
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(slider).dragAndDropBy(slider, 100, 0).build().perform();
		
		
		//resize
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		WebElement fr = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(fr);
		
		WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']"));
		System.out.println(resize.getText());
		
		Actions ac = new Actions(driver);
		ac.moveToElement(resize).dragAndDropBy(resize, 50, 50).build().perform();
		
		
	}

}
