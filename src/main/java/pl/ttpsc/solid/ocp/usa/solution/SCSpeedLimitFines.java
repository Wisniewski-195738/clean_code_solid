/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.ttpsc.solid.ocp.usa.solution;

/**
 *
 * @author Siwy
 */
public class SCSpeedLimitFines implements IUSASpeedLimitFines{
    
    private static final int MAX_SPEED = 0;
    
    @Override
    public double calcualateSpeedLimitFine(int speed) {
        double fine = 0;
        if (speed > MAX_SPEED) {
                // calculate...
        }
        return fine;
    }
}
