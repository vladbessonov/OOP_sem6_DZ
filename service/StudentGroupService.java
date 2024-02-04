package service;

import data.Student;
import sort.StudentGroup;
import sort.UserComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public List<Student> getSortedStudentGroup() {
        List<Student> studenList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studenList);
        return studenList;
    }

    public List<Student> getSortedStudentGroupByFIO() { // сортирует по описанному методу сортировки по ФИО
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new UserComparator<Student>());//передаем <Studeny> для сортировки по ФИО
        return studentList;

    }
}
