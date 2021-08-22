package add3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class walmart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");					
		  WebDriver driver=new ChromeDriver();
		  String URL="https://www.walmart.com/";
		  
		  // Open URL and Maximize browser window
		  driver.get(URL);
		  driver.manage().window().maximize();
		  
		//we need to pass locator and wait time as the parameters to the below method
     WebElement searchBox=driver.findElement(By.id("global-search-input"));
		  
		  // Here do click textboxs ready to right
		  searchBox.click();
		  // Here write what you want search 
		  searchBox.sendKeys("fashion");
		  
		  // then click button search
		  searchBox.submit();
		  Actions action = new Actions(driver);
		 
		  // Here chose what you want take it then check about xpath link
		  WebElement SecondImg=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[1]/div[1]/div/section/div/div/div/div[6]/div[2]/div[2]/ul/li[9]/div/div[2]/div[2]/a/div/img"));
		  
		  // Here click the picture you chose 
		  WebElement MoreBtn=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[1]/div[1]/div/section/div/div/div/div[6]/div[2]/div[2]/ul/li[9]/div/div[2]/div[5]/div/a"));
		  Actions actions=new Actions(driver);
		  
		  // Here how can do it all that
		  actions.moveToElement(SecondImg).moveToElement(MoreBtn).click().perform();

		  //Click on add to cart
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/div/div/div/div/div[3]/div[5]/div/div[3]/div/div[2]/div[2]/div[1]/section/div[1]/div[3]/button")).click();
		  
		  // Do refresh for last page
		  driver.navigate().refresh();
		  driver.get("https://www.walmart.com/pac?id=a71bb65b-9fa9-4347-800a-3c5beff9430e&quantity=1&cv=1");
		  
		  Thread.sleep(20000);
		  // close browser
		   driver.quit();

	}

}
