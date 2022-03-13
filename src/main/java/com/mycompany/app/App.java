package com.mycompany.app;

/**
 * Hello Munnabhayya!!!
 */
public class App
{

    private final String message = "How you doin";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
