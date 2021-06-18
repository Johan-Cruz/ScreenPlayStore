package com.demoblaze.stepdefintions;

import com.demoblaze.models.DataLogin;
import com.demoblaze.questions.QuestionLoginUser;
import com.demoblaze.tasks.LoginUser;
import com.demoblaze.tasks.OpenSession;
import com.demoblaze.useinterfaces.StoreHomePage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import java.util.List;


public class LoginStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor johan = Actor.named("Johan");

    @Before
    public void setUp(){
        johan.can(BrowseTheWeb.with(hisBrowser));
        johan.wasAbleTo(Open.browserOn(new StoreHomePage()));
    }

    @Given("^I enter the page$")
    public void iEnterThePage() {
        johan.attemptsTo(LoginUser.theStoreLogin());


    }


    @When("^I log in$")
    public void iLogIn(List<DataLogin> dataLoginList) {
        johan.attemptsTo(OpenSession.login(dataLoginList.get(0)));

    }

    @Then("^I see my name on the page$")
    public void iSeeMyNameOnThePage(List<DataLogin>dataLoginList) {
        johan.should(seeThat(QuestionLoginUser.veficcation(dataLoginList.get(0))));
    }
}
