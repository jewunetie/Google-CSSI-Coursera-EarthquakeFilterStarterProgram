import java.util.*;

/**
 * Write a description of DistanceFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DistanceFilter implements Filter {
    private double distMax;
    private Location loc;
    public DistanceFilter(double max, Location current){
        distMax = max;
        loc = current;
    }
    
    public boolean satisfies(QuakeEntry qe){
        return (distMax >= (qe.getLocation().distanceTo(loc)));
    }
    
    public String getName(){
        return "Distance ";
    }
    

}
