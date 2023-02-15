public class Cw5_1 {
    private static Student[] tab = new Student[10];

    public static void Sortowanie(Student[] x) {
        for (int k = 1; k <= x.length; k++) {


            for (int i = 0; i < x.length - k; i++) {

                if (x[i].getWiek() > x[i + 1].getWiek()) {
                    Student temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;
                }

            }
        }
    }

    public static void Wyswietl(Student[] x){
        for (int i = 0; i <x.length; i++) {

            System.out.println("Indeks: " + i + " " + x[i].getWiek() + " " + x[i].getImie() + " " + x[i].getIndeks());
        }
    }

        public static void main (String[]args){



            tab[0] = new Student(19, "Jan");
            tab[1] = new Student(25, "Kuba");
            tab[2]= new Student(28, "Marek");
            tab[3] = new Student(34, "Piotr");
            tab[4] = new Student(19, "Dawid");
            tab[5] = new Student(20, "Roman");
            tab[6]  = new Student(29, "Kuba");
            tab[7] = new Student(26, "Bogdan");
            tab[8] = new Student(40, "Wiktor");
            tab[9]  = new Student(21, "Krzysztof");


//            Student s1 = new Student();
//            tab[10] = s1;


            Sortowanie(tab);
            Wyswietl(tab);
        }


}