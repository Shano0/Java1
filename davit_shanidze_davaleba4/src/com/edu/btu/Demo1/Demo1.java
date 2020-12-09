package com.edu.btu.Demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Demo1 {
    public static void main(String[] args) {

        List<String> array = new ArrayList<>();
        array.add("Davit");
        array.add("Shanidze");
        array.add("BTU");
        while (true) {
            System.out.print("input:");
            String input = new Scanner(System.in).nextLine();

            if (array.contains(input)) {
                System.out.println("input must be unique");
            } else {
                array.add(input);
                System.out.println("Success");
            }
        }
    }
}