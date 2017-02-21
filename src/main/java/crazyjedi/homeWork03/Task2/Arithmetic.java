package crazyjedi.homeWork03.Task2;

/**
 * Created by Vlad on 09.02.2017.
 */
public class Arithmetic {
    public int add(int a, int b){
        if(Integer.MAX_VALUE-b<a){
            throw new IllegalArgumentException("a+b > max int value!");
        }
        return a+b;
    }
}
