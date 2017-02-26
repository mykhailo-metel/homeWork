package crazyjedi.homeWork04.Task1;

import java.math.BigDecimal;

/**
 * Created by Vlad on 15.02.2017.
 */
public class Bank {

    public enum Currency {USD, EUR}

    ;

    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployees;
    private BigDecimal avrSalaryOfEmployee;
    private long rating;
    private BigDecimal totalCapital;
    private TariffsModel tariffs;

    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployees, BigDecimal avrSalaryOfEmployee
            , long rating, BigDecimal totalCapital, TariffsModel tariffs) {

        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = MoneyBigDecimal.createMoneyDecimal(avrSalaryOfEmployee);
        this.rating = rating;
        this.totalCapital = MoneyBigDecimal.createMoneyDecimal(totalCapital);
        this.tariffs = tariffs;
    }

    //GETTERS AND SETTERS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public BigDecimal getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public void setAvrSalaryOfEmployee(BigDecimal avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public BigDecimal getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(BigDecimal totalCapital) {
        this.totalCapital = totalCapital;
    }

    public TariffsModel getTariffs() {
        return tariffs;
    }

    public void setTariffs(TariffsModel tariffs) {
        this.tariffs = tariffs;
    }


    //METHODS

    public int getLimitOfWithdrawal() {
        return this.currency == Currency.USD ? this.tariffs.getUsdWithdrawalLimit() : this.tariffs.getEuroWithdrawalLimit();
    }

    public int getLimitOfFunding() {
        return this.currency == Currency.USD ? this.tariffs.getUsdFundingLimit() : this.tariffs.getEuroFundingLimit();
    }

    public int getMonthlyRate() {
        return this.currency == Currency.USD ? this.tariffs.getUsdMonthlyRate() : this.tariffs.getEuroMonthlyRate();
    }

    public BigDecimal getCommission(int summ) {

        if (summ < 0) {
            throw new IllegalArgumentException("Operation amount should be >=0!");
        }

        if (summ > tariffs.getBreakingPointForPrices()) {
            return this.currency == Currency.USD ?
                    MoneyBigDecimal.createMoneyDecimal(summ).multiply(new BigDecimal(this.tariffs.getLargeUSDComission()))
                    : MoneyBigDecimal.createMoneyDecimal(summ).multiply(new BigDecimal(this.tariffs.getLargeEuroComission()));
        }

        if (summ <= tariffs.getBreakingPointForPrices()) {
            return this.currency == Currency.USD ?
                    MoneyBigDecimal.createMoneyDecimal(summ).multiply(new BigDecimal(this.tariffs.getSmallUSDComission()))
                    : MoneyBigDecimal.createMoneyDecimal(summ).multiply(new BigDecimal(this.tariffs.getSmallEuroComission()));
        }

        return null;
    }

    public BigDecimal moneyPaidMonthlyForSalary(){
        return this.avrSalaryOfEmployee.multiply(new BigDecimal(this.numberOfEmployees));
    };

}
