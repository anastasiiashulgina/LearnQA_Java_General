package ru.stqa.pft.adressbook.model;

import java.util.Objects;

public final class ContactData {
  private final String lastName;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactData that = (ContactData) o;
    return Objects.equals(lastName, that.lastName) && Objects.equals(firstName, that.firstName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastName, firstName);
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "lastName='" + lastName + '\'' +
            ", firstName='" + firstName + '\'' +
            ", id=" + id +
            '}';
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public int getId() {
    return id;
  }

  private final String mobile;
  private final String firstName;
  private final String email;

  public void setId(int id) {
    this.id = id;
  }

  private  int id;

  public ContactData(String lastName, String mobile, String firstName, String email) {
    this.id = Integer.MIN_VALUE;
    this.lastName = lastName;
    this.mobile = mobile;
    this.firstName = firstName;
    this.email = email;
  }

  public ContactData(int id, String lastName, String mobile, String firstName, String email) {
    this.id = id;
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