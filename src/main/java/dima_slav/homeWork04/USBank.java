package dima_slav.homeWork04;

public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployee,
                  long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, rating, totalCapital);
    }

    Currency currency = Currency.USD;

    public int getMonthlyRate() {
        int monthlyRate = 0;
        switch (currency) {
            case USD:
                monthlyRate = 1;
                break;
            case EUR:
                monthlyRate = 2;
                break;
        }
        return monthlyRate;
    }

    public int getLimitOfWithdrawal() {
        int LimitOfWithdrawal = 1000;
        switch (currency) {
            case USD:
                LimitOfWithdrawal = 1000;
                break;
            case EUR:
                LimitOfWithdrawal = 1200;
                break;
        }

        return LimitOfWithdrawal;
    }

    public int getLimitOfFunding() {
        int LimitOfFunding;
        if (currency == Currency.EUR) {
            LimitOfFunding = 10000;
        } else {
            LimitOfFunding = Integer.MAX_VALUE;
        }
        return LimitOfFunding;
    }

    public int getCommission(int summ) {
        int getCommission = 0;
        switch (currency) {
            case USD:
                if (summ < 1000) {
                    getCommission = 5;
                } else if (summ >= 1000) {
                    getCommission = 7;
                }
                break;
            case EUR:
                if (summ < 1000) {
                    getCommission = 6;
                } else if (summ >= 1000) {
                    getCommission = 8;
                }
                break;
        }
        return getCommission;
    }

    public double moneyPaidMonthlyForSalary() {
        return 0;
    }
}





