package za.ac.cput.ObeyingDesignPrinciples.InterfaceSegregationPrinciple;

/**
 * Created by Admin on 2016/03/24.
 */
public class Whale implements AquaticAnimal {

    public void swim() {
        System.out.println("Swimming. . .");
    }

    public void dive() {
        System.out.println("Dove.");
    }

}
