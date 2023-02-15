package Lab8;

public abstract class Osoba {

    public String  nazwisko;
    public String pesel;

    public Osoba(){
        nazwisko ="";
        pesel = "";
    }

    public Osoba(String nazwisko, String pesel) {
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public String toString(){
        return "Nazwisko: " + nazwisko + " " + "Pesel: " + pesel;
    }

    public abstract double Oblicz();

}
