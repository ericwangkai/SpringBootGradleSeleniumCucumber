package com.hello;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by tommy.wang on 3/27/2015.
 */
public class HelloWorld {

    @Given("^I want to learn Cucumber$")
    public void I_want_to_learn_Cucumber() throws Throwable {
        // Express the Regexp above with the code you wish you had
       // throw new PendingException();
    }

    @When("^I start learning$")
    public void I_start_learning() throws Throwable {
        // Express the Regexp above with the code you wish you had
       // throw new PendingException();
    }

    @Then("^I type in \"([^\"]*)\"$")
    public void I_type_in(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
        assertThat(1, is(2));
    }
}
