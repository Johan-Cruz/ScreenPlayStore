package com.demoblaze.useinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class StoreLoginPage extends PageObject {

    public static final Target USER_NAME = Target.the("Aggregate user name").located(By.id("loginusername"));
    public static final Target PASSWORD = Target.the("Aggregate password").located(By.id("loginpassword"));
    public static final Target BUTTON_LOGIN = Target.the("Button login user").located(By.xpath("//body/div[@id='logInModal']/div[1]/div[1]/div[3]/button[2]"));

}
