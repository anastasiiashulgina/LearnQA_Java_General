package ru.stqa.pft.adressbook.tests;
import org.testng.annotations.*;
import ru.stqa.pft.adressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().createGroup(new GroupData("test2", "test3", "test1"));
  }



}