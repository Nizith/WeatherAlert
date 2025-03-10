package consumers.consumer3.src;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class ConsumerActivator implements BundleActivator {
    public void start(BundleContext context) {
        ServiceReference ref = context.getServiceReference(WeatherService.class.getName());
        if (ref != null) {
            WeatherService service = (WeatherService) context.getService(ref);
            WeatherConsumer consumer = new WeatherConsumerImpl();
            consumer.consumeWeatherData(service.getWeatherUpdate());
        }
    }

    public void stop(BundleContext context) {
        System.out.println("Consumer 3 Stopped");
    }
}
