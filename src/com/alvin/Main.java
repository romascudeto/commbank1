package com.alvin;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("n : ");
        n = input.nextInt();
        while (n < 0 || n > 100) {
            System.out.println("----------------");
            System.out.println("n out of range !");
            System.out.println("----------------");
            System.out.print("n : ");
            n = input.nextInt();
        }
        for (int i = 0; i < n; i++){
            for(int j = n-1;j >= 0; j--){
                if (j > i){
                    System.out.printf(" ");
                }else{
                    System.out.printf("#");
                }
            }
            System.out.printf("\n");
        }

    }
}
