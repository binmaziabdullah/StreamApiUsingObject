import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamObjectExample {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(new Student("Ram", 101L, 70, "Usa",StudentGender.Male),
                new Student("Nilesh", 105L, 65, "Australia",StudentGender.Male),
                new Student("Nikita", 78L, 35, "Japan",StudentGender.Female),
                new Student("Saili", 60L, 32, "Australia",StudentGender.Female),
                new Student("Mahendra", 109L, 80, "India",StudentGender.Male),
                new Student("Ambadas", 200L, 90, "India",StudentGender.Male),
                new Student("Rashmi", 48L, 96, "Usa",StudentGender.Female),
                new Student("Roshni", 27L, 25, "UK",StudentGender.Female),
                new Student("Latika", 29L, 39, "Switzerland",StudentGender.Female),
                new Student("Bhakti", 69L, 60, "Usa",StudentGender.Female),
                new Student("Nilam", 70L, 62, "Japan",StudentGender.Female),
                new Student("Ujwal", 21L, 19, "Australia",StudentGender.Male),
                new Student("Saket", 40L, 99, "India",StudentGender.Male));

        /*Getting Student name which having marks>35*/
        System.out.println("******List of passed students******");
        List<String> stringList = students.stream()
                .filter(s -> s.getMarks() > 35)
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println("Passed student are:" + " " + stringList);

        /*Getting Student which having marks>35 using set to remove duplicate*/
        System.out.println("\n******List of students  which having marks>35 after removing the duplicates******");
        Set<Integer> integerSet = students.stream()
                .map(Student::getMarks)
                .filter(marks -> marks > 35)
                .collect(Collectors.toSet());
        System.out.println(integerSet);

        System.out.println("\n******grouping the List of Male student and Female student by groupingBy()******");
        Map<StudentGender,List<Student>> studentByGender = students.stream()
                .collect(Collectors.groupingBy(Student::getStudentGender));
        for (Map.Entry<StudentGender, List<Student>> genderListEntry: studentByGender.entrySet()) {
                System.out.println("\n"+genderListEntry.getKey()+"grouped\n"+genderListEntry.getValue());

        }


    }

}
