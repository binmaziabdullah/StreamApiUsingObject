import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestClass {

        public static void filterStudents(){
            List<Student> students = Arrays.asList(new Student("Ram",101L,70,"Usa"),
                    new Student("Nilesh",105L,65,"Australia"),
                    new Student("Salman",78L,35,"Japan"),
                    new Student("Rushikesh",60L,32,"Australia"),
                    new Student("Mahendra",109L,80,"India"),
                    new Student("Ambadas",200L,90,"India"),
                    new Student("Samee",48L,90,"Usa"));
          List<String> stringList = students.stream().filter(s -> s.getMarks()>35).map(Student::getName).collect(Collectors.toList());
          System.out.println("Passed student are:"+" "+stringList);

          /*Getting Student which having marks>35 using set to remove duplicate*/
            Set<Integer> integerSet = students.stream().filter(student -> student.getMarks()>35)
                    .map(Student::getMarks).collect(Collectors.toSet());
          System.out.println(integerSet);
        }

}
