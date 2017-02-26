package dima_slav.homework03.Task2;

public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;

        Adder adder = new Adder();

        System.out.println(adder.add(a,b));
        System.out.println(adder.check(a,b));
        System.out.println(adder.check(b,a));

        a = -7;
        b = 4;

        System.out.println(adder.add(a,b));
        System.out.println(adder.check(a,b));
        System.out.println(adder.check(b,a));
    }
}
