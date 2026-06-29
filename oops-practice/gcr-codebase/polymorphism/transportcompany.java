class Vehicle {
    double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle {
    double fuelCost(int km) {
        return km * 10;
    }

    void openTrunk() {
        System.out.println("Car trunk opened");
    }
}

class Bus extends Vehicle {
    double fuelCost(int km) {
        return km * 30;
    }
}

class Bike extends Vehicle {
    double fuelCost(int km) {
        return km * 5;
    }

    void kickStart() {
        System.out.println("Bike started with kick");
    }
}

class ElectricCar extends Vehicle {
    double fuelCost(int km) {
        return km * 2;
    }
}

public class transportcompany {
    public static void main(String[] args) {
        Vehicle[] fleet = {
            new Car(),
            new Bus(),
            new Bike(),
            new ElectricCar()
        };

        for (Vehicle v : fleet) {

            if (v instanceof Car) {
                System.out.println("Fuel cost for Car: " + v.fuelCost(10));
                Car c = (Car) v;
                c.openTrunk();
            }

            else if (v instanceof Bus) {
                System.out.println("Fuel cost for Bus: " + v.fuelCost(10));
            }

            else if (v instanceof Bike) {
                System.out.println("Fuel cost for Bike: " + v.fuelCost(10));
                Bike b = (Bike) v;
                b.kickStart();
            }

            else if (v instanceof ElectricCar) {
                System.out.println("Fuel cost for ElectricCar: " + v.fuelCost(10));
            }
        }
    }
}