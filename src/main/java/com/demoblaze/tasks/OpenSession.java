package com.demoblaze.tasks;

import com.demoblaze.models.DataLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.demoblaze.useinterfaces.StoreLoginPage.*;
public class OpenSession implements Task {

    DataLogin dataLogin;
    public OpenSession(DataLogin dataLogin){
        this.dataLogin = dataLogin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(dataLogin.getUserName()).into(USER_NAME),
                Enter.theValue(dataLogin.getPassword()).into(PASSWORD),
                Click.on(BUTTON_LOGIN)
        );
    }
    public static OpenSession login(DataLogin dataLogin){
        return instrumented(OpenSession.class, dataLogin);
    }
}
