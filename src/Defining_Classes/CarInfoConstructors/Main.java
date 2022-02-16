package Defining_Classes.CarInfoConstructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String brand = input[0];
            Car car = new Car(brand);

            if (input.length>1){
                String model = input[1];
                String horsePower = input[2];
                car.setModel(model);
                car.setHorsePower(Integer.parseInt(horsePower));

            }else {
                car.setBrand(brand);
            }
            System.out.println(car.carInfo());
        }
    }
}
