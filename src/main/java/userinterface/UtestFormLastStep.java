package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestFormLastStep {
    public static final Target INPUT_PASSWORD =
            Target.the("Input the password").located(By.xpath("//*[@id=\"password\"]"));
    public static final Target CONFIRM_PASSWORD =
            Target.the("Input the password").located(By.xpath("//*[@id=\"confirmPassword\"]"));
    public static final Target CHECK_TERM_USE =
            Target.the("Check for the Utest terms of use").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECK_PRIVACY =
            Target.the("Check for accept Privacy y Security Policy").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target COMPLETE_SETUP =
            Target.the("Input Button Complete Setup").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));


}
