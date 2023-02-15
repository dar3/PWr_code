package MojWyjatek;

public class mojwyjatek extends Exception {

    public mojwyjatek(String s) {

        super(s);
    }

    public void printStackTrace() {
        super.printStackTrace();
        System.out.println("Znaleziono nieprawidlowe slowa");
    }

    public String getMessage() {
        return super.getMessage() + "Znaleziono niedozwolone slowa!";
    }


}
