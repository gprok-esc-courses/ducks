public class PetShop {
    private Duck [] ducks;

    public PetShop() {
        ducks = new Duck[5];
        ducks[0] = new RedHead();
        ducks[1] = new Rubber();
        ducks[2] = new Mallard();
        ducks[3] = new RedHead();
        ducks[3].setFlyBehaviour(new FlyWithProblems());
        ducks[4] = new Decoy();
    }

    public void testDucks() {
        for(int i = 0; i < ducks.length; i++) {
            System.out.println("=========");
            ducks[i].display();
            ducks[i].fly();
            ducks[i].quack();
        }
    }

    public static void main(String[] args) {
        PetShop p = new PetShop();
        p.testDucks();
    }
}
