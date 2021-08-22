package add3;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class shein {

 public static void main(String[] args) throws InterruptedException{
	 System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");					
 // WebDriverManager.chromedriver().setup();
  WebDriver driver=new ChromeDriver();
  String URL="https://ar.shein.com/";
  
  // Open URL and Maximize browser window
  driver.get(URL);
  driver.manage().window().maximize();
 

  WebElement search=driver.findElement(By.name("header-search"));

//Here do click textboxs ready to right
 search.click();
 // Here write what you want search 
 search.sendKeys("cartoon");
 search.submit();

  WebElement Img=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/section/div[1]/section[2]/div[1]/a/img[2]"));
  WebElement Btn=driver.findElement(By.xpath("//*[@id=\"product-list-v2\"]/div[2]/div[2]/section/div[1]/section[2]/div[2]/div[1]/a"));


  Actions actions=new Actions(driver);
  actions.moveToElement(Img).moveToElement(Btn).click().perform();

//  //Click on add to cart
  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/button")).click();
  // Do refresh for last page
  driver.navigate().refresh();
  driver.get("  https://ar.shein.com/1box-Cartoon-Graphic-Index-Sticker-p-2669811-cat-2272.html?scici=Search~~EditSearch~~1~~cartoon~~~~0\r\n"
  		+ "");
  
  Thread.sleep(2000);
  // close browser
   driver.quit();
  
  

 }
}