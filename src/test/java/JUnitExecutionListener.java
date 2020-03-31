import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class JUnitExecutionListener extends RunListener {

    @Override
    public void testStarted(Description description){
        System.out.println("{Инфо] Запущен тест: " + description);
    }

    @Override
    public void testFailure(Failure failure) {
        System.out.println("[Ошибка] Тест завершился ошибкой: " + failure);
    }

    @Override
    public void testRunFinished(Result result) {
        System.out.println("[Инфо] Тест завершен. Время выполнения: " + result.getRunTime() + " мс");
    }
}



