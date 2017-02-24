package homeWork03;

/*ЗАДАНИЕ 1
        You must add a sing method to the Bird class, then modify the main method
        accordingly so that the code prints the following lines:

        I am walking
        I am flying
        I am singing
        I am Bird
*/

public class Bird {

    public static void main(String[] args) {
        Bird bird = new Bird();

        bird.sing("I am walking");
        bird.sing("I am flying");
        bird.sing("I am singing");
        bird.sing("I am Bird");

    }

    public void sing(String song) {
        System.out.println(song);
    }
}
