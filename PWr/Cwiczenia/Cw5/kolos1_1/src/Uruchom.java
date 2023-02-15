import java.util.Random;

public class Uruchom {

    private static Student1[] tab = new Student1[10];
    public static void Wyswietl(Student1[] x){
        for (int i = 0; i <x.length; i++) {

            System.out.println("Indeks: " + i + " " + x[i].getNazwisko() + " " + x[i].getImie() + " " + x[i].getIndeks() + x[i].getKursy() );
        }
    }


    public static void main(String[] args) {
        Random ran = new Random();
        int n = ran.nextInt(100)+10;
        tab[0] = new Student1("Jan","Kowal",ran.nextInt(10)+99999,  " Logika");
        tab[1] = new Student1("Jakub","Pranuk",ran.nextInt(100)+10," PSIO");
        tab[2]= new Student1("Igor","Loka",ran.nextInt(100)+10," Fizyka");
        tab[3] = new Student1("Wiktor","Miore",ran.nextInt(100)+10," Polski");
        tab[4] = new Student1("Markijan","Tarenow",ran.nextInt(100)+10," Angielski");
        tab[5] = new Student1("Mateusz","Ireniow",ran.nextInt(100)+10," Logika");
        tab[6]  = new Student1("Marek","Potrenow",ran.nextInt(100)+10," Logika");
        tab[7] = new Student1("Mieszko","Koleno",ran.nextInt(100)+10," Logika");
        tab[8] = new Student1("Darek","Joreto",ran.nextInt(100)+10," Logika");
        tab[9]  = new Student1("Mikolaj","Sileto",ran.nextInt(100)+10," Logika");


        Wyswietl(tab);
    }
}
