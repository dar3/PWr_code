public class Kursy  extends Student1 {

    private  String nazwa;
    private  int ects;
    private  int semestr;

    public Kursy() {
        nazwa = "logika";
        ects = 5;
        semestr = 1;
    }

    public Kursy(String nazwa, int ects, int semestr){
        this.nazwa = nazwa;
        this.ects = ects;
        this.semestr = semestr;

    }

    public  String getNazwa() {
        return nazwa;
    }

    public  void setNazwa(String nazwa) {
        nazwa = nazwa;
    }

    public  int getEcts() {
        return ects;
    }

    public  void setEcts(int ects) {
        ects = ects;
    }

    public  int getSemestr() {
        return semestr;
    }

    public  void setSemestr(int semestr) {
        semestr = semestr;
    }
}
