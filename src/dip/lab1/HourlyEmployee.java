package dip.lab1;

/**
 * @author eennis
 */
public class HourlyEmployee implements Employee {
    
    private double hourlyRate;
    private double totalHrsForYear;
    private int empNo;
    
    public HourlyEmployee(double hourlyRate, double totalHrsForYear, int empNo) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
        setEmpNo(empNo);
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
    }

    @Override
    public double getTotalPay(PaymentType payType) {
        if(payType.equals(PaymentType.BI_MONTHLY)){
            return hourlyRate * (totalHrsForYear / 24);
        }
        else if(payType.equals(PaymentType.MONTHLY)){
            return hourlyRate * (totalHrsForYear / 12);
        }
        else if(payType.equals(PaymentType.ANNUALY)){
            return hourlyRate * totalHrsForYear;
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
