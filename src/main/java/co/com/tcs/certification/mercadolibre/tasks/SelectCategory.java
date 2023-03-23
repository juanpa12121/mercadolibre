package co.com.tcs.certification.mercadolibre.tasks;

import co.com.tcs.certification.mercadolibre.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectCategory implements Task {
    String category;

    public SelectCategory(String category) {
        this.category = category;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.CATEGORIES_OPTIONS),
                Click.on(HomePage.CATEGORY_OPTION.of(category))
        );
    }

    public static SelectCategory option(String category) {
        return Tasks.instrumented(SelectCategory.class, category);
    }
}
