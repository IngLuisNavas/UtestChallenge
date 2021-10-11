package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestFormStepThree {
    public static final Target YOUR_COMPUTER =
            Target.the("Input to enter the operating system of your PC in the form").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target YOUR_VERSION =
            Target.the("Input to enter the version operating system of your PC in the form").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target YOUR_LANGUAGE =
            Target.the("Input to enter the language of the operating system of your PC in the form").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/span[2]"));
    public static final Target NEXT_LAST_STEP =
            Target.the("Input button next last in the form").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));


}
