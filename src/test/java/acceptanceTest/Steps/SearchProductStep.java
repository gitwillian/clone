/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceptanceTest.Steps;


import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;


public class SearchProductStep{
    
   

    @Given("^I am on \"([^\"]*)\"$")
    public void I_am_on(String url) {
        assert true;
    }

    @When("^I search for \"([^\"]*)\"$")
    public void I_search_for(String item) {
        assert true;
    }

    @Then("^I should see the item$")
    public void I_should_see_the_item() {     
        assert false;
    }
}
