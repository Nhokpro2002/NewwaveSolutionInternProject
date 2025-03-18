package test.spring.exercise.exercise1;

import test.spring.exercise.exercise1.service.VehicleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.spring.exercise.exercise1.config.AppConfig;

public class WebBackEndLaboratoryApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        VehicleService vehicleService = context.getBean(VehicleService.class);

        vehicleService.startVehicle();
    }
}
