import java.util.ArrayList;
import java.util.Random;

public class Cat extends Mammal {

public void eat(ArrayList<Mouse> mice) {
    Random random = new Random();
    int successRate = (int) (Math.random() * 100);
    if(mice.size() == 0) return;
    if(successRate >= 30) {
        this.setWeight(this.getWeight() + mice.get(random.nextInt(mice.size())).getWeight());
        mice.remove(random.nextInt(mice.size()));
        }
    }
}
