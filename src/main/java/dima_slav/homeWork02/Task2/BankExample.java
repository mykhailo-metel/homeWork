package dima_slav.homeWork02.Task2;


public class BankExample {
    private double balance;
    private double commission = 0.05;

    public BankExample(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void withdrawal(double withdrawalValue) {
        if (withdrawalValue < 0) { // проверка на валидность
            System.out.println("Invalid value of withdrawal.");
        }
        double result = balance - withdrawalValue - (withdrawalValue * commission);
        if (result >= 0) {
            System.out.println("OK, commission = " + commission + " balance after withdrawal = " + result);
        } else {
            System.out.println("NO");
        }
    }
}