package com.welcome;

public class Hello {
    private String name;

    public Hello(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String setupName(String name) {
       return this.name = name;
    }

    public void welcome() {
        System.out.println("Hello, " + name);
    }

    public void byeBay() {
        System.out.println("Bye, " + name);
    }
}
