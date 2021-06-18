package com.demoblaze.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.demoblaze.useinterfaces.StoreHomePage.STORE_LOGIN;

public class Seleccionar implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(STORE_LOGIN));
    }
    public static Seleccionar login(){
        return instrumented(Seleccionar.class);

    }
}
