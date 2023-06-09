package co.com.tcs.certification.mercadolibre.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target CATEGORIES_OPTIONS = Target.the("Menu of the categories").located(By.className("nav-menu-categories-link"));
    public static final Target CATEGORY_OPTION = Target.the("Select category option").locatedBy("//a[text()='{0}']");
    public static final Target SUBCATEGORIES = Target.the("Subcategories").locatedBy("//h3[@class='title']");
    public static final Target BTN_COOKIES = Target.the("Button cookies").locatedBy("//button[text()='Entendido']");
    public static final Target NAV_LOGO = Target.the("Nav Logo").locatedBy("//a[@class='nav-logo']");



}
