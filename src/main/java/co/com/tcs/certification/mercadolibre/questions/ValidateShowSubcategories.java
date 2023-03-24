package co.com.tcs.certification.mercadolibre.questions;

import co.com.tcs.certification.mercadolibre.userinterfaces.HomePage;
import co.com.tcs.certification.mercadolibre.utils.OperationOnList;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

public class ValidateShowSubcategories implements Question<Boolean> {

    //Lista que guardara los textos de cada WebElement
    List<String> textListSubcategories = new ArrayList<>();

    @Override
    public Boolean answeredBy(Actor actor) {

        List<WebElementFacade> subCategoriesFromPage = HomePage.SUBCATEGORIES.resolveAllFor(actor);
        textListSubcategories = OperationOnList.getTextListSubcategories(subCategoriesFromPage, textListSubcategories);

        for (String string : textListSubcategories) {
            System.out.println(string);
        }

        return true;
    }

    public static ValidateShowSubcategories isPresent() {
        return new ValidateShowSubcategories();
    }

}
