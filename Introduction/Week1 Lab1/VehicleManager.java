import java.util.Scanner;


public class VehicleManager {


    //creating instance variables for array for motorcycle and car
    public Car[] car = new Car[3];
    public Motorcycle[] moto = new Motorcycle[3];
    public int selection = 0;

    //run method
    public void run()
    {
        //instantiates 3 objects of Car type and 3 of Motorcycle type

        //Cars
        Car Sports = new Car();
        Sports.running = false;
        Sports.modelYear = 1983;
        Sports.manufacturer = "Toyota";
        Sports.model = "Sprinter Trueno";

        Car Truck = new Car();
        Truck.running = false;
        Truck.modelYear = 2016;
        Truck.manufacturer = "Ford";
        Truck.model = "F-150 SuperCrew Cab";

        Car Sedan = new Car();
        Sedan.running = false;
        Sedan.modelYear = 2002;
        Sedan.manufacturer = "Toyota";
        Sedan.model = "Echo";



        //Motorcycles
        Motorcycle Chopper = new Motorcycle();
        Chopper.running = false;
        Chopper.modelYear = 2019;
        Chopper.manufacturer = "Kawasaki";
        Chopper.model = "Vulcan 900 Classic";

        Motorcycle Cruiser = new Motorcycle();
        Cruiser.running = false;
        Cruiser.modelYear = 2014;
        Cruiser.manufacturer = "Yamaha";
        Cruiser.model = "Bolt";


        Motorcycle Touring = new Motorcycle();
        Touring.running = false;
        Touring.modelYear = 2019;
        Touring.manufacturer = "Indian";
        Touring.model = "Chieftain";


        //places designated objects into the car and moto array
        car[0] = Sports;
        car[1] = Truck;
        car[2] = Sedan;

        moto[0] = Chopper;
        moto[1] = Cruiser;
        moto[2] = Touring;

        Scanner input = new Scanner(System.in);




        // Prompts user to select a car to start
        //First menu
        System.out.print("Please select a car to start: >> \n");
        for(int c = 0; c < 3; c++)
        {
            System.out.printf("%d: %s %s %s. Running: %s\n", c+1, car[c].modelYear, car[c].manufacturer, car[c].model, car[c].running);
        }

        //Scanner analyzes selection/user input for car
        selection = input.nextInt();

        //calling the start method from the car class
        car[selection-1].start();
        selection--;

        //Prints the car selection that has been started
        System.out.printf("The %d %s %s is now running:\n\n", car[selection].modelYear, car[selection].manufacturer ,car[selection].model);



        // Prompts user to select a motorcycle to start
        //Second menu
        System.out.print("Please select a motorcycle to start: >> \n");
        for(int c = 0; c < 3; c++){
            System.out.printf("%d: %s %s %s. Running: %s\n", c+1, moto[c].modelYear, moto[c].manufacturer, moto[c].model, moto[c].running);
        }

        //Scanner analyzes selection/user input for motorcycle
        selection = input.nextInt();

        //calling the start method from the car class
        moto[selection-1].start();
        selection--;
        //Prints the motorcycle selection that has been started
        System.out.printf("The %d %s %s is now running:\n\n", moto[selection].modelYear, moto[selection].manufacturer ,moto[selection].model);




        //Prompts user to select a car to stop
        //Third menu
        System.out.println("Please select a car to stop: >> \n");
        for(int c = 0; c < 3; c++)
        {
            System.out.printf("%d: %s %s %s. Running: %s\n", c+1, car[c].modelYear, car[c].manufacturer, car[c].model, car[c].running);
        }
        selection = input.nextInt();
        //calling the stop method from the car class
        car[selection-1].stop();
        selection--;
        //Prints the car selection that has been stopped
        System.out.printf("The %d %s %s has stopped running:\n\n", car[selection].modelYear, car[selection].manufacturer ,car[selection].model);




        //Prompts user to select a motorcycle to stop
        //Fourth menu
        System.out.println("Please select a motorcycle to stop: >> \n");
        for(int c = 0; c < 3; c++)
        {
            System.out.printf("%d: %s %s %s. Running: %s\n", c+1, moto[c].modelYear, moto[c].manufacturer, moto[c].model, moto[c].running);
        }
        selection = input.nextInt();
        //calling the stop method from the motorcycle class
        moto[selection-1].stop();
        selection--;
        //Prints the motorcycle selection that has been stopped
        System.out.printf("The %d %s %s has stopped running:\n\n", moto[selection].modelYear, moto[selection].manufacturer ,moto[selection].model);


        //Fifth menu displays all 6 vehicle statuses whether they are running or not
        System.out.println("Vehicle statuses: ");

        for(int c = 0; c < 3; c++){
            System.out.println("Car statuses");
            System.out.printf("%d: %d %s %s. Running: %s\n", c+1, car[c].modelYear, car[c].manufacturer, car[c].model,car[c].running);
        }
        for(int c = 0; c < 3; c++){
            System.out.println("Motorcycle statuses");
            System.out.printf("%d: %d %s %s. Running: %s\n", c+1, moto[c].modelYear, moto[c].manufacturer, moto[c].model,moto[c].running);
        }





    }







}
