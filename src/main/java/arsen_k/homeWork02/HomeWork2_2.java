import java.util.Scanner;

public class HomeWork2_2 {
    public static void main(String[] args) {

        double account, withdrawal;
        double balance = 0;
        double tax= 0.05;

        Scanner input = new Scanner(System.in);

        System.out.print("Open an account, enter amount: ");
        account = input.nextDouble();

        System.out.print("Enter amount of withdrawal: ");
        withdrawal = input.nextDouble();

        double comission = withdrawal * tax;

        if (account - (withdrawal + comission) >= 0) {
            System.out.println("ОК " + comission + " " + withDraw(account, withdrawal, comission, balance));
        } else {
            System.out.println("NO");
        }
    }

    public static double withDraw(double account, double withdrawal, double comission, double balance) {
        balance = account - (withdrawal+comission);
        return balance;

    }
}
