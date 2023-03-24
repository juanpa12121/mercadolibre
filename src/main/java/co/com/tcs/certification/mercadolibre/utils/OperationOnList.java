package co.com.tcs.certification.mercadolibre.utils;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class OperationOnList {

    public static List<String> getTextListSubcategories(List<WebElementFacade> listSubcategories, List<String> stringList ){
        for(WebElementFacade element :listSubcategories ){
            stringList.add(element.getTextValue());
        }
        return stringList;
    }
}