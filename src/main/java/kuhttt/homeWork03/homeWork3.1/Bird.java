/**
 * Created by Евгений on 08.02.2017.
 */
public class Bird {

    public void iAmWalking(){
        System.out.println("I am walking");
    }

    public void iAmFlying(){
        System.out.println("I am flying");
    }

    public void iAmSinging(){
        System.out.println("I am singing");
    }

    public void iAmBird(){
        System.out.println("I am Bird");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();

        bird.iAmWalking();

        bird.iAmFlying();

        bird.iAmSinging();

        bird.iAmBird();
    }
}
