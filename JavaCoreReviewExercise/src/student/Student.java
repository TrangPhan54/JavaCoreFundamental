package student;

public class Student {
    private int studentID;
    private String name;
    private String address;
    public Student (int Id, String stuName, String stuAdd){
        this.studentID = Id;
        this.name = stuName;
        this.address = stuAdd;
    }
    public String toString (){
        return this.studentID +" "+this.name+" "+this.address;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
