package consumers.consumer4.src;
import consumersApi.src.WeatherConsumer;

public class WeatherConsumerImpl implements WeatherConsumer {
    public void consumeWeatherData(String data) {
        System.out.println("Consumer 1 received data: " + data);
    }
}
