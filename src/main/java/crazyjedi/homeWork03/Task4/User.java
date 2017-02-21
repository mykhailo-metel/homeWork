package crazyjedi.homeWork03.Task4;

import java.math.BigDecimal;

/**
 * Created by Vlad on 09.02.2017.
 */
public class User {

    private String name;
    private BigDecimal balance;
    private int monthsOfEmployment;
    private String companyName;
    private BigDecimal salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        if ("".equals(name)) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        if ("".equals(companyName)) {
            throw new IllegalArgumentException("companyName must not be empty.");
        }
        if ("".equals(currency)) {
            throw new IllegalArgumentException("currency must not be empty.");
        }
        if (monthsOfEmployment < 0) {
            throw new IllegalArgumentException("monthsOfEmployment must be >= 0.");
        }
        if (balance < 0) { //Предположим, что предоставление кредита не предусмотрено
            throw new IllegalArgumentException("balance must be >= 0.");
        }
        if (salary < 0) {
            throw new IllegalArgumentException("salary must be >= 0.");
        }
        this.name = name;
        this.balance = new BigDecimal(balance);
        this.balance.setScale(2, BigDecimal.ROUND_HALF_UP);
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = new BigDecimal(salary);
        this.salary.setScale(2, BigDecimal.ROUND_HALF_UP);
        this.currency = currency;
    }

    //GETTERS AND SETTER

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ("".equals(name)) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.name = name;
    }

    public int getBalance() {
        return balance.intValue();
    }

    public void setBalance(int balance) {
        if (balance < 0) { //Предположим, что предоставление кредита не предусмотрено
            throw new IllegalArgumentException("balance must be >= 0.");
        }
        this.balance = new BigDecimal(balance);
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        if (monthsOfEmployment < 0) {
            throw new IllegalArgumentException("monthsOfEmployment must be >= 0.");
        }
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if ("".equals(companyName)) {
            throw new IllegalArgumentException("companyName must not be empty.");
        }
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary.intValue();
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("salary must be >= 0.");
        }
        this.salary = new BigDecimal(salary);
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        if ("".equals(currency)) {
            throw new IllegalArgumentException("currency must not be empty.");
        }
        this.currency = currency;
    }

    //USER BEHAVIOR

    public void paySalary() {
        this.balance = this.balance.add(this.salary);
    }

    public void withdraw(int summ) { //Стоило бы сделать withdraw(String summ), но оставляю как в задании
        final String COMISSION_UP_TO_1000="1.05";
        final String COMISSION_MORE_THEN_1000="1.1";
        BigDecimal comission = summ < 1000 ? new BigDecimal(COMISSION_UP_TO_1000) : new BigDecimal(COMISSION_MORE_THEN_1000);
        BigDecimal withdrawalAmt = new BigDecimal(summ).multiply(comission);
        withdrawalAmt.setScale(2, BigDecimal.ROUND_HALF_UP);
        if (this.balance.compareTo(withdrawalAmt) < 0) {
            throw new IllegalArgumentException("Not enough balance to make a withdrawal.");
        }
        this.balance = this.balance.subtract(withdrawalAmt);
    }

    public int companyNameLenght() {
        return this.companyName.length();
    }

    public void monthIncreaser(int addMonth) {
        if (addMonth < 0) {
            throw new IllegalArgumentException("This method INCREASES monthOfEmployment. addMonth should be >=0");
        }
        this.monthsOfEmployment += addMonth;
    }

}
