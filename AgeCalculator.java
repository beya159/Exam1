
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class AgeCalculator
     */
    public AgeCalculator()
    { 
        // initialise instance variables
        x = 0;
    }
    
    private int currentYear = 2025;

    public int CalculateAge(int birthYear){
        int age = currentYear - birthYear;
        if (age >= 16){
            System.out.println("You are" + age + "years old. You can drive");
        }
        else {
            int yearsLeft = 16 - age;
            System.out.println("You are " + age + "Years old. You need to wait " + yearsLeft + "more years to drive.");
        }
        return age;
    }
}
