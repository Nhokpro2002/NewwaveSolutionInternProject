package test.SpringExercise.Exercise1.model;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("car")
public class Car implements Vehicle {


    @Override
    public String start() {
        return "Car is starting ...";
    }

    @Override
    public String stop() {
        return "Car is stopping";
    }
}
