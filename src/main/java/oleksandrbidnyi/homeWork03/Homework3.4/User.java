public class User {

    private String name;
    private int balance;
    private int monthsOfEmployment;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public void paySalary(){
// setBalance(salary+balance);
        System.out.println("Баланс, после начисления заработной платы: " + (salary + balance));
        setBalance(salary+balance);
    }

    public void withdraw (int summ){
        double balanceAfterWithdraw;
        if (summ <= 0) {
            System.out.println("Указанная сумма меньше 0 или равна 0");
            return;
        }
        if(summ<1000 && balance > (summ*1.05)){
            balanceAfterWithdraw = balance - (summ*0.05 + summ);
            System.out.println("Сумма меньше 1000, комиссия составляет 5%, баланс после снятия денег: " + balanceAfterWithdraw);
            setBalance((int)balanceAfterWithdraw);
        } else if (summ>1000&& balance > (summ*1.1)){
            balanceAfterWithdraw = balance - (summ*0.1 + summ);
            System.out.println("Сумма больше 1000, комиссия составляет 10%, баланс после снятия денег: " + balanceAfterWithdraw);
            setBalance((int)balanceAfterWithdraw);
        }
    }

    public void companyNameLenght(){
        System.out.println("Длина имени компании: " + companyName.length() + " символов");
    }

    public void monthIncreaser(int addMonth){
        if(addMonth<0 || addMonth==0){
            System.out.println("Указанное число меньше 0 или равно 0");
        }else {
            System.out.println("Текущее количество месяцов занятости, после добавления: " + (monthsOfEmployment + addMonth));
            setMonthsOfEmployment(monthsOfEmployment + addMonth);
        }
    }
}