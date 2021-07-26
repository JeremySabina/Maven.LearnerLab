package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void singletonTest() {
        //given
        Students students = Students.getInstance();
        Integer expected = 2;

        //when
        Integer actual = students.personList.size();

        //then
        Assert.assertEquals(expected,actual);
    }
}
