import java.util.ArrayList;

/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoo
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Zoo
     */
    public Zoo()
    {
        // initialise instance variables
    }

    private ArrayList<Bird> zooBirds;
    int countBlueBird(){
        int count = 0;
        for (Bird bird: zooBirds){
            if(bird.getColour().equals("blue")){
                count++;
            }
        }
        return count;
        }
}
