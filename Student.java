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
    public void dodajOcena(double ocena) {
        if(oceny.size() >20){
            throw new IllegalStateException("maksymalna ilość ocen to 20");
        }
        this.oceny.add(ocena);
    }

    public double sredniaOcen() {
        if (oceny.isEmpty()) {
            throw new IllegalStateException("brak ocen");
        }
        double sum = 0;
        for (double ocena : oceny) {
            sum += ocena;
        }
        double srednia = sum / oceny.size();

        double[] mozliwe = {2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0};
        double nSrednia = mozliwe[0];
        for (int i = 1; i < oceny.size(); i++) {
            if(Math.abs(oceny.get(i) - srednia) < Math.abs(nSrednia - srednia)) {
                nSrednia = oceny.get(i);
            }
        }
        return nSrednia;
    }
}
