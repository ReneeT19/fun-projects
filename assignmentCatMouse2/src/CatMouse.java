import java.text.DecimalFormat;
import java.util.ArrayList;

public class CatMouse {
    private static DecimalFormat dc = new DecimalFormat("##.##");

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            Cat sylvester = new Cat();
            ArrayList<Mouse> mice = new ArrayList<Mouse>();

            mice.add(new Mouse());
            mice.add(new Mouse());
            mice.add(new Mouse());
            mice.get(0).setSex(true);
            mice.get(1).setSex(false);
            mice.get(2).setSex(false);


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
    }
}
