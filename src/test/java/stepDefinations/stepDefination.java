package stepDefinations;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import java.util.concurrent.TimeUnit;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(Cucumber.class)
public class stepDefination {
	
	WebDriver driver = null;

	@Given("^User is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RomanMacielRamirezMo\\Documents\\Roman\\Automation\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	 @When("^User put his email to create a new account$")
	    public void user_put_his_email_to_create_a_new_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement emailAddress = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
		emailAddress.sendKeys("romaneguer10@uno.com");
		WebElement createAccountButton = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));
		createAccountButton.click();
	}

	 @When("^User fill all the mandatory fields$")
	    public void user_fill_all_the_mandatory_fields() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
		firstName.sendKeys("Romanovik");
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
		lastName.sendKeys("Macieltov");
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		pass.sendKeys("sdet123");
		WebElement address = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
		address.sendKeys("Montes Urales 2106");
		WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		city.sendKeys("Guadalajara");
		WebElement state = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
		state.sendKeys("Arizona");
		WebElement zipcode = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
		zipcode.sendKeys("12345");
		WebElement mobile = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
		mobile.sendKeys("3312228726");
		WebElement createAccountButton = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
		createAccountButton.click();
	}

	

	 @Then("^Then New Account is created$")
	    public void then_new_account_is_created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Account created");
	}
	
	//-------------------------------------------------Sign In-------------------------------------------------------------------
	
	 @When("^User login into application with username and password$")
	    public void user_login_into_application_with_username_and_password() throws Throwable {
		WebElement user = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		user.sendKeys("romaneguer@uno.com");
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		pass.sendKeys("sdet123");
		WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		submitButton.click();
			
	    }
	 
	    @Then("^User is into his own account$")
	    	public void user_is_into_his_own_account() throws Throwable {
	    	System.out.println("User is loged in");
	    }
	    
	    //-------------------------------------------------Sign Off------------------------------------------------------------
	    @When("^User clicks on Sign Off button$")
	    public void user_clicks_on_sign_off_button() throws Throwable {
	    	WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
			submitButton.click();    
	    }

	    @Then("^User is logged off$")
	    public void user_is_logged_off() throws Throwable {
	    	System.out.println("User is loged offn");
	    }
	    
	    //-------------------------------------------------Shopping------------------------------------------------
	    @When("^User select the product$")
	    public void user_select_the_product() throws Throwable {
	    	WebElement TShirtsButton = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
	    	TShirtsButton.click();
	    }

	    @When("^User continue with checkout$")
	    public void user_continue_with_checkout() throws Throwable {
	    	WebElement QuickViewButton = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
	    	QuickViewButton.click();
	    	WebElement AddToCartButton = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
	    	AddToCartButton.click();
	    	WebElement ProceedToCheckoutButton = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
	    	ProceedToCheckoutButton.click();
	    	WebElement ProceedToCheckout2Button = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
	    	ProceedToCheckout2Button.click();
	    }

	    @When("^User validates the address$")
	    public void user_validates_the_address() throws Throwable {
	    	WebElement ProceedToCheckoutButton = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
	    	ProceedToCheckoutButton.click();
	    }

	    @When("^User validates the shipping method$")
	    public void user_validates_the_shipping_method() throws Throwable {
	    	WebElement Termscheckbox = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
	    	Termscheckbox.click();
	    	WebElement ProceedToCheckoutButton = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
	    	ProceedToCheckoutButton.click();
	        
	    }

	    @When("^User validates proceed with the payment$")
	    public void user_validates_proceed_with_the_payment() throws Throwable {
	    	WebElement PayWireButton = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
	    	PayWireButton.click();
	    }

	    @When("^User confirms the order$")
	    public void user_confirms_the_order() throws Throwable {
	    	WebElement ConfirmButton = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
	    	ConfirmButton.click();
	    }

	    @Then("^User complete the process$")
	    public void user_complete_the_process() throws Throwable {
	        
	    }
}
	
