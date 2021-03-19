public class Student {

    private String name;
    private Long RollNo;
    private Integer marks;
    private String country;

    public Student(String name, Long rollNo, Integer marks, String country) {
        this.name = name;
        RollNo = rollNo;
        this.marks = marks;
        this.country = country;
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


}
