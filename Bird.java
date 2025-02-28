
/**
 * Write a description of class Bird here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bird
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Bird
     */
    public Bird()
    {
        // initialise instance variables
        x = 0;
    }

    private String color;
    private String breed;
    private int age;
    
    public Bird (String color, String breed, int age){
        this.color = color;
        this.breed = breed;
        this.age = age;
    }
    
    public void sing(){
        System.out.println("Bird_vocalization_in_action...");
    }
    
    public String getColour(){
        return this.color;
    }
}
