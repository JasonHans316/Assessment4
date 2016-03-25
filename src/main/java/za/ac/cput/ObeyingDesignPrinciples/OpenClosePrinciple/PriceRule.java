package za.ac.cput.ObeyingDesignPrinciples.OpenClosePrinciple;

/**
 * Created by Admin on 2016/03/24.
 */
public abstract class PriceRule {
    public boolean ruleApplies(Person p){
        return false;
    }
    public double calculatePrice(Person p){
        return p.ticketType.getPrice();
    }

}
