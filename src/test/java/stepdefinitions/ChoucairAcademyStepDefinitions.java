package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.*;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^Felipe wanted to use the registration form in Utest$")
    public void felipeWantedToUseTheRegistrationFormInUtest() {
        OnStage.theActorCalled("Felipe").wasAbleTo(OpenUp.thePage());
    }

    @When("^Felipe completes the fields in the form$")
    public void felipeCompletesTheFieldsInTheForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(NextLocation.onThePage());
        OnStage.theActorInTheSpotlight().attemptsTo(NextDevices.onThePageTwo());
        OnStage.theActorInTheSpotlight().attemptsTo(NextLastStep.onThePageThree());


    }

    @Then("^Felipe complete the form$")
    public void felipeCompleteTheForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteSetup.onThePageFinal());

    }

}
