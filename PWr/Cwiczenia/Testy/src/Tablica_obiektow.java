import java.util.Random;

public class Tablica_obiektow {
    private static Student[] tablica = new Student[10];


    public static void main(String[] args) {
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = null;
        }

        Random r = new Random();
        int ran_wiek = r.nextInt((50-18)+1)+18;

    Student s1 = new Student(ran_wiek, "Jan", 234563);
    Student s2 = new Student(r.nextInt((50-18)+1)+18, "Jan", 234509);
    Student s3 = new Student(r.nextInt((50-18)+1)+18, "Jan", 946532);
    Student s4 = new Student(r.nextInt((50-18)+1)+18, "Jan", 432095);
    Student s5 = new Student(r.nextInt((50-18)+1)+18, "Jan", 124352);
    Student s6 = new Student(r.nextInt((50-18)+1)+18, "Jan", 543423);
    Student s7 = new Student(r.nextInt((50-18)+1)+18, "Jan", 959493);
    Student s8 = new Student(r.nextInt((50-18)+1)+18, "Jan", 854356);
    Student s9 = new Student(r.nextInt((50-18)+1)+18, "Jan", 543423);
    Student s10 = new Student(r.nextInt((50-18)+1)+18, "Jan", 534367);
        tablica[0] = s1;
        tablica[1] = s2;
        tablica[2] = s3;
        tablica[3] = s4;
        tablica[4] = s5;
        tablica[5] = s6;
        tablica[6] = s7;
        tablica[7] = s8;
        tablica[8] = s9;
        tablica[9] = s10;

        Wyswietl();
    }

    public static void Wyswietl(){
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Indeks: " + i + " " + tablica[i].getWiek() + " " + tablica[i].getImie() + " " + tablica[i].getIndeks());
        }
    }

    public static void Sortowanie(){
        for (int k = 1; k <= tablica.length; k++) {
            for (int i = 0; i < tablica.length; i++) {
//               if(tablica)
            }
        }

    }


}
