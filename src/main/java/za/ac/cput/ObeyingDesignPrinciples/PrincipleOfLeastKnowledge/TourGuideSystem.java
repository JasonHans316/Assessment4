package za.ac.cput.ObeyingDesignPrinciples.PrincipleOfLeastKnowledge;

import java.util.List;

/**
 * Created by Admin on 2016/03/24.
 */
public class TourGuideSystem {

    List<TourGroup> group;
    TourGroup tg = new TourGroup();

    public void addTourist(Tourist t)
    {
        tg.addTourist(t);
    }

    public void removeTourist(Tourist t)
    {
        tg.removeTourist(t);
    }

    public void replaceGuide(String name)
    {
        tg.setTourGuide(name);
    }

    public void changeDestination(String newDestination)
    {
        tg.setDestination(newDestination);
    }

}
