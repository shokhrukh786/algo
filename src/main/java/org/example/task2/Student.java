package org.example.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public class Student {
    private String name;
    private String faculty;
    private int course;

    @Override
    public int hashCode() {
        return Objects.hash(name, faculty, course);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student student = (Student) obj;
        return Objects.equals(name, student.name) &&
                Objects.equals(faculty, student.faculty) &&
                Objects.equals(course, student.course);
    }
    public String toString() {
        return name + " (" + faculty + ", " + course + "-kurs)";
    }
}
