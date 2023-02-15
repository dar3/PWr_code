package sololearn;

import java.util.Scanner;

public class loanCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        System.out.println("Amount:" + amount);

        double result = 0;
        for(int i = 0; i<3; i++){
           double payment =  10.0/100.0 * amount ;
            System.out.println("Payment: " + payment);
            System.out.println("Amount: " + amount);
          double remain = amount - payment;
            amount = remain;
            System.out.println(amount);
        }

        result = amount;
        System.out.println("result: " + result);

    }

}
