package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TaggedStepDef {

	//Contact 
	@Given("User is logged in")
	public void user_is_logged_in() {
	    System.out.println("User Logged in");
	}
	@When("User created new Contact")
	public void user_created_new_contact() {
		System.out.println("User created new Contact");
	}
	
	@When("User view Contact details")
	public void user_view_contact_details() {
		System.out.println("User view Contact details");
	}
	
	@When("User delete Contact")
	public void user_delete_contact() {
		System.out.println("User delete Contact");
	}
	
	//Deals
	@When("User created new Deals")
	public void user_created_new_deals() {
		System.out.println("User created new Deals");
	}
	
	@When("User view Deals details")
	public void user_view_deals_details() {
		System.out.println("User view Deals details");
	}
	
	@When("User delete Deals")
	public void user_delete_deals() {
		System.out.println("User delete Deals");
	}
	
	//Tasks
	
	@When("User created new Tasks")
	public void user_created_new_tasks() {
		System.out.println("User created new Tasks");
	}
	
	@When("User view Tasks details")
	public void user_view_tasks_details() {
		System.out.println("User view Tasks details");
	}
	
	@When("User delete Tasks")
	public void user_delete_tasks() {
		System.out.println("User delete Tasks");
	}
	
	
	
	

}
