package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestFormLastStep;

public class CompleteSetup implements Task {
    public static CompleteSetup onThePageFinal() {
        return Tasks.instrumented(CompleteSetup.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Chaguala123").into(UtestFormLastStep.INPUT_PASSWORD),
                Enter.theValue("Chaguala123").into(UtestFormLastStep.CONFIRM_PASSWORD),
                Click.on(UtestFormLastStep.CHECK_TERM_USE),
                Click.on(UtestFormLastStep.CHECK_PRIVACY),
                Click.on(UtestFormLastStep.COMPLETE_SETUP)

        );


    }
}
