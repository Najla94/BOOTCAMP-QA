package add3;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class amazon {

 public static void main(String[] args) throws InterruptedException{
	 System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");					
  WebDriver driver=new ChromeDriver();
  String URL="https://www.amazon.com/";
  
  // Open URL and Maximize browser window
  driver.get(URL);
  driver.manage().window().maximize();
 
  //When ever we need to perform any operation on element
  WebDriverWait wait = new WebDriverWait(driver, 20);
  
//we need to pass locator and wait time as the parameters to the below method
  WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
  
  // Here do click textboxs ready to right
  searchBox.click();
  // Here write what you want search 
  searchBox.sendKeys("t-shirt");
  
  // then click button search
  searchBox.submit();
  Actions action = new Actions(driver);
 
  // Here chose what you want take it then check about xpath link
  WebElement SecondImg=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/span/a/div/img"));
  
  // Here click the picture you chose 
  WebElement MoreBtn=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/span/a"));
  Actions actions=new Actions(driver);
  
  // Here how can do it all that
  actions.moveToElement(SecondImg).moveToElement(MoreBtn).click().perform();

  //Click on add to cart
  driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
  
  // Do refresh for last page
  driver.navigate().refresh();
  driver.get("https://www.amazon.com/gp/huc/view.html?ie=UTF8&newItems=Cd9802e72-4194-4e87-88d7-23968b059325%2C1");
  
  Thread.sleep(2000);
  // close browser
   driver.quit();
 }
}