package homeWork04;

public class ChinaBank extends Bank{
    private int limitOfWithdrawUsd = 100;
    private int limitOfWithdrawEur = 150;

    private int limitOfFundingEur = 5000;
    private int limitOfFundingUsd = 10000;

    private int monthlyRateUsd = 1;
    private int monthlyRateEur = 0;

    private int commisionUsdBelow1000 = 3;
    private int commisionUsdAbove1000 = 5;

    private int commisionEurBelow1000 = 10;
    private int commisionEurAbove1000 = 11;

    @Override
    int getCommission(int summ)
    {
        int commissionAmount = 0;

        if (summ < 0) {
            throw new RuntimeException();
        }
        else if (currency == Currency.EURO){
            commissionAmount = (summ * ( (summ <= 1000)?commisionEurBelow1000:commisionEurAbove1000))/100;
        }
        else if (currency == Currency.USD) {
            commissionAmount = (summ * ( (summ <= 1000)?commisionUsdBelow1000:commisionUsdAbove1000))/100;
        }
        return commissionAmount;
    }

    @Override
    int getLimitOfWithdrawal()
    {
        if (currency == Currency.EURO){
            return limitOfWithdrawEur;
        }
        else if (currency == Currency.USD) {
            return limitOfWithdrawUsd;
        }

        return 0;
    }

    @Override
    int getMonthlyRate()
    {
        if (currency == Currency.EURO){
            return monthlyRateEur;
        }
        else /*if (currency == currency.USD)*/ {
            return monthlyRateUsd;
        }
    }

    @Override
    int getLimitOfFunding()
    {
        if (currency == Currency.EURO){
            return limitOfFundingEur;
        }
        else /*if (currency == currency.USD)*/ {
            return limitOfFundingUsd;
        }
    }
}
