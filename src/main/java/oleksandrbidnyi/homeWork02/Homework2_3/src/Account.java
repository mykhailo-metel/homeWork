import java.util.Arrays;

public class Account {
    private double commission = 0.05;
    private double[] balances;
    private String[] ownerNames;

    public Account(double[] balances,String[] ownerNames) {
        this.balances = balances;
        this.ownerNames = ownerNames;
    }

    public void withdrowal(double moneyYouWantToWithdraw, String ownerName){
        int index = Arrays.asList(ownerNames).indexOf(ownerName);

        if(index<0){
            System.out.println("There is no such account name");
            return;
        }
        double balance; //произвел перенос balance в локальные переменные
        balance = balances[index];
        if (moneyYouWantToWithdraw < 0) {//добавил проверку на валидность
            System.out.println("Invalid value");
        }
        else if ((balance-moneyYouWantToWithdraw-(moneyYouWantToWithdraw* commission)>=0)){
            balance = balance-moneyYouWantToWithdraw-(moneyYouWantToWithdraw* commission);
            System.out.println(ownerName+" OK, commission: " + commission + " balance after withdrawal: " + balance);
            balances[index] = balance;
        }else{
            System.out.println("Not enough money to complete this operation");
        }
    }
}