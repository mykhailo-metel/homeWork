package crazyjedi.homeWork04.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.math.BigDecimal;

/**
 * Created by Vlad on 15.02.2017.
 */
public abstract class Bank {

    public enum Currency {USD,EUR};

    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployees;
    private BigDecimal avrSalaryOfEmployee;
    private long rating;
    private BigDecimal totalCapital;

    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee
                , long rating, long totalCapital) {

        if(bankCountry.isEmpty()||bankCountry==null){
            throw new IllegalArgumentException("Fill bank's country");
        }

        if(avrSalaryOfEmployee<0){
            throw new IllegalArgumentException("Avg salary can't be <0.");
        }

        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = new BigDecimal(avrSalaryOfEmployee);
        this.avrSalaryOfEmployee.setScale(2,BigDecimal.ROUND_HALF_UP);
        this.rating = rating;
        this.totalCapital = new BigDecimal(totalCapital);
        this.totalCapital.setScale(2,BigDecimal.ROUND_HALF_UP);
    }

    //GETTERS AND SETTERS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() { return bankCountry;}

    public void setBankCountry(String bankCountry) {
        if(bankCountry.isEmpty()||bankCountry==null){
            throw new IllegalArgumentException("Fill bank's country");
        }
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

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee.doubleValue();
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = new BigDecimal(avrSalaryOfEmployee);
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital.longValue();
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = new BigDecimal(totalCapital);
    }

    //METHODS

    abstract int getLimitOfWithdrawal();
    abstract int getLimitOfFunding();
    abstract int getMonthlyRate();
    abstract int getCommission(int summ);
    abstract double moneyPaidMonthlyForSalary();

}
