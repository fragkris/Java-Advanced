package Defining_Classes.RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        while (n-->0){
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            double t1Pressure = Double.parseDouble(input[5]);
            int t1Age = Integer.parseInt(input[6]);
            double t2Pressure = Double.parseDouble(input[7]);
            int t2Age = Integer.parseInt(input[8]);
            double t3Pressure = Double.parseDouble(input[9]);
            int t3Age = Integer.parseInt(input[10]);
            double t4Pressure = Double.parseDouble(input[11]);
            int t4Age = Integer.parseInt(input[12]);
            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tires tires = new Tires(t1Pressure,t1Age,t2Pressure,t2Age,t3Pressure,t3Age,t4Pressure,t4Age);


            Car car = new Car(model, engine, cargo, tires);
            cars.add(car);

        }
        String command = scanner.nextLine();
        if (command.equals("fragile")){
            // tires under 1
            for (Car car : cars) {

                if (car.getTires().getTire1Pressure()<1 ||
                car.getTires().getTire2Pressure()<1 ||
                car.getTires().getTire3Pressure()<1 ||
                car.getTires().getTire4Pressure()<1
                        && car.getCargo().getType().equals("fragile")){
                    System.out.println(car.getModel());
                }
            }



        }else if (command.equals("flamable")){
            //engine power > 250
            for (Car car : cars) {
                if (car.getEngine().getPower()>250  && car.getCargo().getType().equals("flamable")){
                    System.out.println(car.getModel());
                }
            }

        }
    }
}
