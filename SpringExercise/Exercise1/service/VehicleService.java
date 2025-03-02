package SpringExercise.Exercise1.service;


import SpringExercise.Exercise1.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

   private final Vehicle vehicle;

   @Autowired
    public VehicleService(@Qualifier("bike") Vehicle bike) {
       this.vehicle = bike;
   }

   public void startVehicle() {
       System.out.println(vehicle.start());
   }
}
