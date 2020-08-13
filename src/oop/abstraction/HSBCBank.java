package oop.abstraction;

public class HSBCBank extends BDBank implements USBank, BrazilBank{


    @Override
    public void credit() {

        System.out.println("HSBC-CREDIT");

    }

    @Override
    public void debit() {

        System.out.println("HSBC-DEBIT");

    }

    @Override
    public void transferMoney() {

        System.out.println("HSBC-MONEY-TRANSFER");


    }
    public void studyLoan(){
        System.out.println("HSBC-STUDY-LOAN");
    }

    public void personalLoan(){
        System.out.println("HSBC-PERSONAL-LOAN");
    }

    @Override
    public void businessLoan() {

        System.out.println("HSBC-BUSINESS-LOAN");

    }

    @Override
    public void houseLoan() {

        System.out.println("HSBC-HOUSE-LOAN");

    }

    @Override
    public void balanceTransfer() {

        System.out.println("BDBank-balance-transfer");
    }
}
