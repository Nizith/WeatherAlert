package producers.producer1.src;
import api.src.weather.WeatherService;

import java.util.Random;

public class WeatherServiceImplementaion implements WeatherService {
    public String getWeatherUpdate() {
        int temp = new Random().nextInt(15) + 15; // Generate random temperature
        return "Temperature: " + temp + "°C";
    }
}
