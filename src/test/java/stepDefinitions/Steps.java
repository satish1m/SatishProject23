package stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.pages.AddtoWishList;
import com.pages.ViewWishList;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	private Steps steps=new Steps(DriverFactory.getDriver());
	public Steps(WebDriver driver) {
		
	}

	@Given("I add four different products to my wish list")
	public void I_add_four_different_products_to_my_wish_list() {
		DriverFactory.getDriver()
		.get("https://testscriptdemo.com/");
		AddtoWishList addtoWishList = new AddtoWishList(DriverFactory.getDriver());
		addtoWishList.addtoWishList();
		//System.out.println("Check 1");
		
			}

	@When("I view my wishlist table")
	public void i_view_my_wishlist_table() {
		ViewWishList viewWishList = new ViewWishList(DriverFactory.getDriver());
		String name=viewWishList.viewList(); 
		System.out.println(name);
	}

	@Then("I find total for selected items in my wishlist")
	public void i_find_total_for_selected_items_in_my_wishlist() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I search for lowest price product")
	public void i_search_for_lowest_price_product() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I am able to add the lowest price item to my cart")
	public void i_am_able_to_add_the_lowest_price_item_to_my_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I am able to verify the item in my cart")
	public void i_am_able_to_verify_the_item_in_my_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
