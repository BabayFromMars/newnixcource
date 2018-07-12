package com.company;

import java.util.Scanner;

public class Main {

    static String name;
    public static void main(String[] args) {
        System.out.println("Hello, world");

       printHelloName();

    }
    public static String printHelloName() {
        System.out.println("Введите имя: ");
        Scanner scan = new Scanner(System.in);
        return name = scan.nextLine();
        //System.out.println("Hello, " + name + "!");

    }
    }

