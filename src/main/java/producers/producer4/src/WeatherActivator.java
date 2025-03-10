package producers.producer4.src;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import api.src.weather.WeatherService;

public class WeatherActivator implements BundleActivator {
    private ServiceRegistration registration;

    public void start(BundleContext context) {
        WeatherService service = new WeatherServiceImplementaion();
        registration = context.registerService(WeatherService.class.getName(), service, null);
        System.out.println("Producer 4 (Air Pressure) Service Started");
    }

    public void stop(BundleContext context) {
        registration.unregister();
        System.out.println("Producer 4 (Air Pressure) Service Stopped");
    }
}
