import java.util.Random;

public class Mammal {
    private String name;
    private int age;
    private double weight;
    private boolean isMale;
    static Random random = new Random();

    Mammal () {
        this.age = 1;
    }

    public void grow() {
        this.age +=1;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public boolean getSex(){
        return isMale;
    }
    public void setSex(boolean isMale) {
        this.isMale = isMale;
    }
}
