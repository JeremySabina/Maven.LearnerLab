package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestInstructors {

    @Test
    public void singletonTest() {
        //given
        Instructors instructor = Instructors.getInstance();
        Integer expected = 2;

        //when
        Integer actual = instructor.personList.size();

        //then
        Assert.assertEquals(expected,actual);
    }
}
