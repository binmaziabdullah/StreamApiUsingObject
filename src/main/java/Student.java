public class Student {

    private String name;
    private Long RollNo;
    private Integer marks;
    private String country;
    private  StudentGender studentGender;

    public Student(String name, Long rollNo, Integer marks, String country,StudentGender studentGender) {
        this.name = name;
        RollNo = rollNo;
        this.marks = marks;
        this.country = country;
        this.studentGender = studentGender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRollNo() {
        return RollNo;
    }

    public void setRollNo(Long rollNo) {
        RollNo = rollNo;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public StudentGender getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(StudentGender studentGender) {
        this.studentGender = studentGender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", RollNo=" + RollNo +
                ", marks=" + marks +
                ", country='" + country + '\'' +
                ", studentGender=" + studentGender +
                "}\n";

    }
}
