package crazyjedi.homeWork03.Task2;

/**
 * Created by Vlad on 09.02.2017.
 */
public class Task2Runner {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(Adder.add(a,b));//15
        System.out.println(Adder.check(a,b));//true
        System.out.println(Adder.check(b,a));//false

        a = -10;
        b = 5;

        System.out.println(Adder.add(a,b));//-5
        System.out.println(Adder.check(a,b));//false
        System.out.println(Adder.check(b,a));//true

    }

}
