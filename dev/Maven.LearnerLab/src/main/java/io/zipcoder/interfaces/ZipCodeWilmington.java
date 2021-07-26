package io.zipcoder.interfaces;


import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {

    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();


    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();



    private ZipCodeWilmington() {}


    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.personList.toArray(new Learner[0]), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        hostLecture(instructors.findById(id), numberOfHours) ;
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new HashMap<>();
        for (Student student : students.personList) {
            Double totalStudyTime = student.getTotalStudyTime();
            map.put(student, totalStudyTime);
        }
        return map;
    }

    public static ZipCodeWilmington getInstance() {return INSTANCE;}
}
