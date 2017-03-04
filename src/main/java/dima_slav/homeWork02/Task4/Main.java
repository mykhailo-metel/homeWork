package dima_slav.homeWork02.Task4;

public class Main {
    public static void main(String[] args) {
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        int[] balances = {1200, 250, 2000, 500, 3200};
        FundBalance fundBalance = new FundBalance(balances, ownerNames);

        //В параметрах указывавем сумму пополнения и имя пользователя.
        fundBalance.fund(800, "Jane");
        fundBalance.fund(3000, "Ann");
        fundBalance.fund(750, "Jack");
        fundBalance.fund(6500, "Oww" );
        fundBalance.fund(2500, "Lane");
    }
}
