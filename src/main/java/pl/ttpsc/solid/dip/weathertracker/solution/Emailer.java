package pl.ttpsc.solid.dip.weathertracker.solution;

import pl.ttpsc.solid.dip.weathertracker.violation.*;


public class Emailer implements IContactDevice {
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "Email: It is " + weatherConditions;
        return alert;
    }
}
