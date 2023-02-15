package com.pwr.psio;

import java.util.Scanner;

public class Obrazek {

    public static void zespol (int n, char ch)
    {
        for (int i=0; i<n; i++)
            System.out.print(ch);
    }
    public static void piramidka1(int m)
    {
        for (int i=0; i<m; i++)
        {
            zespol(m-i-1,' ');
            zespol(2*i+1,'*');
            System.out.printf("\n");
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź wysokość piramidki: ");
        int w = sc.nextInt();

        piramidka1 (w);



        System.out.println("");
        System.out.println("");

    }



}
