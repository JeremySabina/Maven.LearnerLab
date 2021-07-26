package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.List;

public class TestPeople {




    @Test
    public void testAdd() {
        //given
        People people = Students.getInstance();
        Integer expected = people.count() + 2;

        Person person = new Student(100L, "Samuel", 10);
        Person person1 = new Student(200L, "Trello", 10);

        //when
        people.add(person);
        people.add(person1);
        Integer actual = people.personList.size();

        Assert.assertEquals(expected, actual);
        people.remove(person);
        people.remove(person1);
    }

    @Test
    public void testRemove() {
        //given
        People people = Students.getInstance();
        Integer expected = people.count();
        Person person = new Student(100L, "Samuel", 10);
        people.add(person);

        //when
        people.remove(person);
        Integer actual = people.personList.size();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testFindById() {
        // given
        People people = Students.getInstance();
        Person person = new Person(100, "Samuel");
        Long expected = 100L;

        //when
        people.findById(100L);
        Long actual = person.id;

        //then
        Assert.assertEquals(expected, actual);
    }
}
