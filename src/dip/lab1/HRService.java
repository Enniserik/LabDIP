package dip.lab1;

import javax.swing.JOptionPane;

/**
 * @author eennis
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
