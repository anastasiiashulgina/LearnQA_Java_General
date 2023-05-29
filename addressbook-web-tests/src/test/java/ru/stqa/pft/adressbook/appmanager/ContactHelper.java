package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.adressbook.model.ContactData;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void submitNewContactCreation() {
    click(By.xpath("//input[21]"));
  }

  public void fillNewContactForm(ContactData contactData) {
    type(By.name("firstname"),contactData.firstName());
    type(By.name("lastname"),contactData.lastName());
    type(By.name("mobile"), contactData.mobile());
    type(By.name("email"),contactData.email());
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void deleteContacts() {
    click(By.xpath("//input[@value='Delete']"));
    wd.switchTo().alert().accept();
  }

  public void initContactModification() {
    click(By.xpath("//img[@title='Edit']"));
  }

  public void submitContactModification() {
    click(By.name("update"));
  }
}
