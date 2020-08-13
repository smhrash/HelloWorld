package oop.abstraction;

public class TestBank {

    public static void main(String[] args) {

        System.out.println(USBank.minBal);

        HSBCBank hsbcBank= new HSBCBank();

        hsbcBank.credit();
        hsbcBank.debit();
        hsbcBank.transferMoney();
        hsbcBank.personalLoan();
        hsbcBank.studyLoan();
        hsbcBank.businessLoan();
        hsbcBank.houseLoan();
        hsbcBank.deptReliefLoan();
        hsbcBank.vehicleLoan();
        hsbcBank.openAnAccount();
        hsbcBank.zellePay();

    }
}
