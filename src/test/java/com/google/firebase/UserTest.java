package com.google.firebase;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

  @Test
  public void testUser() {
    User user = new User("Peter", "Parker", 20);
    Assert.assertEquals("Peter", user.getFirstName());
    Assert.assertEquals("Parker", user.getLastName());
    Assert.assertEquals(20, user.getAge());
  }
}
