package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Taking input");
        System.out.println("Enter Text(Lowercase only) : ");
        Scanner iscan = new Scanner(System.in);
        String a = iscan.nextLine();
        System.out.println(a);
        String a1 = a.replaceAll(" ", "");
        System.out.println(a1);
        String b = a1;
        StringBuilder sb = new StringBuilder(b).reverse();
        b = sb.toString();


        if (a1.equals(b)) {
            System.out.println("yes, given word is a palindrome");
        } else {
            System.out.println("no, given word is not a palindrome");
        }

    }
}
