package oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        operation operation = new operation();
        int a, b, sum;

        System.out.print("Insert the value of a: ");
        a = input.nextInt();

        System.out.print("Insert the value of b: ");
        b =  input.nextInt();
       sum = operation.sum(a, b);
        System.out.println("Sum of " +a+" and "+b+" = "+sum );


    }
}
