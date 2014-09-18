package dip.lab1;

import java.text.NumberFormat;

/**
 *
 * @author eennis
 */
public class Startup {
    
    //Make HRService accept multiple Employee objects, sort by empNo
    
    public static void main(String[] args) {

        HRService hr1 = new HRService(new HourlyEmployee(10.50, 2020));
        HRService hr2 = new HRService(new SalariedEmployee(45000, 1250));

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.println("Employee 1 annual compensation: " +
            nf.format(hr1.getAnnualCompensationForEmployee()));
        System.out.println("Employee 2 annual compensation: " +
            nf.format(hr2.getAnnualCompensationForEmployee()));

        
    }

}
