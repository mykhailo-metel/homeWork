package crazyjedi.homeWork04.Task1;

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

    public User(long id, String name, double balance, int monthsOfEmployment
                , String companyName, int salary, Bank bank) {
        if(monthsOfEmployment<0){
            throw new IllegalArgumentException("monthOfEmployment must be > 0");
        }
        if(balance<0){
            throw new IllegalArgumentException("balance must be > 0");
        }
        if(salary<0){
            throw new IllegalArgumentException("salary must be > 0");
        }
        if(bank == null){
            throw new IllegalArgumentException("Bank should not be null");
        }
        if("".equals(companyName)){
            throw new IllegalArgumentException("companyName should not be empty");
        }
        if("".equals(name)){
            throw new IllegalArgumentException("name should not be empty");
        }


        this.id = id;
        this.name = name;
        this.balance = new BigDecimal(balance);
        this.balance.setScale(2,BigDecimal.ROUND_HALF_UP);
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = new BigDecimal(salary);
        this.salary.setScale(2,BigDecimal.ROUND_HALF_UP);
        this.bank = bank;
    }

    @Override
    public String toString(){
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
        if("".equals(name)){
            throw new IllegalArgumentException("name should not be empty");
        }
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance<0){
            throw new IllegalArgumentException("balance must be > 0");
        }
        this.balance = new BigDecimal(balance);
        this.balance.setScale(2,BigDecimal.ROUND_HALF_UP);
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        if(monthsOfEmployment<0){
            throw new IllegalArgumentException("monthOfEmployment must be > 0");
        }
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if("".equals(companyName)){
            throw new IllegalArgumentException("companyName should not be empty");
        }
        this.companyName = companyName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            throw new IllegalArgumentException("salary must be > 0");
        }
        this.salary = new BigDecimal(salary);
        this.salary.setScale(2,BigDecimal.ROUND_HALF_UP);
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        if(bank == null){
            throw new IllegalArgumentException("Bank should not be null");
        }
        this.bank = bank;
    }
}
