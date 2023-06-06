package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.adressbook.model.ContactData;
import ru.stqa.pft.adressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

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

//   public void selectContact() {
//    click(By.name("selected[]"));
//  }

  public void selectContact(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
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

  public boolean isContactPresent() {
   return isElementPresent(By.name("selected[]"));
  }

  public void createNewContact(ContactData contactData) {
    goToNewContactPage();
    fillNewContactForm(contactData);
    submitNewContactCreation();
    returnToHomePage();
  }

  public void returnToHomePage() {
    click(By.linkText("home page"));
  }
  public void goToNewContactPage() {
    click(By.linkText("add new"));
  }

  public List<ContactData> getContactList() {
    List<ContactData> contacts = new ArrayList<>();
    List<WebElement> elements = wd.findElements(By.cssSelector("[name=\"entry\"]"));
    for (WebElement element: elements){
      String firstname = element.findElement(By.xpath(".//td[3]")).getText();
      String lastname = element.findElement(By.xpath(".//td[2]")).getText();
      int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("id"));
      ContactData contact  = new ContactData(id,lastname, null, firstname, null);
      contacts.add(contact);
    }
    return contacts;
  }

}
