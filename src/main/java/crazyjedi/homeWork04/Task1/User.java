package crazyjedi.homeWork04.Task1;

import com.sun.istack.internal.Nullable;

import java.math.BigDecimal;

/**
 * Created by Vlad on 15.02.2017.
 */
public class User {
    private long id;
    private String name;
    private BigDecimal balance;
    private int monthsOfEmployment;
    private String companyName;
    private BigDecimal salary;
    private Bank bank;

    public User(long id, String name, BigDecimal balance, int monthsOfEmployment
                , String companyName, BigDecimal salary, Bank bank) {

        this.id = id;
        this.name = name;
        this.balance = MoneyBigDecimal.createMoneyDecimal(balance);
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = MoneyBigDecimal.createMoneyDecimal(salary);
        this.bank = bank;
    }


    @Override
    public String toString(){
        if ("".equals(this.name)){
            throw new IllegalArgumentException("Name mast be filled!");
        }
        return String.format("User_id:\t%d;\nName:\t%s;\nBalance:\t%.2f;\nEmployed:\t%d months;\nCompany:\t%s;" +
                            "\nSalary:\t%.1f;\nBank:\t%d;",
                this.id, this.name, this.balance.doubleValue(), this.monthsOfEmployment
                ,this.companyName, this.salary.doubleValue(), this.bank.getId()
                );
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = MoneyBigDecimal.createMoneyDecimal(balance);
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = MoneyBigDecimal.createMoneyDecimal(salary);
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
