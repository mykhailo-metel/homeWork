package dima_slav.homeWork02.Task3;

public class Main {
    public static void main(String[] args) {
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        double[] balance = {1200, 250, 2000, 500, 3200};
        AccountOwner accountOwner = new AccountOwner(balance, ownerNames);
        accountOwner.withdrawal(800, "Jane");
        accountOwner.withdrawal(250, "Ann");
        accountOwner.withdrawal(5000, "Jack");
        accountOwner.withdrawal(250,"Oww");
        accountOwner.withdrawal(2500, "Lane");

    }
}
