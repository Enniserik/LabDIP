package dip.lab2;

// An useful import if you need it.
import java.text.DecimalFormat;
import java.text.NumberFormat;
// Another useful import if you need it.


/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author eennis
 */
public class Startup {

    public static void main(String[] args) {
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();   
        
        TipCalculatorService tcs = new TipCalculatorService(new BaggageServiceTipCalculator(
            ServiceQuality.GOOD, 3));
        
//        TipCalculatorService tcs = new TipCalculatorService(new FoodServiceTipCalculator(
//            ServiceQuality.POOR, 30));

        System.out.println("The tip amount is: " + nf.format(tcs.getCalculatedTip()));
    }

}
