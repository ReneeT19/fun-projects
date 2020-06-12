import java.util.ArrayList;
import java.util.Random;
public class Mouse extends Mammal {
    Random random = new Random();

    //constructors
    Mouse() {
        this.setSex(random.nextBoolean());
//        System.out.println("The mouse gender is: " + this.getSex());
    }

    //grow method
    public void grow() {
        this.setWeight(this.getWeight() * 1.01);
        this.setAge(getAge() + 1);
    }

    public static ArrayList<Mouse> getRandomMouse(ArrayList<Mouse> mice, int totalMouse) {
        ArrayList<Mouse> newMice = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < totalMouse; i++) {
            int randomIndex = random.nextInt(mice.size());
            newMice.add(mice.remove(randomIndex));
        }
//        System.out.println("The new mice are: " + newMice);
        return newMice;
    }

    //mate method
    public static void mate(ArrayList<Mouse> mice) {

        int numberOfSelected = 2;
        ArrayList<Mouse> newMice = Mouse.getRandomMouse(mice,numberOfSelected);

        if((newMice.get(0).getSex() != newMice.get(1).getSex()) && (newMice.get(0).getAge() > 1) && (newMice.get(1).getAge() > 1)) {
            int numOfBaby = (int) (Math.random() * 4+1);
            for (int i = 0; i < numOfBaby; i++) {
                mice.add(new Mouse());
            }
//            System.out.println("The number of babies is: " + numOfBaby);

            mice.add(newMice.get(0));
            mice.add(newMice.get(1));
//                System.out.println("the number of mice after the mating is: " + mice);
        } else {
//            System.out.println("they are gay mice.");
        }
    }
}


