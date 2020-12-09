package com.edu.btu.Demo2;

import static java.lang.Integer.sum;

public class Demo2{

    interface sumable<num1, num2> {
        int sum(num1 x,num2 y);
    }

    public static void main(String[] args) {
        sumable<Integer, Integer> func = (X, Y) -> sum(X, Y);
        System.out.println(func.sum(11, 12));
    }
}