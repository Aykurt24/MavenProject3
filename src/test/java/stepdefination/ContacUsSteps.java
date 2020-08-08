package stepdefination;

import cucumber.api.DataTable;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import pOM.ContactUs;
import pOM.ParentClass;

import java.util.List;

public class ContacUsSteps {

    ParentClass parentClass = new ParentClass();
    ContactUs contactUs = new ContactUs();

    @Then("^Navigaye to contacUsPage$")
    public void navigayeToContacUsPage() {

        contactUs.findElementAndClickFunction("contactUsButton");
    }

    @Then("^Click on the SubjectHeading options class$")
    public void Click_on_the_SubjectHeading_options_class() {

        contactUs.findElementAndClickFunction("Option2");


    }

    @Then("^Input a message$")
    public void sendAMessage(DataTable elements) {

            List<List<String>> AllElementsNameAndValue = elements.asLists(String.class);

            for (int i = 0; i < AllElementsNameAndValue.size(); i++) {

                System.out.println(AllElementsNameAndValue.get(i).get(0));
                System.out.println(AllElementsNameAndValue.get(i).get(1));

                contactUs.findElementAndSenKeys(AllElementsNameAndValue.get(i).get(0), AllElementsNameAndValue.get(i).get(1));

            }



    }

    @Then("^Send message$")
    public void sendMessage() {
        contactUs.findElementAndClickFunction("SubmitMessage");
    }

    @Then("^Verify Successfull message$")
    public void verifySuccessfullMessage() {
       contactUs.findElementAndVerifyElementContainText("SuccesMessage","successfully");
    }


}






