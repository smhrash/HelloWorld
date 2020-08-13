package oop.abstraction;

import org.w3c.dom.ls.LSOutput;

public abstract class BDBank extends CitiBank {


    public abstract void balanceTransfer();


    public void openAnAccount(){

        System.out.println("BD-open-an-account");
    }

    public void zellePay(){

        System.out.println("BD-Zelle-pay");

    }


}
