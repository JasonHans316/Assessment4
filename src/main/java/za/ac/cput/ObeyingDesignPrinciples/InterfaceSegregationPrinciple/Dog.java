package za.ac.cput.ObeyingDesignPrinciples.InterfaceSegregationPrinciple;

/**
 * Created by Admin on 2016/03/24.
 */
public class Dog implements LandAnimal {

    public void walk() {
        System.out.println("Walking. . .");
    }

    public void run() {
        System.out.println("Running. . .");
    }
}
