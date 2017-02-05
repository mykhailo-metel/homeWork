/**
 * Created by Dima on 05.02.2017.
 */
public class Account_owner {
    public static void main(String[] args) {
        int[] balance = {1200, 250, 2000, 500, 3200};
        String[] Owners = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String Name = Owners[(int) (Math.random() * Owners.length)];
        int withdrawal = (int) (Math.random() * 1000);
        withdraw(balance, Owners, Name, withdrawal);


    }

    public static void withdraw(int[] balance, String[] name, String ownerName, int withdrawalAmount) {
        int balanceOwner = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i] == ownerName) {
                balanceOwner = balance[i];
            } else {
                continue;
            }
        }
        double comission = withdrawalAmount + (withdrawalAmount * 0.05);
        double BalanceAfter = balanceOwner - comission;
        if (BalanceAfter > 0) {
            System.out.print(ownerName + " " + withdrawalAmount + " " + BalanceAfter);
        } else {
            System.out.println(ownerName + " NO");
        }


    }
}




