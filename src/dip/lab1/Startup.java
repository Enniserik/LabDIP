package dip.lab1;

import java.text.NumberFormat;

/**
 * Just a start and test class for this program. You may modify this class
 * in any way you see fit.
 *
 * @author jlombardo
 */
public class Startup {

    public static void main(String[] args) {

        // High-level module
        HRService hr1 = new HRService(new HourlyEmployee(10.50, 2020));
        HRService hr2 = new HRService(new SalariedEmployee(45000, 1250));

        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        // Test input/output..
        System.out.println("Employee 1 annual compensation: " +
            nf.format(hr1.getAnnualCompensationForEmployee()));
        System.out.println("Employee 2 annual compensation: " +
            nf.format(hr2.getAnnualCompensationForEmployee()));

        
    }

}
