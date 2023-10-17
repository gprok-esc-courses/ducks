public class Rubber extends Duck {

    public Rubber() {

        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeck();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
