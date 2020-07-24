package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver d;
	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\leena\\test\\Bella_Web_Mobile_BDD_Framework\\src\\main\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");
	   d = new ChromeDriver();
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	d.get("https://tst01-bell-cms3.rankgrouptech.net/");
	}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Reset the credential");
	}


}
