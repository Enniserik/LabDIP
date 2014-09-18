package dip.lab1;

/**
 *
 * @author eennis
 */
public interface Employee {
    
    //public abstract int getEmpNo();
    //public abstract void setEmpNo(int empNo);
    //Each type of Employee will need a empNo int that is passed in at instantiation
    //(can be changed)
    //Pass in enum of pay period and calculate accordingly
    public abstract double getTotalPay();
    
}
