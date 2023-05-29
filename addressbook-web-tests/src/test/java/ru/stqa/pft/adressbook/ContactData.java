package ru.stqa.pft.adressbook;

import java.util.Objects;

public final class ContactData {
  private final String lastName;
  private final String mobile;
  private final String firstName;
  private final String email;

  public ContactData(String lastName, String mobile, String firstName, String email) {
    this.lastName = lastName;
    this.mobile = mobile;
    this.firstName = firstName;
    this.email = email;
  }

  public String lastName() {
    return lastName;
  }

  public String mobile() {
    return mobile;
  }

  public String firstName() {
    return firstName;
  }

  public String email() {
    return email;
  }


}