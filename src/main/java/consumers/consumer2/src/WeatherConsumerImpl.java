package consumers.consumer2.src;
import consumersApi.src.WeatherConsumer;

public class WeatherConsumerImpl implements WeatherConsumer {
    public void consumeWeatherData(String data) {
        System.out.println("Consumer 2 received data: " + data);
    }
}
