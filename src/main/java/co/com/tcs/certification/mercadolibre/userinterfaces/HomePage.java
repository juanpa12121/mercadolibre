package co.com.tcs.certification.mercadolibre.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target CATEGORIES_OPTIONS = Target.the("Menu of the categories").located(By.className("nav-menu-categories-link"));
    public static final Target CATEGORY_OPTION = Target.the("Select category option").locatedBy(("//a[text()='{0}']"));
}
