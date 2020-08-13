package oop.abstraction;

public interface USBank {

    int minBal = 100;

    public void credit();

    public void debit();

    public void transferMoney();

    // Only method declaration
    // No method body - only method prototype
    // In interface, we can declare the variables and variables are static by default in nature
    // variable will not changed
    // No static method in Interface
    // No main method in Interface
    // we can not create object of Interface
    // Interface is abstract in nature
}
