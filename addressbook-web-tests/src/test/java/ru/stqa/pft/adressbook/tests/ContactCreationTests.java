package ru.stqa.pft.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.adressbook.model.ContactData;
import ru.stqa.pft.adressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;


public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    ContactData contact = new ContactData("test1", "+111111111", "test", "test1@test1.ru");

    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().goToNewContactPage();
    app.getContactHelper().fillNewContactForm(contact);
    app.getContactHelper().submitNewContactCreation();
    app.getNavigationHelper().returnToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();

    Assert.assertEquals(after.size(), before.size() + 1);

    int max = after.stream().max(Comparator.comparingInt(ContactData::getId)).get().getId();
    contact.setId(max);
    before.add(contact);

    Comparator<? super ContactData> byID = Comparator.comparingInt(ContactData::getId);
    before.sort(byID);
    after.sort(byID);

    Assert.assertEquals(before, after);

  }

}