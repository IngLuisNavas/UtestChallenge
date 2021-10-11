package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import userinterface.UtestFormStepOne;


public class NextLocation implements Task {

    public static NextLocation onThePage() {
        return Tasks.instrumented(NextLocation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestFormStepOne.JOIN_TODAY), //Ojo con esto IMPORTANTE
                Enter.theValue("Felipe").into(UtestFormStepOne.INPUT_FIRST_NAME),
                Enter.theValue("Navas").into(UtestFormStepOne.INPUT_LAST_NAME),
                Enter.theValue("luisfelipenavas@hotmail.com").into(UtestFormStepOne.INPUT_EMAIL),
                SendKeys.of("April").into(UtestFormStepOne.INPUT_BIRTH_MONTH),
                SendKeys.of("30").into(UtestFormStepOne.INPUT_BIRTH_DAY),
                SendKeys.of("1996").into(UtestFormStepOne.INPUT_BIRTH_YEAR),
                Enter.theValue("Spanish").into(UtestFormStepOne.INPUT_LANGUAGES_SPOKEN),
                Click.on(UtestFormStepOne.NEXT_LOCATION_BUTTON)
        );







    }
}
