import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.Response;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by markus.hartung on 17.10.2016.
 */
public class FirefoxDriver extends org.openqa.selenium.firefox.FirefoxDriver {
    private List<String> validContexts = Arrays.asList("chrome", "content");

    public FirefoxDriver(DesiredCapabilities dc) {
        super(dc);
    }

    public void switchToContext(String context) {
        if (!validContexts.contains(context)) {
            throw new IllegalArgumentException("Invalid context: \"" + context + "\" , must be \"chrome\" or \"content\".");
        }
        execute(DriverCommand.MOZ_SWITCH_TO_CONTEXT, ImmutableMap.of("context", context));
    }

    protected Response execute(String driverCommand, Map<String, ?> parameters) {
        System.out.println("### execute: " + driverCommand);
        System.out.println(parameters);
        Response response;
        try {
          response = super.execute(driverCommand, parameters);
        } catch (WebDriverException e) {
            e.addInfo("Capabilities", "Not needed.");
            throw e;
        }
        System.out.println("### execute done: " + driverCommand);
        return response;
    }
}
