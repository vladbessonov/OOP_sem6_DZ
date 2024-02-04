package service;

import data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {

    

    private final List<Teacher> teachersList = new ArrayList<>();

    public TeacherService() {
    }

    @Override
    public void create(String lastName, String firstName, String secondName) {
        int lastID = 0;
        for (Teacher teacher : teachersList) {
            if (lastID < teacher.getTeacherID()) {
                lastID = teacher.getTeacherID();
            }

        }
        teachersList.add(new Teacher(++lastID, lastName,firstName, secondName));

    }
    public List<Teacher> getTeachersList() {
        return teachersList;
    }


}
