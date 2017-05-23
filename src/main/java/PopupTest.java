import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.Extension;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;
import java.util.concurrent.TimeUnit;

public class PopupTest {
  public static void main(String[] args) throws InterruptedException {

    FirefoxProfile profile = new FirefoxProfile();

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
    WebElement domain = driver.findElement(domainSelector);
    domain.isDisplayed();
    driver.switchTo().defaultContent();
    driver.findElement(extensionIconSelector).sendKeys(Keys.ESCAPE);

    Thread.sleep(2000);
    driver.findElement(extensionIconSelector).isDisplayed();
  }
}
