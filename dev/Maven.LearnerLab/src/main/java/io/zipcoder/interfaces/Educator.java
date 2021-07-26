package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    BILLYBOB,
    ZILLA,
    COUNTCHOC,
    FURD;


    private final Instructor instructor;
    double timeWorked;


    Educator() {
        this.instructor = new Instructor(ordinal(), name());
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner, numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        this.instructor.lecture(learners, numberOfHours);
    }
}
