package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {

  protected WebDriver wd;
  private ContactHelper contactHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private SessionHelper sessionHelper;

  public void init() {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    wd.get("http://localhost/addressbook/");
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    contactHelper = new ContactHelper(wd);
    sessionHelper.login();
  }

  public void stop() {
    sessionHelper.logOut();
    wd.quit();
  }

//  public boolean isElementPresent(By by) {
//    try {
//      wd.findElement(by);
//      return true;
//    } catch (NoSuchElementException e) {
//      return false;
//    }
//  }


  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }
}
