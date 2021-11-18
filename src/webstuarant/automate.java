
package webstuarant;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./src/resources/chromedriver");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.webstaurantstore.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("searchval")).sendKeys("stainlesss work table");
		 
		 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,632.7999877929688)");
		 driver.findElement(By.name("addToCartButton")).click();
		 driver.findElement(By.linkText("View Cart")).click();
		 driver.findElement(By.linkText("Empty Cart")).click();




	}

}
