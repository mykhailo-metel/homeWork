
public class MoneyWithdraw {

    public static final double transactionComission = 0.05;

    public void withdraw (double balance, double withdrawal){
        if (withdrawal < 0) {
            throw new IllegalArgumentException ("Invalid withdrawal amount!");
        }
        double commision = withdrawal * transactionComission;
        double transaction = balance - (withdrawal + commision);
        if (transaction> 0){
            System.out.println("OK " + commision + ' ' + transaction);
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        MoneyWithdraw myTransaction = new MoneyWithdraw();
        myTransaction.withdraw(1000, 300);
    }
}
