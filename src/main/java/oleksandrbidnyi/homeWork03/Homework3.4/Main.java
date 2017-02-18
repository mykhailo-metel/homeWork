public class Main {

    public static void main(String[] args) {

        User user1 = new User("Peter",5000, 8,"Honda",1500,"dollar");

        user1.paySalary();
        user1.withdraw(999);
        System.out.println("Количество символов " + user1.companyNameLenght());
        user1.monthIncreaser(2);
        //Выводить баланс с мелочью не получается, так как в условие баланс интовое число,
        //зато он теперь округляется более логично.
        System.out.println(user1.getBalance());
    }
}
