package com.edu.btu.Demo3;

public class SmartPhone {
    public void touchScreen() {
        System.out.print("touchScreen \n");
    }

    public void printSmartPhone() {
        IphoneX<String> nokia = new IphoneX<>("IphoneX");
        System.out.println(nokia);
        touchScreen();

        SamsungNote<String> samsungNote = new SamsungNote<>("SamsungNote");
        System.out.println(samsungNote);
        touchScreen();

    }
}