package steps;

import elements.LoginPageElements;


public class LoginPage extends LoginPageElements {
    public static void authorization(String login, String pass) {
        if (userName.exists()) {
            userName.sendKeys(login);
            password.sendKeys(pass);
            enterBtn.click();
        }
    }
}
