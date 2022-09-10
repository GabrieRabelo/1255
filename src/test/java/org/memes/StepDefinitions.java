package org.memes;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    private LetterUtils letterUtils;

    @Given("a letter counter")
    public void aLetterCounter() {
        letterUtils = new LetterUtils();
    }

    @When("I enter the following string {string}")
    public void iEnterTheFollowingString(String arg0) {
        System.out.println(arg0);
        letterUtils.readNext(arg0);
    }

    @Then("the most frequent letter should be {string}")
    public void theMostFrequentLetterShouldBe(String arg0) {
        assertEquals(arg0, letterUtils.getMostFrequent());
    }
}
