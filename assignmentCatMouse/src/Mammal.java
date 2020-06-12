import java.util.ArrayList;

public class Mammal {
    //instance variables/fields
    private String name;
    private double weight;  //can't be accessed directly in other classes
    private boolean isMale;
    private int age;
    //constructor
    Mammal() {
        this.age = 1;
        this.weight = 1;    //this is default weight for cats and mice
    }

    //grow method
    public void grow() {
        age++;
    }

    //getter and setter for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    //getter and setter for weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    //getter and setter for isMale
    public void setSex(boolean isMale) {
        this.isMale = isMale;
    }

    public boolean getSex() {
        return isMale;
    }

    //getter and setter for age
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}

