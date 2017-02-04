package homeWork02;



/**
 * Created by Mykhailo Metel on 03.02.2017.
 *
 You need to write method which withdraw money of particular account owner if he/she can.
 Print name + NO of withdrawal fs not possible and name + sum of withdrawal + balance after withdrawal in other case.
 Comision is 5% for all cases.
 Example
 Input
 int[] balances = {1200, 250, 2000, 500, 3200};
 String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
 String ownerName = Ann
 double withdrawal = 100;
 Output
 Ann 100 145
 Input
 int[] balances = {1200, 250, 2000, 500, 3200};
 String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
 String ownerName = Oww
 double withdrawal = 490;
 Output
 Oww NO
 *
 */
public class HomeWork_2_3 {

    public static void main(String[] args) {

        HomeWork_2_3 classItem = new HomeWork_2_3();
        double[] balances = {15, 250, 2000, 500, 3200};
        String[] ownerNames = {"Vasia", "Ann", "Petia", "Oww", "Lane"};

        String ownerName;
        double amount;

        ownerName = "Vasia";
        amount = 490;
        classItem.withdrawMoney(ownerName, amount, balances, ownerNames);

        ownerName = "Petia";
        amount = 1000;
        classItem.withdrawMoney(ownerName, amount, balances, ownerNames);

        classItem.printBalances(ownerNames,balances);

    }

    private void printBalances(String[] ownerNames, double[] balances) {

        for (int i = 0; i < ownerNames.length; i++) {
            System.out.println("Name: " + ownerNames[i] + "\t Balance: \t" + balances[i]);
        }

    }

    private void withdrawMoney(String name, double amountOfWithdraw, double[] balancesOnAccounts, String[] namesArray) {

        System.out.println("===========================================");
        System.out.println(name + " want to withdraw "+ amountOfWithdraw);

        for (int i = 0; i < namesArray.length; i++) {
            if( namesArray[i].equals(name) )
            {
                System.out.println("Current balance of account is \t" + balancesOnAccounts[i]);

                if( ( balancesOnAccounts[i] - 1.05* amountOfWithdraw ) >= 0){
                    balancesOnAccounts[i] -= 1.05* amountOfWithdraw;
                    System.out.println("Operation successful");
                }else {
                    System.out.println("Insufficient funds!");
                }

                System.out.println(name+"'s balance after transaction is " + balancesOnAccounts[i]);
                System.out.println("===========================================\n");
                break;
            }
        }
    }


}
