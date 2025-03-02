package SpringExercise.Exercise1.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bike")
public class Bike implements Vehicle{

    @Override
    public String start() {
        return "Bike is starting ...";
    }

    @Override
    public String stop() {
        return "Bike is stopping";
    }
}
