package pl.ttpsc.solid.dip.weathertracker.solution;

import pl.ttpsc.solid.dip.weathertracker.violation.*;


public class WeatherTracker {
    String currentConditions;
    IContactDevice phone;
    IContactDevice emailer;

    public WeatherTracker(IContactDevice phone, IContactDevice emailer) {
        this.phone = phone;
        this.emailer = emailer;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = phone.generateWeatherAlert(weatherDescription);
            System.out.println(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = emailer.generateWeatherAlert(weatherDescription);
            System.out.println(alert);
        }
    }
}
