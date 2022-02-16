package Defining_Classes.CarInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String brand = input[0];
            String model = input[1];
            String horsePower = input[2];
            Car car = new Car();
            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(Integer.parseInt(horsePower));
            System.out.println(car.carInfo());
        }
    }
}
