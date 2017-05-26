import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.Extension;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;
import java.util.concurrent.TimeUnit;

public class PopupTest {
  public static void main(String[] args) throws InterruptedException {

//    System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Nightly\\firefox.exe");
//    System.setProperty("webdriver.firefox.bin", "C:\\mozilla-source\\mozilla-central\\obj-i686-pc-mingw32\\dist\\bin\\firefox.exe");
    FirefoxProfile profile = new FirefoxProfile();
//    profile.setPreference("devtools.debugger.remote-enabled", true);
//    profile.setPreference("devtools.debugger.prompt-connection", false);
//    profile.setPreference("devtools.chrome.enabled", true);

    String extensionName = "marionette-popup-bug@avira.com";
    String extensionIdentifier = "marionette-popup-bug_avira_com";
    File extensionDir = new File("extension");
    By domainSelector = By.tagName("h1");

    Extension extension = new UnpackedExtension(extensionName, extensionDir);
    profile.addExtension(extensionName, extension);

    DesiredCapabilities dc = new DesiredCapabilities();
    dc.setCapability(FirefoxDriver.PROFILE, profile);

    FirefoxDriver driver = new FirefoxDriver(dc);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    By extensionIconSelector = By.id(extensionIdentifier + "-browser-action");
    By popupPanelSelector = By.id("PanelUI-webext-" + extensionIdentifier + "-browser-action-view");
    By popupBrowserSelector = By.tagName("browser");

    driver.navigate().to("http://www.example.com");

    driver.switchToContext("chrome");
    driver.findElement(extensionIconSelector).click();

    driver.switchTo().frame(driver.findElement(popupPanelSelector).findElement(popupBrowserSelector));
    driver.executeScript("console.log('Hello World!')");
    WebElement domain = driver.findElement(domainSelector);
    domain.isDisplayed();
    driver.switchTo().defaultContent();
    driver.findElement(extensionIconSelector).sendKeys(Keys.ESCAPE);
    // Wait until the popup browser is garbage collected
    Thread.sleep(2000);

    driver.executeScript("console.log('Bye Bye World!')");
  }
}
