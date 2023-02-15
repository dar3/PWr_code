public class Student1 {

    private  String imie;
    private  String nazwisko;
    private  int indeks;
    private  String  kursy;

    public Student1() {
        imie = "Jan";
        nazwisko = "Kowal";
        indeks = 234234;
        kursy  = "PSIO";
    }

    public Student1(String imie, String nazwisko, int indeks, String kursy){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
        this.kursy = kursy;

    }

    public  String getImie() {
        return imie;
    }

    public  void setImie(String imie) {
       imie = imie;
    }

    public  String getNazwisko() {
        return nazwisko;
    }

    public  void setNazwisko(String nazwisko) {
        nazwisko = nazwisko;
    }

    public  int getIndeks() {
        return indeks;
    }

    public  void setIndeks(int indeks) {
        indeks = indeks;
    }

    public  String getKursy() {
        return kursy;
    }

    public  void setKursy(String kursy) {
        kursy = kursy;
    }
}

