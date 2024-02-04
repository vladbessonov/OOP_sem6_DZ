import controller.StudentControler;
import controller.TeacherControler;

public class Main {
    public static void main(String[] args) {
        StudentControler controler = new StudentControler();
        controler.create("3", "3", "3");
        controler.create("2", "2", "2");
        controler.create("1", "1", "1");
        controler.create("4", "4", "4");
        
        controler.sendOnConsole();
        System.out.println();


        TeacherControler teacherControler = new TeacherControler();
        teacherControler.create("5", "5", "5");
        teacherControler.create("2", "2", "2");
        teacherControler.create("3", "3", "3");
        teacherControler.create("4", "4", "4");
        teacherControler.sendOnConsole();
        
        


    }


}
