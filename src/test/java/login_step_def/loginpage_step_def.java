package login_step_def;

import io.cucumber.java.en.*;

public class loginpage_step_def {
	@Given("launch the browser")
	public void launch_the_browser() {
	    System.out.println("launch the browser");;
	}

	@When("go to the website")
	public void go_to_the_website() {
	}

	@When("login the user with <username> and <password>")
	public void login_the_user_with_username_and_password() {
	    
	}

	@Then("validate user logged in or not")
	public void validate_user_logged_in_or_not() {
	    
	}

}
