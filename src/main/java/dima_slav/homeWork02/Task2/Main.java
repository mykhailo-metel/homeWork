package dima_slav.homeWork02.Task2;

public class Main {
    public static void main(String[] args) {
        BankExample bankExample = new BankExample(1000.0); // задаём текущий балланс
        bankExample.withdrawal(350); // задаём сумму желаемого сЪёма средств
    }
}
