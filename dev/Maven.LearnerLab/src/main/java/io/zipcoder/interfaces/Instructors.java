package io.zipcoder.interfaces;

import org.junit.jupiter.api.Test;

public class Instructors extends People<Instructor> {

        private static final Instructors INSTANCE = new Instructors();

        private Instructors() {

            this.add(new Instructor(123, "Steve-O"));
            this.add(new Instructor(117, "John"));

        }

        public static Instructors getInstance() { return INSTANCE;}

    @Override
    public Instructor[] toArray() {
        return personList.toArray(new Instructor[0]);    }
}
