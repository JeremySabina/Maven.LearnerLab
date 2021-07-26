package io.zipcoder.interfaces;

public class Students extends People<Student>{

     private static final Students INSTANCE = new Students();

     private Students(){

         this.add(new Student(123L, "Jen", 10));
         this.add(new Student(321L, "Jeremy", 15));

     }

    public static Students getInstance() {
         return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        return personList.toArray(new Student[0]);
    }
}
