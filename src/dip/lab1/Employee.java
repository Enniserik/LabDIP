package dip.lab1;

/**
 *
 * @author eennis
 */
public interface Employee {
    
    public abstract int getEmpNo();
    public abstract void setEmpNo(int empNo);
    public abstract double getTotalPay(PaymentType payType);
    
}
