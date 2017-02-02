public class Main {
    public static void main(String[] args) {
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        double[] balances={1200, 250, 2000, 500, 3200};
        Account account = new Account(balances,ownerNames);

        //Ниже, в параметрах, мы указываем сумму,
        // которую хотим внести на счет и имя пользователя


        account.fund(100,"Jane");
        account.fund(250.5,"Ann");
        account.fund(200,"Jack");
        account.fund(55500,"Oww");
        account.fund(800,"Lane");

    }
}
