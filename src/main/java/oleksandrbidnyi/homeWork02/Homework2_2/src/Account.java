package oleksandrbidnyi.homeWork02.Homework2_2.src;

public class Account {

    private double balance;
    private double commission = 0.05;

    public Account(double balance) {
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

    public void withdrowal(double moneyYouWantToWithdraw){
        if ((balance-moneyYouWantToWithdraw-(moneyYouWantToWithdraw* commission)>=0)){
            balance = balance-moneyYouWantToWithdraw-(moneyYouWantToWithdraw* commission);
            System.out.println("OK, commission: " + commission + " balance after withdrawal: " + balance);
        }else{
            System.out.println("Not enough money to complete this operation");
        }
    }
}


