    package org.example;

    import org.example.enteties.Car;
    import org.example.enteties.CarRentalSystem;

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            CarRentalSystem rentalSystem =new CarRentalSystem();
            Car car1 = new Car("MP09C1","Toyota","Glanza",60.1);
            Car car2 = new Car("MP09C55","Suzuki","Breza",50.7);
            Car car3 = new Car("MP09C88","Mahindra","Thar",90.6);

            rentalSystem.addCar(car1);
            rentalSystem.addCar(car2);
            rentalSystem.addCar(car3);

            rentalSystem.menu();
        }
    }