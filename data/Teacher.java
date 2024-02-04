package data;
public class Teacher extends User {
    private int teacherID;

    public Teacher(int teacherID, String lastName, String firstName, String secondName) {
        super(lastName, firstName, secondName);
        this.teacherID = teacherID;

    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }
    @Override
    public String toString() { 
        return "Учитель [Id=" + teacherID + ", Фамилия " + super.getLastName() + ", Имя " + super.getFirstName() + ", Отчество " + super.getSecondName()
                + "]";
    }

}
