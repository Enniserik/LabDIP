package dip.lab1;

import java.text.NumberFormat;

/**
 *
 * @author eennis
 */
public class Startup {
    
    //Make HRService accept multiple Employee objects, sort by empNo
    
    public static void main(String[] args) {

        HRService hrService = new HRService(new HourlyEmployee(10.50, 2020, 101));

        hrService.addEmployee(new SalariedEmployee(45000, 1250, 102));

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.println("Employee 1 monthly compensation: " +
            nf.format(hrService.getCompensationForEmployee(PaymentType.MONTHLY, 101)));
        System.out.println("Employee 2 annual compensation: " +
            nf.format(hrService.getCompensationForEmployee(PaymentType.ANNUALY, 102)));

        
    }

}
