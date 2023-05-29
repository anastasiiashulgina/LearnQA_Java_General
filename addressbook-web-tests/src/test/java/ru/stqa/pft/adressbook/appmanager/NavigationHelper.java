package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

  public NavigationHelper(WebDriver wd) {
    super(wd);

  }

  public void returnToHomePage() {
    click(By.linkText("home page"));
  }

  public void goToNewContactPage() {
    click(By.linkText("add new"));
  }

  public void goToGroupPage() {
    click(By.linkText("groups"));
  }
}
