package com.company;

public class Main {

    public static void main(String[] args) {
        int antalKast = 5;
        int antalSidor = 6;
        int summaSpelare1 = 0;
        int summaSpelare2 = 0;

        int[]KastArray;
        KastArray = new int[2];

        for (int i = 1; i <= antalKast; i++){
            KastArray[0] =(int)(1+antalSidor*Math.random());
            KastArray[1] =(int)(1+antalSidor*Math.random());

            System.out.println("Spelare 1: Kast: " +i+ " är " + KastArray[0]);
            System.out.println("Spelare 2: Kast: " +i+ " är " + KastArray[1]);

            summaSpelare1 += KastArray[0];
            summaSpelare2 += KastArray[1];
        }

        System.out.println("Summa för spelare 1 är: " +summaSpelare1);
        System.out.println("Summa för spelare 2 är: " +summaSpelare2);
    }
}
