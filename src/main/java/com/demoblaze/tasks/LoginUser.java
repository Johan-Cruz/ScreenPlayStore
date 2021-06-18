package com.demoblaze.tasks;

import com.demoblaze.interactions.Seleccionar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.demoblaze.useinterfaces.StoreHomePage.*;
public class LoginUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Seleccionar.login()
        );
    }
    public static LoginUser theStoreLogin(){
        return instrumented(LoginUser.class);
    }
}
