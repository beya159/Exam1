
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SalaryCalculator
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Salary
     */
    public SalaryCalculator()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public void calculateNetPay(int hoursWorked, double hourlyWage){
        double totalSalary = hoursWorked*hourlyWage;
        double deductions = totalSalary*0.30;
        double netPay = totalSalary - deductions;
        System.out.println("Total Salary: " + totalSalary + "$");
        System.out.println("Net Pay: " + netPay + "$");
    }
}

