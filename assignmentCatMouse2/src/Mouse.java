import java.util.ArrayList;
import java.util.Random;

public class Mouse extends Mammal {
    Mouse () {
        this.setSex(random.nextBoolean());
        this.setWeight(1);
    }

    public void grow() {
        this.setAge(this.getAge() + 1);
        this.setWeight(this.getWeight() * 1.01);
    }

    public static void mate(ArrayList<Mouse> mice) {
        Random random = new Random();
        Mouse minnie = new Mouse();
        Mouse mickey = new Mouse();
        mickey = mice.remove(random.nextInt(mice.size()));
        minnie = mice.remove(random.nextInt(mice.size()));

        if((mickey.getSex() != minnie.getSex()) && (mickey.getAge() > 1) && (minnie.getAge() > 1)) {
            int numOfBaby = (int) (Math.random() * 4 + 1);
            for (int i = 0; i < numOfBaby; i++) {
                mice.add(new Mouse());
            }
            mice.add(mickey);
            mice.add(minnie);
        }
    }
}
