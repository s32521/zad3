import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
        public String nazwa;
        List<Student> students = new ArrayList<>();

        public StudentGroup(String nazwa) {
            this.nazwa = nazwa;
        }
        public void addStudent(Student student) {
            if(students.size() >15) {
                throw new IllegalStateException("maksymalna ilość w grupie to 15");
            }
            if(students.contains(student)) {
                throw new IllegalStateException("student jest już w grupie");
            }
            students.add(student);
        }
    }

