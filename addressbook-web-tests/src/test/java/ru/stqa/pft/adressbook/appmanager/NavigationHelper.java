package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

  public NavigationHelper(WebDriver wd) {
    super(wd);

  }

  public void returnToHomePage() {
    if (isElementPresent(By.id("maintable"))){
      return;
    }
    click(By.linkText("home page"));
  }


//  public void goToGroupPage() {
//    click(By.linkText("groups"));
//  }

  public void goToGroupPage() {
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent(By.name("new"))){
      return;
    }
    click(By.linkText("groups"));
  }
}
