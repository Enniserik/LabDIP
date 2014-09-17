package dip.lab1;

import javax.swing.JOptionPane;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @author your name goes here
 */
public class HRService {
    
    private Employee employee;
    
    public HRService(Employee employee){
        this.employee = employee;
    }
    
    public double getAnnualCompensationForEmployee(){
        return employee.getTotalPay();
    }

}
