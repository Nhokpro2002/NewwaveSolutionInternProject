package hus.oop;

public class PayPal extends Payment {


    private double amountInPayPay;

    @Override
    public void processPayment(double amount) {
        if (amountInPayPay >= amount) {
            amountInPayPay -= amount;
            System.out.println("Pay by PayPal done");
        }
        else {
            System.out.println("PayPay not enough money");
        }
    }

    public double addAmount(double amount) {
        amountInPayPay += amount;
        return amountInPayPay;
    }


}
