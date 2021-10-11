package userinterface;


import com.google.inject.internal.asm.$Type;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestFormStepOne {

    public static final Target JOIN_TODAY =
            Target.the("Input to enter at form").located(By.xpath("//div[@class=\"unauthenticated-container\"]/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target INPUT_FIRST_NAME =
            Target.the("Input to enter the first name in the form").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME =
            Target.the("Input to enter the last name in the form").located(By.id("lastName"));
    public static final Target INPUT_EMAIL =
            Target.the("Input to enter the email in the form").located(By.id("email"));
    public static final Target INPUT_BIRTH_MONTH =
            Target.the("Input to enter the birth month in the form").located(By.xpath("//*[@id=\"birthMonth\"]"));
    public static final Target INPUT_BIRTH_DAY =
            Target.the("Input to enter the birth day in the form").located(By.xpath("//*[@id=\"birthDay\"]"));
    public static final Target INPUT_BIRTH_YEAR =
            Target.the("Input to enter the birth year in the form").located(By.xpath("//*[@id=\"birthYear\"]"));
    public static final Target INPUT_LANGUAGES_SPOKEN =
            Target.the("Input to enter the languages spoken in the form").located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target NEXT_LOCATION_BUTTON =
            Target.the("Input go to step two form").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span"));
}
