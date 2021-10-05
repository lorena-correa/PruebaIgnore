package co.com.choucair.certification.academy.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import co.com.choucair.certification.academy.userinterface.ChoucairAcademyPage;


public class OpenUp implements Task  {
    private ChoucairAcademyPage ChoucairAcademyPage;
    public static OpenUp thePage() {
            return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(ChoucairAcademyPage));
    }
}