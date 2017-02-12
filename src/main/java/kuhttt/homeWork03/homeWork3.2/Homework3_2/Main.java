package Homework3_2;

/**
 * Created by Евгений on 11.02.2017.
 */
public class Main {

    public static void main(String[] args) {

        Adder obj = new Adder();

        System.out.println("Sum = " + obj.add(5, 7) + '\n' +

                           "Check = " + obj.check(5, 7));
    }
}
