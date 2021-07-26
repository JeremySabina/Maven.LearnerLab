package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void constructorTest() {
        long id = 123456;
        String name = "Jett";

        Person person = new Person(id, name);

        String expectedName = person.getName();
        long expectedId = person.getId();

        Assert.assertEquals(expectedName, name);
        Assert.assertEquals(expectedId, id);

    }

    @Test
    public void setNameTest () {
        String name = "Frankenstein";
        int id = 0;
        Person person = new Person(id , name);

        String actual = person.getName();

        Assert.assertEquals(name, actual);
    }
}
