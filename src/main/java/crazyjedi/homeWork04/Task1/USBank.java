package crazyjedi.homeWork04.Task1;

import java.math.BigDecimal;

/**
 * Created by Vlad on 15.02.2017.
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees
            , double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    private final int USD_LIMIT_OF_WITHDRAWAL = 1000;
    private final int EURO_LIMIT_OF_WITHDRAWAL = 1200;
    private final int USD_LIMIT_OF_FUNDING = -1; //заведомо невозможное значение
    private final int EURO_LIMIT_OF_FUNDING = 10000;
    private final int USD_MONTHLY_RATE = 1;
    private final int EURO_MONTHLY_RATE = 2;
    private final int BREAKING_POINT_FOR_PRICES = 1000;

    private enum Comissions {
        SMALL_USD ("0.05")
        ,LARGE_USD ("0.07")
        ,SMALL_EUR ("0.06")
        ,LARGE_EUR ("0.08");

        private final String comission_value;
        Comissions(String comission_value) {
            this.comission_value = comission_value;
        }

        public String getComission_value() {
            return comission_value;
        }
    };

    @Override
    int getLimitOfWithdrawal() {
        return this.getCurrency().equals(Bank.Currency.USD) ? USD_LIMIT_OF_WITHDRAWAL : EURO_LIMIT_OF_WITHDRAWAL;
    }

    @Override
        //Если USD, метод вернет -1 как заведомо ложное значение
    int getLimitOfFunding() {
        return this.getCurrency().equals(Bank.Currency.USD) ? USD_LIMIT_OF_FUNDING : EURO_LIMIT_OF_FUNDING;
    }

    @Override
    int getMonthlyRate() {
        return this.getCurrency().equals(Bank.Currency.USD) ? USD_MONTHLY_RATE : EURO_MONTHLY_RATE;
    }

    @Override
    int getCommission(int summ) {
        BigDecimal comission = null;

        if(summ<0){
            throw new IllegalArgumentException("summ should be >= 0");
        }
        if(this.getCurrency().equals(Bank.Currency.USD)&&summ<=BREAKING_POINT_FOR_PRICES){
            comission = new BigDecimal(Comissions.SMALL_USD.getComission_value());
        }
        else if(this.getCurrency().equals(Bank.Currency.USD)&&summ>BREAKING_POINT_FOR_PRICES){
            comission = new BigDecimal(Comissions.LARGE_USD.getComission_value());
        }
        else if(this.getCurrency().equals(Bank.Currency.EUR)&&summ<=BREAKING_POINT_FOR_PRICES){
            comission = new BigDecimal(Comissions.SMALL_EUR.getComission_value());
        }
        else if(this.getCurrency().equals(Bank.Currency.EUR)&&summ>BREAKING_POINT_FOR_PRICES){
            comission = new BigDecimal(Comissions.LARGE_EUR.getComission_value());
        }

        comission.setScale(2,BigDecimal.ROUND_HALF_UP);
        BigDecimal bigDecSumm = new BigDecimal(summ);
        bigDecSumm = bigDecSumm.multiply(comission);
        bigDecSumm.setScale(0,BigDecimal.ROUND_HALF_UP);

        return bigDecSumm.intValue();
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        //TODO Реализовать метод. В задании не указано что он должен возвращать.
        return 0;
    }
}
