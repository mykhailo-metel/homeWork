package AllTasks.Bank;

import AllTasks.Currency.Currency;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int withdrawal = 0;
        if(getCurrency().equals(Currency.USD)){
            withdrawal=100;}
        else if(getCurrency().equals(Currency.EUR)){
            withdrawal=150;
        }
        return withdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding=0;
        if(getCurrency().equals(Currency.USD)){
            limitOfFunding = 10000;
        }
        else if (getCurrency().equals(Currency.EUR)){
            limitOfFunding = 5000;
        }
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate = 0;
        if(getCurrency().equals(Currency.USD)){
            monthlyRate=1;
        }
        else if(getCurrency().equals(Currency.EUR)){
            monthlyRate=0;
        }
        return monthlyRate;
    }

    @Override
    int getCommission(int summ) {
        int comission=0;
        if (getCurrency().equals(Currency.USD)){
            if(summ<1000){
                comission=3;
            }else if(summ>1000){
                comission=5;
            }
        }
        else if(getCurrency().equals(Currency.EUR)){
            if (summ<1000){
                comission=10;
            }else if (summ>1000){
                comission=11;
            }
        }
        return comission;
    }
}
