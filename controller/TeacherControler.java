package controller;
import data.Teacher;
import service.TeacherService;
import view.TeacherView;

public class TeacherControler implements UserControler<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String lastName, String firstName, String secondName) {
        teacherService.create(lastName, firstName, secondName);

    }

    @Override
    public void sendOnConsole() {

        teacherView.sendOnConsole(teacherService.getTeachersList());
    }

}
