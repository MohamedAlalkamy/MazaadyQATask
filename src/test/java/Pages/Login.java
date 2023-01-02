package Pages;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login extends PageBase {
	
	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

    
    
    @FindBy(id = "email")
      WebElement email_txtbox;

    @FindBy(id = "password")
    WebElement password_txtbox;

    @FindBy(css ="#app > section.page-section.bg-gray.mb-0.pt-5 > div > form > div.row.mb-2 > div > button")
    WebElement login_btn;
    
    public void userLogin( String email , String password  )
    {
        setElementText(email_txtbox,email);
        setElementText(password_txtbox,password);
        clickButton(login_btn);
    }
    
    
	

}
