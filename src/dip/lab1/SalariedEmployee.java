package dip.lab1;

/**
 * @author eennis
 */
public class SalariedEmployee implements Employee {

    private double annualSalary;
    private double annualBonus;
    private int empNo;
    
    public SalariedEmployee(double annualSalary, double annualBonus, int empNo) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
        setEmpNo(empNo);
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }
    
    @Override
    public double getTotalPay(PaymentType payType) {
        if(payType.equals(PaymentType.BI_MONTHLY)){
            return (annualSalary + annualBonus) / 24;
        }
        else if(payType.equals(PaymentType.MONTHLY)){
            return (annualSalary + annualBonus) / 12;
        }
        else if(payType.equals(PaymentType.ANNUALY)){
            return annualSalary + annualBonus;
        }
        else{
            return 0;
        }
    }

    @Override
    public int getEmpNo() {
        return empNo;
    }

    @Override
    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    
}
