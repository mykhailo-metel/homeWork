/**
 * Created by Евгений on 03.02.2017.
 */
public class moneyWithdraw {
    private void withdraw (double balance, double withdrawal){
        double commision = withdrawal * 0.05;
        double transaction = balance - (withdrawal + commision);
        if (transaction> 0){
            System.out.println("OK " + commision + ' ' + transaction);
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        moneyWithdraw myTransaction = new moneyWithdraw();
        myTransaction.withdraw(1000, 300);
    }
}
