package test.oop;

public class CreditCard extends Payment {

    private double amountInCreditCard;

    @Override
    public void processPayment(double amount) {
        if (amountInCreditCard >= amount) {
            amountInCreditCard -= amount;
            System.out.println("Pay by CreditCard done");
        }
        else {
            System.out.println("CreditCard not enough money");
        }
    }

    public double getAmountInCreditCard() {
        return amountInCreditCard;
    }

    public double addAmount(double amount) {
        amountInCreditCard += amount;
        return amountInCreditCard;
    }
}
