/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.ttpsc.solid.dip.weathertracker.solution;

/**
 *
 * @author Siwy
 */
public class Example {
    public static void main(String[] args) {
        WeatherTracker wt = new WeatherTracker(new Phone(), new Emailer());
        wt.setCurrentConditions("rainy");
        wt.setCurrentConditions("sunny");
        wt.setCurrentConditions("rainy");
    }
}
