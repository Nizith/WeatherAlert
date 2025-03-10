package consumers.consumer3.src;
import consumersApi.src.WeatherConsumer;

public class WeatherConsumerImpl implements WeatherConsumer {
    public void consumeWeatherData(String data) {
        System.out.println("Consumer 3 received data: " + data);
    }
}
