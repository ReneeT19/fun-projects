import java.util.ArrayList;
import java.util.Random;
import java.text.DecimalFormat;

public class CatMouse {

    private static DecimalFormat dc = new DecimalFormat("##.##");

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {                   //the whole program needs to run 10 times
            Cat sylvester = new Cat();
            ArrayList<Mouse> mice = new ArrayList<Mouse>(); //generic

            mice.add(new Mouse());
            mice.add(new Mouse());
            mice.add(new Mouse());
            mice.add(new Mouse());
            mice.add(new Mouse());

            mice.get(0).setWeight(30);
            mice.get(1).setWeight(20);
            mice.get(2).setWeight(5);
            mice.get(3).setWeight(3);
            mice.get(4).setWeight(2);

            while (mice.size() > 1 && mice.size() < 10) {
                for (Mouse m : mice)
                    m.grow();
                sylvester.grow();
                Mouse.mate(mice);
                sylvester.eat(mice);
            }

            if (mice.size() >= 10) {
                System.out.println("Mice RULE, Cats Drool. Mice Population: " + mice.size());
            } else {
                System.out.println("Cats RULE, Mice Drool. Cat Weight(in mice): " + dc.format(sylvester.getWeight()));
            }
        }



        //        Mammal soren = new Mammal();
//        Cat baby = new Cat();
//        baby.setName("Soren");
//        System.out.println("the baby's name is: " + baby.getName());
//
//        baby.setSex(true);
//        //System.out.println("the baby's sex is: " + (baby.getSex() ? "boy" : "girl"));
//        if(baby.getSex())
//        System.out.println("the baby's sex is: " + "boy");
//        else
//        System.out.println("the baby's sex is: " + "girl");
//
//        baby.setWeight(30);
//        System.out.println("the baby's weight is: " + baby.getWeight() + "lb.");
    }
}
