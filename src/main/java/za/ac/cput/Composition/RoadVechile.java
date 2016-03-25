package za.ac.cput.Composition;

/**
 * Created by Admin on 2016/03/24.
 */
public class RoadVechile implements Transport{

    public int time = 0;
    public double distance = 0.0;
    public double rate = 0.0;

    /*
    public void setTravelTime(int minutes) {
        this.time = minutes;
    }

    public int getTravelTime(){
        return time;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistance(){
        return distance;
    }
    */

    public double calculateCost() {
        return rate*distance;
    }

}
