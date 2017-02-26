package dima_slav.homeWork04;

public class ChinaBank extends Bank {
    Currency currency = Currency.USD;

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, rating, totalCapital);
    }


    @Override
    int getLimitOfWithdrawal() {
        int LimitOfWithdrawal = 0;
        switch (currency) {
            case USD:
                LimitOfWithdrawal = 100;
                break;
            case EUR:
                LimitOfWithdrawal = 150;
                break;
        }
        return LimitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int LimitOfFunding = 0;
        switch (currency) {
            case USD:
                LimitOfFunding = 10000;
                break;
            case EUR:
                LimitOfFunding = 5000;
        }
        return LimitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int MonthlyRate = 0;
        switch (currency) {
            case USD:
                MonthlyRate = 1;
                break;
            case EUR:
                MonthlyRate = 0;
                break;
        }
        return MonthlyRate;
    }

    @Override
    int getCommission(int summ) {
        int Commission = 0;
        switch (currency) {
            case USD:
                if (summ < 1000) {
                    Commission = 3;
                } else if (summ >= 1000) {
                    Commission = 5;
                }
                break;
            case EUR:
                if (summ < 1000) {
                    Commission = 10;
                } else if (summ >= 1000) {
                    Commission = 11;
                }
                break;
        }
        return Commission;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}


