package com.programming.techie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ContactManagerTest {

  @Test
  public void shouldCreateContact() {
    ContactManager contactManager = new ContactManager();
    contactManager.addContact("firstname", "lastname", "0812345679");
    Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
    Assertions.assertEquals(1, contactManager.getAllContacts().size());
    Assertions.assertTrue(contactManager.getAllContacts().stream());
  }

}