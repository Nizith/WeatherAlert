package producers.producer2.src;
import java.util.Random;
import api.src.weather.WeatherService;

public class WeatherServiceImplementaion implements WeatherService {
    public String getWeatherUpdate() {
        int humidity = new Random().nextInt(50) + 30;
        return "Humidity: " + humidity + "%";
    }
}
