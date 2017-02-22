package dima_slav.homeWork04;


public class EUBank extends Bank {
    Currency currency = Currency.EUR;

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int LimitOfWithdrawal = 0;
        switch (currency) {
            case USD:
                LimitOfWithdrawal = 2200;
                break;
            case EUR:
                LimitOfWithdrawal = 2000;
                break;
        }
        return LimitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int LimitOfFunding = 0;
        switch (currency) {
            case EUR:
                LimitOfFunding = 20000;
                break;
            case USD:
                LimitOfFunding = 10000;
                break;
        }
        return LimitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate = 0;
        switch (currency) {
            case EUR:
                monthlyRate = 1;
                break;
            case USD:
                monthlyRate = 0;
                break;
        }
        return monthlyRate;
    }

    @Override
    int getCommission(int summ) {
        int commission = 0;
        switch (currency) {
            case EUR:
                if (summ < 1000) {
                    commission = 2;
                } else if (summ >= 100) {
                    commission = 4;
                }
                break;
            case USD:
                if (summ < 1000) {
                    commission = 5;
                } else if (summ >= 100) {
                    commission = 7;
                }
                break;
        }
        return commission;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}




