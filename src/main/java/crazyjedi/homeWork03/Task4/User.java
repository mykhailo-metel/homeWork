package crazyjedi.homeWork03.Task4;

/**
 * Created by Vlad on 09.02.2017.
 */
public class User {

    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
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
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
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
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0) { //Предположим, что предоставление кредита не предусмотрено
            throw new IllegalArgumentException("balance must be >= 0.");
        }
        this.balance = balance;
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
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("salary must be >= 0.");
        }
        this.salary = salary;
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
        this.balance += this.salary;
    }

    public void withdraw(int summ) {
        double comission = summ < 1000 ? 0.05 : 0.1;
        int withdrawalAmt = (int) Math.round(summ * (1 + comission));
        if (this.balance < withdrawalAmt) {
            throw new IllegalArgumentException("Not enough balance to make a withdrawal.");
        }
        this.balance -= summ * (1 + comission);
    }

    public int companyNameLenght() {
        return this.companyName.length();
    }

    public void monthIncreaser(int addMonth) {
        if(addMonth<0){
            throw new IllegalArgumentException("This method INCREASES monthOfEmployment. addMonth should be >=0");
        }
        this.monthsOfEmployment+=addMonth;
    }

}
