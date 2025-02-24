package hus.datatype;

public class Part4 {

    public static void main(String[] args) {

        System.out.print("velocity: ");
        System.out.println(calculateVelocity(2500, 5, 56, 23) + " m/s");
        System.out.print("velocity: ");
        System.out.println(calculateVelocity(2500, 5, 56, 23) +" km/h");
    }

    public static double calculateVelocity(int distance, int hours, int minutes, int seconds) {
        // Velocity is m/s
        int time = hours * 3600 + minutes * 60 + seconds;
        return (double) distance / time;
    }

    public static double calculateVelocity(double distance, int hours, int minutes, int seconds) {
        double time = hours + (double) minutes / 60 + (double) seconds / 3600;
        double s = distance / 1000;
        return (double) s / time;
    }
}
