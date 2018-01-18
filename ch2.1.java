package com.command;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    double celsius = 0;
    double fahrenheit = 0;

    Scanner s =  new Scanner(System.in);
    System.out.println("Please enter a number in Celsius");
    celsius= s.nextDouble();
    fahrenheit = (9.0/5) * celsius + 32;
    System.out.println("Temperature in Fahrenheit = " + fahrenheit);

    }
}
