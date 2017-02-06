
public class FundBalance {
    public static void main(String[] args) {
        int[] balance = {1200, 250, 2000, 500, 3200};
        String[] Owners = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String Name = Owners[(int) (Math.random() * Owners.length)];
        int found = (int) (Math.random() * 1000);
        found(balance, Owners, Name, found);
    }

    public static void found(int[] balance, String[] names, String Name, int found) {
        int balanceOwner = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i] == Name) {
                balanceOwner = balance[i];
            } else {
                continue;
            }
            double BalanceAfter = balanceOwner + found;

            System.out.println(Name + " " + BalanceAfter);


        }
    }
}



