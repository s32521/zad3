import java.util.List;

public class task1 {
    public static void main(String[] args) {
        Student student1 = new Student("Natalia","Krzysztoporska","s32521","s32521@costam.pl");
        System.out.println(student1.imie+" "+student1.nazwisko+","+student1.nIndeksu+","+student1.email);

        student1.dodajOcena(3.5);
        student1.dodajOcena(3);
        student1.dodajOcena(3);
        student1.dodajOcena(4);

        System.out.println("ocena końcowa:"+ student1.sredniaOcen());

        StudentGroup grupa = new StudentGroup("Grupa1");
        grupa.addStudent(student1);

        System.out.println("Student grupa: "+grupa.nazwa);
    }

}
