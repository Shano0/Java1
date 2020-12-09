package com.edu.btu.Demo3;

public class IphoneX<S> extends SmartPhone {
    String title;

    public IphoneX(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "IphoneX{" +
                "title='" + title + '\'' +
                '}';
    }
}