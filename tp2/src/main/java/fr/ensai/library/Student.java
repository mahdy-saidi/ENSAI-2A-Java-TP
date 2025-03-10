package fr.ensai.library;

public class Student extends Person {

    private int academicYear;
    private boolean isClassDelegate;

    public Student(int academicYear, boolean isClassDelegate, String name, int age, String nationality) {
        super(name, age, nationality);
        this.academicYear = academicYear;
        this.isClassDelegate = isClassDelegate;
    }

}
