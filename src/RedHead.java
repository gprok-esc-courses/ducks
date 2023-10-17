public class RedHead extends Duck {

    public RedHead() {

        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
    public void display() {
        System.out.println("I'm a redhead duck");
    }
}
