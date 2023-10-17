public class Decoy extends Duck {

    public Decoy() {

        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Mute();
    }
        @Override
        public void display() {
            System.out.println("I'm a decoy duck");
        }

}
