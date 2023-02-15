import java.util.Random;

public class Student {

    private int wiek;
    private String imie;
    private int indeks;
    private static int lastIndeks = 99999;



//    musimy miec stworzona tablice typu Student


//    public Student(){
//         wiek = 19;
//         imie = "Jan";
//         indeks = 123456;
//    }

    public Student(int wiek, String imie){
        this.wiek = wiek;
        this.imie = imie;
        this.indeks = ++lastIndeks;

    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }
}
