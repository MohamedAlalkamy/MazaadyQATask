package Tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import javax.swing.Action;
import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.Login;

public class userLoginTestAndAddProductTest extends TestBase {

//	public JavascriptExecutor jse;
//    public Select select;
	
	
      Login loginPage_object;


      String Email="test22@gmail.com";
      String Password="123456789";

      @Test(priority = 1)
      public void login_success()
      {
    	  loginPage_object=new Login(driver);
          loginPage_object.userLogin(Email,Password);
      }
      
      
      @Test(priority = 2)
      public void AddProduct() throws InterruptedException, AWTException
      {
    	  
    	  WebDriverWait wait=new WebDriverWait(driver, 10);	  
      JavascriptExecutor jse=(JavascriptExecutor)driver;
     
     WebElement Dropdown=  driver.findElement(By.className("action-icons-text"));
     Actions action = new Actions(driver);
     action.moveToElement(Dropdown).perform();
       
      driver.findElement(By.xpath("/html/body/div/header/div/div/div[2]/div/div/div[2]/div/ul/li[5]/a")).click();
      driver.findElement(By.xpath("//*[@id=\"step-1\"]/div/div[3]/div/button")).click();
      Thread.sleep(700);
      jse.executeScript("window.scroll(0,500)");
      Thread.sleep(700);
      
      //step 2
      
      
      driver.findElement(By.name("title")).sendKeys("Hello");
      Thread.sleep(700);
      
      driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input")).click();
      Thread.sleep(700);
      driver.findElement(By.xpath("//*[@id=\"vs3__listbox\"]")).click();
      
      Thread.sleep(700);
      driver.findElement(By.xpath("//*[@id=\"vs4__combobox\"]/div[1]/input")).click();
      Thread.sleep(700);
      driver.findElement(By.xpath("//*[@id=\"vs4__listbox\"]")).click();
      
      Thread.sleep(700);
      jse.executeScript("window.scroll(0,800)");
      
      Thread.sleep(700);
      driver.findElement(By.xpath("//*[@id=\"vs10__combobox\"]/div[1]/input")).click();
      Thread.sleep(700);
      driver.findElement(By.xpath("//*[@id=\"vs10__listbox\"]")).click();
      
      
      Thread.sleep(700);
      driver.findElement(By.name("quantity")).sendKeys("5");
      
      
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"vs5__combobox\"]/div[1]/input")).click();
    Thread.sleep(700);
    driver.findElement(By.xpath("//*[@id=\"vs5__listbox\"]")).click();
    
    Thread.sleep(700);
    driver.findElement(By.xpath("//*[@id=\"vs6__combobox\"]/div[1]/input")).click();
    Thread.sleep(700);
    driver.findElement(By.xpath("//*[@id=\"vs6__listbox\"]")).click();
    
    
    
//    
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-controls=\"vs7__listbox\"]")));
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id=\"vs7__listbox\"]")));
    
    
    Thread.sleep(5000); 
    driver.findElement(By.xpath("//*[@id=\"vs7__combobox\"]/div[1]/input")).click();
    Thread.sleep(700);
    driver.findElement(By.xpath("//*[@id=\"vs7__listbox\"]")).click();
    
    Thread.sleep(700);
    driver.findElement(By.xpath("//*[@id=\"step-2\"]/span/div[2]/div[7]/div/span[2]/input")).sendKeys("Test");
    
    
    Thread.sleep(700);
    driver.switchTo().frame("tinymce_description_ifr");
    Thread.sleep(700);
    driver.findElement(By.id("tinymce")).sendKeys("Test");
    driver.switchTo().defaultContent();
    
     Thread.sleep(700);
     jse.executeScript("window.scroll(0,3000)");
     
		
		//open upload window
		WebElement fileUploader = driver.findElement(By.xpath("//*[@id=\"step-2\"]/span/div[2]/div[10]/div/div/div[1]/div/div[3]/label")); 
		fileUploader.click();

	     //put path to your image in a clipboard
	     StringSelection ss = new StringSelection("D:\\images\\me.jpg");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

	     
	     //imitate mouse events like ENTER, CTRL+C, CTRL+V
	     Robot robot = new Robot();
	     robot.delay(250);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.delay(90);
	     robot.keyRelease(KeyEvent.VK_ENTER);


    
    Thread.sleep(700);
    driver.findElement(By.xpath("//*[@id=\"step-2\"]/span/div[2]/div[13]/div/button[2]")).click();
    
 
  //Step3

    
    Thread.sleep(700);
    driver.findElement(By.xpath("//*[@id=\"vs8__combobox\"]/div[1]/input")).click();
    Thread.sleep(700);
    driver.findElement(By.xpath("//*[@id=\"vs8__listbox\"]")).click();
    
    driver.findElement(By.xpath("//*[@id=\"step-3\"]/span/div/div[3]/div[1]/span[2]/input")).sendKeys("5");

    
    Thread.sleep(700);
    driver.findElement(By.xpath("//*[@id=\"vs9__combobox\"]/div[1]/input")).click();
    Thread.sleep(700);
    driver.findElement(By.xpath("//*[@id=\"vs9__listbox\"]")).click();
    
    //date
    Thread.sleep(700);
    driver.findElement(By.xpath("//*[@id=\"vue-button-to-open-date\"]")).click();
    Thread.sleep(700);
    driver.findElement(By.xpath("//*[@id=\"mddtp-date__current\"]/div[2]/div[2]/span[27]")).click();
    driver.findElement(By.xpath("//*[@id=\"mddtp-date__ok\"]")).click();
    
    //time
    Thread.sleep(700);
    driver.findElement(By.xpath("//*[@id=\"vue-button-to-open-time\"]")).click();
    Thread.sleep(700);
    driver.findElement(By.xpath("//*[@id=\"mddtp-time__ok\"]")).click();
    
    Thread.sleep(700);
    driver.findElement(By.xpath("//*[@id=\"step-3\"]/span/div/div[9]/span/div[1]/label/span[2]")).click();
    
    
    Thread.sleep(700);
    driver.findElement(By.xpath("//*[@id=\"step-3\"]/span/div/div[11]/div/button[2]")).click();
    
    
    //step 4
    
    Thread.sleep(700);
    driver.findElement(By.xpath("//*[@id=\"step-4\"]/span/div/div[2]/div/button")).click();
    
    

   

      }
	

	
}

