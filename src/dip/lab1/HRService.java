package dip.lab1;

import javax.swing.JOptionPane;

/**
 * @author eennis
 */
public class HRService {
    
    private Employee[] employees;
    
    public HRService(){
        employees = new Employee[0];
    }
    
    public void addEmployee(Employee employee){
        Employee[] temp = new Employee[employees.length + 1];
        System.arraycopy(employees, 0, temp, 0, employees.length);
        temp[employees.length] = employee;
        employees = temp;
    }
    
    public double getCompensationForEmployee(PaymentType payType, int empNo){
        for(int i = 0; i < employees.length; i++){
            if(employees[i].getEmpNo() == empNo){
                return employees[i].getTotalPay(payType);
            }
        }
        return 0;
    }

}
