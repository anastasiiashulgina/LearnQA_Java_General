package ru.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.model.GroupData;

public class GroupModificationTests extends TestBase{

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().goToGroupPage();
    if (! app.getGroupHelper().isGroupPresent()){
      app.getGroupHelper().createGroup(new GroupData("test", null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("1", "2", "3"));
    app.getGroupHelper().submitGroupModification();
    app.getNavigationHelper().goToGroupPage();
  }
}
