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
        bird.sing();
    }

    private void sing() {
        System.out.println("I am walking\nI am flying\nI am singing\nI am Bird");
    }
}
