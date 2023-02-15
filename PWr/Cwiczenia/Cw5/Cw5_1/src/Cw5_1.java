public class Cw5_1 {
    private static Student[] tab = new Student[10];

    public static void Sortowanie(Student[] x) {
        for (int k = 1; k <= x.length; k++) {


            for (int i = 0; i < x.length - 1; i++) {

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

        Student s1 = new Student(19, "Jan", 345325);
        tab[0] = s1;

            tab[0] = new Student(19, "Jan", 345325);
            tab[1] = new Student(25, "Kuba", 76888);
            tab[2]= new Student(28, "Kuba", 76666);
            tab[3] = new Student(34, "Kuba", 76);
            tab[4] = new Student(19, "Kuba", 76);
            tab[5] = new Student(20, "Kuba", 76);
            tab[6]  = new Student(29, "Kuba", 76);
            tab[7] = new Student(26, "Kuba", 76);
            tab[8] = new Student(40, "Kuba", 76);
            tab[9]  = new Student(21, "Kuba", 76);


            Sortowanie(tab);
            Wyswietl(tab);
        }


}