package sort;

import data.Student;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{ //<Student> указывает, что будет перебирать(студентов)

    

    private List<Student> studentList;

    public StudentGroup(List<Student> studentList) { //конструктор
        this.studentList = studentList;
    }
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    public void addStudent(Student student){ // добавляем нового студента в группу
        studentList.add(student);

    }
    @Override
    public Iterator<Student> iterator() { //метод для интерфейса Iterable
        
        return new StudentGroupIterator(this); // this - экземпляр класса передает "сам себя"
        // Метод ожидает чтобы ему передали группу студентов, но this - экземпляр класса передаст "сам себя"
        // метод вернет итератор студентов,т.е. Iterator<Student> это интерфейс, StudentGroupIterator реализует этот интерфейс
        
    }

}
