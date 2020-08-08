package stepdefination;

import cucumber.api.java.en.Then;
import pOM.Specials;

public class SpecialsSteps {

   Specials specials = new Specials();

    @Then("^Navigaye to SpecialsPage$")
    public void navigaye_to_SpecialsPage()  {
        specials.findElementAndClickFunction("Specials");

    }


    @Then("^Verify itmes has a discount$")
    public void verifyItmesHasADiscount() {
        specials.findElementAndVerifyElementContainText("-");
    }
}
