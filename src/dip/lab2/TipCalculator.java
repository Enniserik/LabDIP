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
public interface TipCalculator {

    public double getCalculatedTip();
    public void setServiceRating(ServiceQuality q);
    public ServiceQuality getServiceQuality();
    
}
