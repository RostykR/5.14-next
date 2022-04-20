package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2, s3, s4,s5;
        System.out.print("Введіть слово");
        s1 = sc.nextLine();
        System.out.print("Введіть слово");
        s2 = sc.nextLine();
        System.out.print("Введіть слово");
        s3 = sc.nextLine();
        System.out.print("Введіть слово");
        s4 = sc.nextLine();
        System.out.print("Введіть слово");
        s5 = sc.nextLine();
        String s6 =s1.concat(" ").concat(s2).concat(" ").concat(s3).concat(" ").concat(s4).concat(" ").concat(s5);
        System.out.print(s6);


        }
    }

