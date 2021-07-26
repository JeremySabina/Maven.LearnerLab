package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        Student student = new Student(12345L, "Bob", 100.00);


        Assert.assertTrue( student instanceof Learner);

    }

    @Test
    public void testInheritance() {
        Student student = new Student(12345L, "Bob", 100.00);

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        //given
        Student student = new Student(12345L, "Bob", 100.00);
        double expectedtotalStudytime = 110.00;


        student.learn(10);
        double actual = student.getTotalStudyTime();


        Assert.assertEquals(expectedtotalStudytime, actual, 0.00001);
    }

}
