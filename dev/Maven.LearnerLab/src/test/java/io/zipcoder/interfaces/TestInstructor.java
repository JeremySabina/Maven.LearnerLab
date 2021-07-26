package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {


    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(123, "Mr. Gundark");


        Assert.assertTrue( instructor instanceof Teacher);

    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(123, "Mr. Gundark");


        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(123L, "Mr. Gundark");
        Student student = new Student(12345L, "Bob", 100.00);
        int expected = 110;

        instructor.teach(student, 10);
        double actual = student.totalStudyTime;


        Assert.assertEquals(expected, actual, .00001);
    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(123, "Mr. Gundark");
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
