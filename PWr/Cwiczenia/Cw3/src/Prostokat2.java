
import java.util.Random;

public class Prostokat2 {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    private int dl1;

    private int dl2;

    public Prostokat2()
    {
        x1 = 5;
        y1 = 10;
        x2 = -6;
        y2 = -3;
        dl1 = Math.abs(x1-x2);
        dl2 = Math.abs(y1-y2);
    }

    public Prostokat2(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.dl1 = Math.abs(x1-x2);
        this.dl2 = Math.abs(y1-y2);
    }
    public int Pole()
    {
        return  ((dl1)*(dl2));
    }

    public int Obwod()

    {
        return  (2*dl1+2*dl2);
    }


    public double Przekatna()
    {
        return  Math.sqrt(Math.pow(Math.abs(dl1),2)+Math.pow(Math.abs(dl2),2));
    }

    public static void main(String[] args) {

        Random r = new Random();

        int x1, x2, y1, y2;

                System.out.println("Wprowadz x1: ");
                x1 = r.nextInt(10)+1;
                System.out.println("Wprowadz y1: ");
                y1 = r.nextInt(10)+1;
                System.out.println("Wprowadz x2: ");
                x2 = r.nextInt(10)+1;
                System.out.println("Wprowadz y2: ");
                y2 = r.nextInt(10)+1;

                if ((x1 == x2) || (y1 == y2)) {
                    System.out.println("Dlugosc nie moze byc rowna zero");

                }

        Prostokat2 p2 = new Prostokat2();
        System.out.println("Pole: " + p2.Pole());
        System.out.println("Obwod: " + p2.Obwod());
        System.out.println("Przekatna: " + p2.Przekatna());

        }


    }





