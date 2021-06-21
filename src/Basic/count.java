package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class count {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.name("q"));//ALways make sure this is in double quotes
		ele.sendKeys("pythonseleni");//
		
		Thread.sleep(3000);
		
		java.util.List<WebElement> ele1 = driver.findElements(By.xpath("//li[@class='sbct']"));
		//Place you cursor on ele1 to get the lists and to get the lists make sure you are using findElements
		System.out.print(ele1.size());
		//it gives the total size
		for(WebElement text:ele1) {
			System.out.print(text.getSize());
			
		}
		driver.close();
		
	}
}
