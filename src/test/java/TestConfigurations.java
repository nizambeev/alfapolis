import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

// Прослушиваем тесты
@RunWith(MyRunner.class)

public class TestConfigurations{


    @BeforeClass
    public static void startTests() {
        Configuration.startMaximized = true;
        Configuration.browser = "chrome";
    }

    @Before
    public void setUp() {
        Selenide.open("https://alfapolis.ru/AlfaPolicy/");
    }

}
