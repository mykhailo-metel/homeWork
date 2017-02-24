package homeWork04;


public class BankSystemImpl implements BankSystem
{

    @Override
    public void withdrawOfUser(User user, int amount)
    {
        int commission;
        commission = user.getBank().getCommission(amount);

        if ( (amount >= 0) && (user.getBalance() >= commission + amount) && (amount <= user.getBank().getLimitOfWithdrawal() ) ) {
            user.setBalance(user.getBalance()- amount - commission);
        }

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount)
    {
        /*int commissionFrom;
        int commissionTo;

        commissionFrom = userFrom.bank.getCommission(amount);


        if ( (amount >= 0) && (user.balance >= commission + amount) && (amount <= user.bank.getLimitOfWithdrawal() ) ) {
            user.balance -= (amount + commission);
        }*/

    }

    @Override
    public void fundUser(User user, int amount)
    {
        // TODO: Implement this method
    }

    @Override
    public void paySalary(User user)
    {
        // TODO: Implement this method
    }

}
