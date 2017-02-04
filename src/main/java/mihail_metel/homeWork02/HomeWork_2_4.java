package homeWork02;

/**
 ДЗ №02.4
 You need to write method which will fund (пополнение) balance of particular user. Print name + balance after funding
 Input
 int[] balances = {1200, 250, 2000, 500, 3200};
 String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
 String ownerName = Oww
 double withdrawal = 100;
 Output
 Oww 600
 */

public class HomeWork_2_4 {
    public static void main(String[] args) {
        HomeWork_2_4 classItem = new HomeWork_2_4();
        double[] balances = {15, 250, 2000, 500, 3200};
        String[] ownerNames = {"Vasia", "Ann", "Petia", "Oww", "Lane"};

        String ownerName;
        double amount;

        ownerName = "Vasia";
        amount = 10;
        classItem.fundMoney(ownerName, amount, balances, ownerNames);

        ownerName="Petia";
        amount=200;
        classItem.fundMoney(ownerName, amount, balances, ownerNames);

        classItem.printBalances(ownerNames,balances);

    }

    public void printBalances(String[] ownerNames, double[] balances) {
        for (int i = 0; i < ownerNames.length; i++)
            System.out.println("Name: " + ownerNames[i] + "\t Balance: " + balances[i]);
    }

    public void fundMoney(String name, double amountOfFunding, double[] balancesOnAccounts, String[] namesArray) {

        System.out.println("===========================================");
        System.out.println(name + " want to fund his account on "+ amountOfFunding);

        for (int i = 0; i < namesArray.length; i++) {
            if( namesArray[i].equals(name) )
            {
                System.out.println(name+"'s balance before funding is " + balancesOnAccounts[i]);
                balancesOnAccounts[i]+= amountOfFunding;
                System.out.println("Operation successful");
                System.out.println(name+"'s balance after funding is " + balancesOnAccounts[i]);
                break;
            }
        }

        System.out.println("===========================================\n");
    }

}