public class Main {

    public static void main(String[] args) {
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        double[] balances={1200, 250, 2000, 500, 3200};
        Account account = new Account(balances,ownerNames);
        account.withdrowal(800,"Jane");
        account.withdrowal(250,"Ann");
        account.withdrowal(8000,"Jack");
        account.withdrowal(300,"Oww");
        account.withdrowal(3000,"Lane");
    }

}

