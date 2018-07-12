package com.company;

import com.welcome.Hello;

public class Main2 {
    public static void main(String[] args) {
        Main to = new Main();
        Hello hi = new Hello("test");
        hi.setupName(to.printHelloName());
        hi.welcome();
        System.out.println("Hello, world");
        hi.byeBay();


    }

}
