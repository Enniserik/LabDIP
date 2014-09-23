package dip.lab1;

/**
 * @author eennis
 */
public class HRService {
    
    private Employee[] employees;
    
    public HRService(Employee e){
        employees = new Employee[0];
        addEmployee(e);
    }
    
    public void addEmployee(Employee employee){
        
        
        //Should addEmployee be responsible for validation?
        for(int i = 0; i < employees.length; i++){
            if(employee.getEmpNo() == employees[i].getEmpNo()){
                throw new UnsupportedOperationException("There is already an employee"
                        + "with that Employee Number.");
            }
        }
        
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
