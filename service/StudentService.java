package service;

import data.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {
    private final List<Student> studentList = new ArrayList<>();

    @Override
    public void create(String lastName, String firstName, String secondName) {
        double rating;
        rating = Math.random() * 3 + 2;

        int lastID = 0;
        for (Student student : studentList) {
            if (lastID < student.getStudentId()) {
                lastID = student.getStudentId();
            }

        }
        studentList.add(new Student(++lastID, lastName, firstName, secondName, rating));

    }

    public List<Student> getStudentList() {
        return studentList;
    }

}
