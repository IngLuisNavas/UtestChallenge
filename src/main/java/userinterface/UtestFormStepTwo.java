package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestFormStepTwo {

    public static final Target INPUT_CITY =
            Target.the("Input to enter the city in the form").located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE =
            Target.the("Input to enter the postal code in the form").located(By.id("zip"));
    public static final Target INPUT_COUNTRY =
            Target.the("Input to enter the country in the form").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target NEXT_DEVICES =
            Target.the("Input go to step two form").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));

}
