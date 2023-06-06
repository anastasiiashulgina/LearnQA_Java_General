package ru.stqa.pft.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.model.ContactData;
import ru.stqa.pft.adressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContactModification() {
    if (! app.getContactHelper().isContactPresent()){
      app.getContactHelper().createNewContact(new ContactData("test1", "+111111111", "test", "test1@test1.ru"));
    }

    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().selectContact(before.size()-1);
    app.getContactHelper().initContactModification();
    ContactData newContact = new ContactData(before.get(before.size()-1).getId(),"12", "13", "14", "15");
    app.getContactHelper().fillNewContactForm(newContact);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().returnToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();

    Assert.assertEquals(after.size(), before.size());

    before.remove(before.size()-1);
    before.add(newContact);

    Comparator<? super ContactData> byID = Comparator.comparingInt(ContactData::getId);
    before.sort(byID);
    after.sort(byID);
    Assert.assertEquals(before, after);
  }

}
