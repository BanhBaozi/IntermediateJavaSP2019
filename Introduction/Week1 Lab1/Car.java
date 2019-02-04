public class Car extends MotorVehicle {

    public int doorCount = 4;


//start and stop method prints(Taken from VehicleManager to screen inherited instance variables, instance variable values, vehicle type and if it has been started or stopped
    public void start(){
        //sets boolean running to true
        running = true;
        System.out.println("Motor Vehicle Type: Car ");
        System.out.println("Engine Running: " + running);
        System.out.println("Door Count: " + doorCount);
    }

    public void stop(){
        //sets boolean running to false
        running = false;
        System.out.println("Motor Vehicle Type: Car ");
        System.out.println("Engine Running: " + running);
        System.out.println("Door Count: " + doorCount);
    }

}


