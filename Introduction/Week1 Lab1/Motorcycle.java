public class Motorcycle extends MotorVehicle{
    public boolean riser = true;


    //start and stop method prints to screen inherited instance variables, instance variable values, vehicle type and if it has been started or stopped
    public void start(){
         running = true;
         System.out.println("Motor Vehicle Type: Motorcycle ");
         System.out.println("Engine Running: " + running);
         System.out.println("Riser: " + riser);

    }

    public void stop(){
        running = false;
        System.out.println("Motor Vehicle Type: Motorcycle ");
        System.out.println("Engine Running: " + running);
        System.out.println("Riser: " + riser);
    }

}
