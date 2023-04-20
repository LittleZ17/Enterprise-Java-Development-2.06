package org.LabSystemDesign;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Leyre", 80);
        Student s2 = new Student("Naomi", 70);
        Student s3 = new Student("Laura", 80);
        Student s4 = new Student("Zindy", 95);

        Map<String, Student> listStudents = new HashMap<>();

        listStudents.put(s1.getName(), s1);
        listStudents.put(s2.getName(), s2);
        listStudents.put(s3.getName(), s3);
        listStudents.put(s4.getName(), s4);

        //System.out.println(listStudents);

        for (String key : listStudents.keySet()) {
            System.out.println("key: " + key + " value: " + listStudents.get(key));
        }

        System.out.println("----incrementGrade method: \n");

        incrementGrade(listStudents);

        for (String key : listStudents.keySet()) {
            System.out.println("key: " + key + " value: " + listStudents.get(key));
        }
    }

    public static Map<String, Student>  incrementGrade(Map<String, Student> students){

        for (Map.Entry<String, Student> studentEntry : students.entrySet()) {

            Student student = studentEntry.getValue();

            double updateGrade = student.getGrade() * 1.1;

            student.setGrade((int) updateGrade);
        }
        return students;
    }


}
