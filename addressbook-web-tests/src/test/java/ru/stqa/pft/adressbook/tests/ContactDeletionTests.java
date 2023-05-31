package ru.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() {
    if (! app.getContactHelper().isContactPresent()){
      app.getContactHelper().createNewContact(new ContactData("test1", "+111111111", "test", "test1@test1.ru"));
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContacts();
  }
}
