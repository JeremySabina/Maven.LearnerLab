package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture() {

        //given
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Instructors instructors = Instructors.getInstance();
        Students students = Students.getInstance();
        Instructor instructor = Instructors.getInstance().findById(123L);
        Map<Student, Double> preStudyMap = zipCodeWilmington.getStudyMap();
        Double numberOfHoursToTeach = 9999.0;
        Double expectedNumberOfHoursLearned = numberOfHoursToTeach / students.count();


        //when
        zipCodeWilmington.hostLecture(instructor, numberOfHoursToTeach);
        Map<Student, Double> postStudyMap = zipCodeWilmington.getStudyMap();
        Set<Student> keySet = postStudyMap.keySet();
        for (Student student : keySet) {
            Double preStudyTime = preStudyMap.get(student);
            Double expectedStudyTime = preStudyTime + expectedNumberOfHoursLearned;
            Double actualStudyTime = postStudyMap.get(student);

            Assert.assertEquals(expectedStudyTime, actualStudyTime);
        }
    }
        @Test
        public void testEducator() {

            //given
            ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
            Students students = Students.getInstance();
            Educator leon = Educator.BILLYBOB;
            Map<Student, Double> preStudyMap = zipCodeWilmington.getStudyMap();
            Double numberOfHoursToTeach = 9999.0;
            Double expectedNumberOfHoursLearned = numberOfHoursToTeach / students.count();


            //when
            zipCodeWilmington.hostLecture(leon, numberOfHoursToTeach);
            Map<Student, Double> postStudyMap = zipCodeWilmington.getStudyMap();
            Set<Student> keySet = postStudyMap.keySet();
            for(Student student : keySet) {
                Double preStudyTime =preStudyMap.get(student);
                Double expectedStudyTime = preStudyTime + expectedNumberOfHoursLearned;
                Double actualStudyTime = postStudyMap.get(student);

                Assert.assertEquals(expectedStudyTime, actualStudyTime);
            }
    }
}
