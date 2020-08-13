package oop.polymorphism.overriding;

public class Apple11Pro implements Cellphone {


    @Override
    public void keyPad() {
        System.out.println("Apple11Pro must have keypad");

    }

    @Override
    public void callButton() {
        System.out.println("Apple11Pro must have call button");

    }

    @Override
    public void speaker() {
        System.out.println("Apple11Pro must have speaker");

    }

    @Override
    public void ringtone() {
        System.out.println("Apple11Pro must have Ringtone feature");

    }

    @Override
    public void network() {
        System.out.println("Apple11Pro must have Network Feature");

    }

    @Override
    public void mic() {
        System.out.println("Apple11Pro must have mic");

    }

    @Override
    public void battery() {
        System.out.println("Apple11Pro must have battery");

    }

    public void flushLight() {
        System.out.println("\"Apple11Pro have Flush light\"");
    }

    public void cameras() {
        System.out.println("\"Apple11Pro have Four Cameras\"");
    }
}
