package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestFormStepThree;



public class NextLastStep implements Task {
    public static NextLastStep onThePageThree() {
        return Tasks.instrumented(NextLastStep.class);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                /*Enter.theValue("Windows").into(UtestFormStepThree.YOUR_COMPUTER),
                Enter.theValue("10").into(UtestFormStepThree.YOUR_VERSION),
                Enter.theValue("Spanish").into(UtestFormStepThree.YOUR_LANGUAGE),*/
                Click.on(UtestFormStepThree.NEXT_LAST_STEP)



        );

    }
}
