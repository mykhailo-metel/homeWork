package crazyjedi.homeWork03.Task2;

/**
 * Created by Vlad on 09.02.2017.
 */
public class Task2Runner {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        Adder myAdder = new Adder();

        System.out.println(myAdder.add(a,b));//15
        System.out.println(myAdder.check(a,b));//true
        System.out.println(myAdder.check(b,a));//false

        a = -10;
        b = 5;

        System.out.println(myAdder.add(a,b));//-5
        System.out.println(myAdder.check(a,b));//false
        System.out.println(myAdder.check(b,a));//true

    }

}
