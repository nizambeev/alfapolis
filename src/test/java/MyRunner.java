import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class MyRunner extends BlockJUnit4ClassRunner {
    public MyRunner(Class<?> myRunner) throws InitializationError {
        super(myRunner);
    }

    @Override public void run(RunNotifier runNotifier){
        runNotifier.addListener(new JUnitExecutionListener());
        runNotifier.fireTestRunStarted(getDescription());
        super.run(runNotifier);
    }
}
