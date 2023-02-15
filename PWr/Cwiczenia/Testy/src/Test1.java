public class Test1 {

    public static void SkrzyniaBiegow(boolean mechaniczna, boolean sprzeglowcisniete) {


        if (mechaniczna == true && sprzeglowcisniete == true) {
            Zmienbieg();
        } else if (mechaniczna == true && sprzeglowcisniete == false) {

            System.out.println("Nie wciśniete sprzęgło");

        } else {
            Zmienbieg();
        }
    }

    private static void Zmienbieg() {
        System.out.println("Zmieniam bieg");
    }


    public static void main(String[] args) {


        SkrzyniaBiegow(true, true);
    }
}