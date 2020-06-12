import java.util.ArrayList;
import java.util.Random;
public class Cat extends Mammal {

    //eat method
    public void eat(ArrayList<Mouse> mice) {
        int rando = (int) (Math.random() * mice.size());
        int successRate = (int) (Math.random() * 100);

        if(mice.size() == 0)
            return;     //if mice size is 0, cats can't eat

//        System.out.println("the success rate is: " + successRate);
        //the cat gains weight only when it catches a mouse and it catches a mouse 70% of the time
        if (successRate >= 30) {
            this.setWeight(this.getWeight() + mice.get(rando).getWeight()); //use the getter and setter instead of weight directly
//            System.out.println("the mice originally in the list are: " + mice);
            mice.remove(rando); //the order of getting weight and removing the mouse is important
//            System.out.println("the mouse removed is number: " + rando);
//            System.out.println("the mice left in the list are: " + mice);
//            System.out.println("the cat's weight now is: " + this.getWeight());
        } else {
//            System.out.println("the cat did not catch any mice.");
        }
    }
}
