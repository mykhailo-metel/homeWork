package Homework3_4;

public class User {

    private String name;

    private  int balance;

    private  int monthsOfEmployment;

    private String companyName;

    private int salary;

    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getBalance() {
        return balance;
    }

    private void setBalance(int balance) {
        this.balance = balance;
    }

    private int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    private void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    private String getCompanyName() {
        return companyName;
    }

    private void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    private int getSalary() {
        return salary;
    }

    private void setSalary(int salary) {
        this.salary = salary;
    }

    private String getCurrency() {
        return currency;
    }

    private void setCurrency(String currency) {
        this.currency = currency;
    }

    public void paySallary() {
        setBalance(getBalance() + getSalary());
    }

    public void withdraw(int summ) {
        if (summ < 0) {
            throw new IllegalArgumentException("Invalid withdrawal amount!");
        }
        int withdrawAmount = (int) (summ < 1000 ? summ + (summ * 0.05) : summ + (summ * 0.1));
        if (withdrawAmount > getBalance()) {
            throw new IllegalArgumentException("Not enough money!");
        }
        setBalance(getBalance() - withdrawAmount);
    }

    public int companyNameLength() {
        return getCompanyName().length();
    }

    public void monthIncrease(int addMonth) {
        setMonthsOfEmployment(getMonthsOfEmployment() + addMonth);
    }
}
