package ru.stqa.pft.adressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.adressbook.model.ContactData;


public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {

    app.getNavigationHelper().goToNewContactPage();
    app.getContactHelper().fillNewContactForm(new ContactData("test1", "+111111111", "test", "test1@test1.ru"));
    app.getContactHelper().submitNewContactCreation();
    app.getNavigationHelper().returnToHomePage();
  }

}