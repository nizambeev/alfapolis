package Pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement fieldUsername = $(By.xpath("//input[@id=\"username\"]"));
    private SelenideElement fieldPassword = $(By.xpath("//input[@id=\"password\"]"));
    private SelenideElement checkBoxRemember = $(By.xpath("//input[@id=\"gwt-uid-2\"]"));
    private SelenideElement notification = $(By.xpath("//h1[@class=\"v-Notification-caption\"]"));
    private SelenideElement buttonLogin = $(By.xpath("//*[@id=\"login_button\"]"));

    private String getTextNotification(){
        return notification.text();
    }

    public void sendUsername(String value) {
        fieldUsername.setValue(value);
    }

    public void sendPassword(String value) {
        fieldPassword.setValue(value);
    }

    public void clickCheckBoxRemember(){
        checkBoxRemember.click();
    }

    public void checkNotification(String text){
        Assert.assertEquals(getTextNotification(), text);
    }

    public void clickButtonLogin() {
        buttonLogin.click();
    }
}
