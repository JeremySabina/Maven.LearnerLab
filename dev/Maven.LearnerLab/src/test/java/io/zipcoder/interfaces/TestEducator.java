package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {



    @Test
    public void testImplementation() {
        Educator instructor = Educator.ZILLA;


        Assert.assertTrue( instructor instanceof Teacher);

    }

    @Test
    public void testInheritance() {
        Educator instructor = Educator.ZILLA;


        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testTeach() {
        Educator instructor = Educator.ZILLA;
        Student student = new Student(12345L, "Bob", 100.00);
        int expected = 110;

        instructor.teach(student, 10);
        double actual = student.totalStudyTime;


        Assert.assertEquals(expected, actual, .00001);
    }

    @Test
    public void testLecture() {
        Educator instructor = Educator.ZILLA;
        Student bob = new Student(12345L, "Bob", 10.00);
        Student rob = new Student(54321L, "Rob", 10.00);
        Learner[] learners = {bob, rob};
        double expeceted = 15.00;


        double hours = 10.00;
        instructor.lecture(learners, hours);
        double actual = bob.getTotalStudyTime();

        Assert.assertEquals(expeceted, actual, .000001);

    }
}

