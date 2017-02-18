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
        Bird bird1 = new Bird();
        Bird bird2 = new Bird(){
            @Override
            public void sing(){
                System.out.println("I am flying");
            }
        };

        Bird bird3 = new Bird(){
            @Override
            public void sing(){
                System.out.println("I am singing");
            }
        };

        Bird bird4 = new Bird(){
            @Override
            public void sing(){
                System.out.println("I am Bird");
            }
        };

        bird1.sing();
        bird2.sing();
        bird3.sing();
        bird4.sing();
    }

    public void sing() {
        System.out.println("I am walking");
    }
}
