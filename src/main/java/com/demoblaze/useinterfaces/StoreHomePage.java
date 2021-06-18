package com.demoblaze.useinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com/")
public class StoreHomePage extends PageObject {

    public static final Target STORE_LOGIN = Target.the("Button Login").located(By.id("login2"));

}
