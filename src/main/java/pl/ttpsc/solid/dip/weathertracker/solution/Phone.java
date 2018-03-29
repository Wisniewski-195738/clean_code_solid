package pl.ttpsc.solid.dip.weathertracker.solution;

import pl.ttpsc.solid.dip.weathertracker.violation.*;

public class Phone implements IContactDevice {
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "Phone: It is " + weatherConditions;
        return alert;
    }
}
