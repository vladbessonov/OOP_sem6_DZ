package data;
public class Student extends User implements Comparable<Student> {
    private int studentId;
    private double rating;

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    

    public Student(int studentId, String firstName, String secondName, String lastName, Double rating) { 
        super(lastName, firstName, secondName);
        this.studentId = studentId;
        this.rating = rating;

    }

    public int getStudentId() { 
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    @Override
    public String toString() { 
        return "Student [Id=" + studentId + ", Фамилия " + super.getLastName() + ", Имя " + super.getFirstName() + ", Отчество " + super.getSecondName()
                +  ", средний балл " + String.format("%.2f",rating) +"]";
    }

    @Override
    public int compareTo(Student o) {
        if (studentId > o.getStudentId())
            return 1;
        if (studentId < o.getStudentId())
            return -1;

        return 0;

    }

}