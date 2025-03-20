import java.util.ArrayList;
import java.util.List;

public class Student {
    String imie;
    String nazwisko;
    String nIndeksu;
    String email;
    List<Double> oceny = new ArrayList<>();

    public Student(String imie, String nazwisko, String nIndeksu, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nIndeksu = nIndeksu;
        this.email = email;
    }
    public void oceny(double oceny) {
        this.oceny.add(oceny);
    }

}
