package com.demoblaze.questions;

import com.demoblaze.models.DataLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import  static com.demoblaze.useinterfaces.VerifyUserPage.*;

public class QuestionLoginUser implements Question {

    private final DataLogin dataLogin;

    public QuestionLoginUser(DataLogin dataLogin){
        this.dataLogin = dataLogin;
    }
    @Override
    public Object answeredBy(Actor actor) {
        if (Text.of(USER_LOGIN).viewedBy(actor).asString().equals(dataLogin.getUserName()))
            return true;
        else
            return false;
    }
    public static QuestionLoginUser veficcation(DataLogin dataLogin){
        return  new QuestionLoginUser(dataLogin);
    }
}
