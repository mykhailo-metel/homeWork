import java.util.Scanner;

public class HomeWork2_4 {

           public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
            int[] balances = {1200, 250, 2000, 500, 3200};

            double balance = 0;
            double fund = 0;
            int Jane = 1 , Ann = 2, Jack = 3, Oww = 4, Lane = 5;


            System.out.print("List of availeble accounts: Jane - 1, Ann - 2, Jack - 3, Oww - 4, Lane - 5. Enter the number of account: " );
            int accountnumber = input.nextInt();
            String accountname = ownerNames[accountnumber-1];
            int currentaccount = (balances[fundMoney(ownerNames, accountname, 0)]);

            System.out.print("Name of your account is " + accountname + ", Enter sum of fund: ");
            fund = input.nextDouble();

            if (fund > 0) {
                System.out.println(accountname + " " + (int)fundMoney(currentaccount, fund, balance));
            } else {
                System.out.println( accountname + "You must put some money on your account, try again.");
            }
        }

        public static double fundMoney(double currentaccount, double fund, double balance) {
            balance = currentaccount + fund;
            return balance;
        }

        public static int fundMoney(String[] arr, String accountname, int accountindex) {

            for (int i = 0; i < arr.length; i++ ) {

                if (accountname == arr[i]) {
                    accountindex = i;
                }
            }
            return accountindex;
        }
    }


