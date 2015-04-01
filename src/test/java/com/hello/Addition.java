package com.hello;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
/**
 * Created by tommy.wang on 4/1/2015.
 */
public class Addition {
    int a, b, sum;
    @Given("^I have variables (\\d+) and (\\d+)$")
    public void i_have_variables_as(int a, int b){
        this.a =a;
        this.b =b;
    }

    @Then("^I display the (\\d+)$")
    public void I_display_the_sum(int sum) throws Throwable {
        assertThat(this.sum, is(sum));
    }

    @When("^I add them$")
    public void I_add_them() throws Throwable {
        sum = a + b;
    }
}
