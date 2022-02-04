package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Taking input");
        Scanner iscan = new Scanner(System.in);
        System.out.println("Enter Text(Lowercase only) : ");
        String a = iscan.next();
        String b = a;
        StringBuilder sb = new StringBuilder(b).reverse();
        b = sb.toString();


        if (a.equals(b)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}
