package DesignPatterns;

interface paymentStrategy{
    void pay(int amount);
}

class CreditCardPayment implements paymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" using CC");
    }
}

class DebitCardPayment implements paymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" using DC");
    }
}

class UpiPayment implements paymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" using UPI");
    }
}

class PaymentContext{
    private paymentStrategy strategy;

    public void setStrategy(paymentStrategy strategy){
        this.strategy = strategy;
    }
    public void payAmount(int amount){
        strategy.pay(amount);
    }
}

public class StrategyPattern {
    public static void main(String[] args){
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.payAmount(10000);

        context.setStrategy(new DebitCardPayment());
        context.payAmount(5000);

        context.setStrategy(new UpiPayment());
        context.payAmount(1000);
    }
}
