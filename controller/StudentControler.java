package controller;
import data.Student;
import service.StudentService;
import view.StudentView;

public class StudentControler implements UserControler<Student> {
    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();


    @Override
    public void create(String lastName, String firstName, String secondName) {
        studentService.create(lastName, firstName, secondName);

    }

    @Override
    public void sendOnConsole() {
        studentView.sendOnConsole(studentService.getStudentList());

    }

}
