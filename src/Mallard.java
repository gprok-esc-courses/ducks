public class Mallard extends Duck {

    public Mallard() {

        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
