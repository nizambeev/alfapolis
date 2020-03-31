import Pages.LoginPage;
import org.junit.Test;

public class AlfaTest extends TestConfigurations{


    @Test
    public void auth() {
        LoginPage loginPage = new LoginPage();

        loginPage.sendUsername("Test");
        loginPage.sendPassword("password");
        loginPage.clickCheckBoxRemember();
        loginPage.clickButtonLogin();
        loginPage.checkNotification("Ошибка аутентификации. Пользователь не найден в системе");
    }


}
