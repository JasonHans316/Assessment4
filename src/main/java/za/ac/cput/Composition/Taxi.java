package za.ac.cput.Composition;

import java.lang.annotation.Target;

/**
 * Created by Admin on 2016/03/24.
 */

/* Old Inheritance Method
public class Taxi extends RoadVechile{

    @Override
    public double calculateCost()
    {
        return time*rate;
    }
}
*/

public class Taxi implements Transport{

    public int time;
    public double rate;
    public double distance;

    public double calculateCost()
    {
        return time*rate;
    }
}