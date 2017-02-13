import java.util.Scanner;

public class HomeWork2_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        int[] balances = {1200, 250, 2000, 500, 3200};

        double withdrawal;
        double balance = 0;
        double tax = 0.05;
        int Jane = 1 , Ann = 2, Jack = 3, Oww = 4, Lane = 5;


        System.out.print("List of availeble accounts: Jane - 1, Ann - 2, Jack - 3, Oww - 4, Lane - 5. Enter the number of account: " );
        int accountnumber = input.nextInt();
        String accountname = ownerNames[accountnumber-1];
        int currentaccount = (balances[IndexOwnerBalance(ownerNames, accountname, 0)]);

        System.out.print("Name of your account is " + accountname + ", Enter amount of withdrawal: ");
        withdrawal = input.nextDouble();

        double comission = withdrawal * tax;

        if (currentaccount - (withdrawal + comission) >= 0) {
            System.out.println("ОК " +(int)withdrawal + " " + (int) withDraw(currentaccount, withdrawal, comission, balance));
        } else {
            System.out.println( accountname + " NO");
        }
    }

    public static double withDraw(double currentaccount, double withdrawal, double comission, double balance) {
        balance = currentaccount - (withdrawal+comission);
        return balance;
    }

    public static int IndexOwnerBalance(String[] arr, String accountname, int accountindex) {

        for (int i = 0; i < arr.length; i++ ) {

            if (accountname == arr[i]) {
                accountindex = i;
            }
        }
        return accountindex;
    }
}
