package org.LabSystemDesign;

public class Student {

    private String name;
    private int grade;

    //private final int MAX_VALUE = 100;
    //private final int MIN_VALUE =0;

    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {

        if (grade > 100) {
            this.grade = 100;
        } else if (grade < 0) {
            this.grade = 0;
        } else {
            this.grade = grade;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
