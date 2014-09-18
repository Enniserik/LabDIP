/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2;

/**
 *
 * @author eennis
 */
public class TipCalculatorService {
    
    private TipCalculator tc;
    
    public TipCalculatorService(TipCalculator tc){
        this.tc = tc;
    }
    
    public double getCalculatedTip(){
        return tc.getCalculatedTip();
    }
    
}
