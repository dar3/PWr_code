package com.pwr.psio;

public class SumNM {

    public static void main(String[] args) {

//        int n = 5;
//        int m = 10;

//        if(n<m)
//        {
//            int suma = n +m;
//            System.out.println("Suma: ");
//        }
//
//        else
//        {
//            System.out.println("N nie jest mniejsze od m");
//        }

//        for (int n = 1;  n<=10; n++) {
//            if (n % 2 == 0)
//            {
//                System.out.println(n);
//                System.out.println();
//            }



//        int sum = 0;
//        for (int i = 1; i <= 4 ; i+= 2)
//
//        {
//            sum += i;
//        }
//        System.out.println(sum);



        int n = 1;
        int m = 5;

        int sum1 = 0;

        if(n%2==1)
        {
            n+=1;
        }

        while(n<=m){
            sum1 +=n;

            n+=2;
        }

        System.out.println(sum1);








    }
}
