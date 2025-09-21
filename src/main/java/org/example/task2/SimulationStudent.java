package org.example.task2;

import java.util.*;

public class SimulationStudent {
    public static Map<String, List<Student>> groupByFacultyAndCourse(List<Student> students){
        Map<String, List<Student>> groped = new HashMap<>();

        for(Student student : students){
            String key = student.getFaculty() + "-" +student.getCourse();

            if (!groped.containsKey(key)){
                groped.put(key, new ArrayList<>());
            }

            List<Student> studentList = groped.get(key);
            studentList.add(student);
        }
        return groped;
    }
    public static void main(String[] args) {
        Student s1 = new Student("Ali", "fizika", 2);
        Student s2 = new Student("Malik", "fizika", 4);
        Student s3 = new Student("Bonu", "fizika", 2);
        Student s4 = new Student("Qosim", "kimyo", 3);
        Student s5 = new Student("Fotima", "kimyo", 3);

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);


    }
}
