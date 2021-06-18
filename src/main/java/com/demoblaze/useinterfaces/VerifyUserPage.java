package com.demoblaze.useinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VerifyUserPage extends PageObject {
    public static final Target USER_LOGIN = Target.the("Validate User").located(By.xpath("//a[@id='nameofuser']"));


}
