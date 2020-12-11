package stepdef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.annotations.Test;

@Test
public class MyStepdefs {
    public MyStepdefs() {

    }
    @Given("abc")
    public void abc() {
        System.out.println("123");

    }

    @Then("dcs")
    public void dcs() {
        System.out.println("234");
         }
}
