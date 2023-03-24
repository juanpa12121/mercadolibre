package co.com.tcs.certification.mercadolibre.questions;

import co.com.tcs.certification.mercadolibre.userinterfaces.HomePage;
import co.com.tcs.certification.mercadolibre.utils.CSVUtilities;
import co.com.tcs.certification.mercadolibre.utils.OperationOnList;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

public class ValidateShowSubcategories implements Question<Boolean> {

    //Lista que guardara los textos de cada WebElement
    List<String> textListSubcategoriesFromPage = new ArrayList<>();
    List<String> textListSubcategoriesFromCsv = new ArrayList<>();

    @Override
    public Boolean answeredBy(Actor actor) {

        List<WebElementFacade> subCategoriesFromPage = HomePage.SUBCATEGORIES.resolveAllFor(actor);

        //En esta lista se guardan los strings de cada WebElement, retornados por el método
        textListSubcategoriesFromPage = OperationOnList.getTextListSubcategories(subCategoriesFromPage, textListSubcategoriesFromPage);

        //En esta lista se guardan los strings del csv, retornados por la utilidad CSVUtilities
        textListSubcategoriesFromCsv = CSVUtilities.getListSubcategories();

        System.out.println("From page");
        for (String string : textListSubcategoriesFromPage) {
            System.out.println(string);
        }

        int cont = 0;
        System.out.println("\nFrom CSV");
        for (String string : textListSubcategoriesFromCsv) {
            System.out.println(string);
            cont++;
        }
        System.out.println(cont);

        return textListSubcategoriesFromCsv.equals(textListSubcategoriesFromPage);
    }

    public static ValidateShowSubcategories isPresent() {
        return new ValidateShowSubcategories();
    }

}
