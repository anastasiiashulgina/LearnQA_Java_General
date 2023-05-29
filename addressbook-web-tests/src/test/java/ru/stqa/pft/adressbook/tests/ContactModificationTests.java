package ru.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContactModification() {
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillNewContactForm(new ContactData("12", "13", "14", "15"));
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().returnToHomePage();
  }

}
