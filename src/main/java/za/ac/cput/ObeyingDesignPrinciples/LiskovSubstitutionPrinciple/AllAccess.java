package za.ac.cput.ObeyingDesignPrinciples.LiskovSubstitutionPrinciple;

/**
 * Created by Admin on 2016/03/24.
 */
public class AllAccess extends Ticket {
    @Override
    public double calculatePrice()
    {
        return this.getPrice() * this.getHours() * 0.75;
    }
}
