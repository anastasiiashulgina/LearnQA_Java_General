package ru.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContactModification() {
    if (! app.getContactHelper().isContactPresent()){
      app.getContactHelper().createNewContact(new ContactData("test1", "+111111111", "test", "test1@test1.ru"));
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillNewContactForm(new ContactData("12", "13", "14", "15"));
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().returnToHomePage();
  }

}
