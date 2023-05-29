package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

  public SessionHelper(WebDriver wd) {
    super(wd);
  }

  public void login() {
    type(By.name("user"), "admin");
    type(By.name("pass"), "secret");
    click(By.xpath("//input[@value='Login']"));
  }

  public void logOut() {
    click(By.linkText("Logout"));
  }
}
