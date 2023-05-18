package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FirstFeaturesStepDefinitions {
    int int1, int2, sum;

    @Given("we have number 5")
    public void weHaveNumber() {
        int1=5;
    }
    @Given("we have number 3")
    public void weHaveNum() {
        int2=3;
    }

    @When("these numbers are added each other")
    public void theseNumbersAreAddedEachOther() {
        sum=int1+int2;
    }

    @Then("the result should be 8")
    public void theResultShouldBe() {
        Assert.assertEquals(3+5,sum);
    }
}
