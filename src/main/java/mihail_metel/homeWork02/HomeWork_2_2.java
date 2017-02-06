package homeWork02;

// задание:
//    Continue with BANK example
//            2.1 Write method which withdraws money from account and takes commision 5% of the transaction.
//          Print OK + commision + balance after withdrawal. Print NO is withdrawal is not possible.
//
//            Example
//
//            Input
//
//            balance = 100
//            withdrawal = 10
//
//            Output
//            OK 0.5 89.5
//
//            Input
//
//            balance = 100
//            withdrawal = 99
//
//            Output
//            NO

public class HomeWork_2_2 {
    public static void main(String[] args) {

        HomeWork_2_2 classItem = new HomeWork_2_2();
        double Ballance1=200;
        double Ballance2=50;

        double amount=100;                      // Случай когда денег достаточно
        classItem.withdraw(Ballance1, amount);

        amount = 49;                            // Случай когда денег достаточно
        classItem.withdraw(Ballance2,amount);

    }

    public double withdraw(double remainingFunds, double amountOfCash) {

        System.out.println("\n===========================================");
        System.out.println("Current ballance of account is \t" + remainingFunds);
        System.out.println("Withdrawal amount is: \t\t\t"+ amountOfCash);

        if( ( remainingFunds - 1.05 * amountOfCash ) >= 0 ) {
            System.out.println("Operation successful!");
            remainingFunds -=1.05* amountOfCash;
            System.out.println("Balance after transaction is: \t" + remainingFunds);
            System.out.println("===========================================\n");
            return remainingFunds;
        }
        else {
            System.out.println("Insufficient funds. Sorry.");
        }

        System.out.println("===========================================\n");
        return remainingFunds;
    }

}