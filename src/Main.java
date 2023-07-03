public class Main {
    public static void main(String[] args) {

        Car car = new Car("Audi", 4);
        Car car2 = new Car("BMW", 4);
        Truck truck = new Truck("Volvo", 8);
        Truck truck2 = new Truck("Man", 6);
        Bicycle bicycle = new Bicycle("КАМА", 2);
        Bicycle bicycle2 = new Bicycle("УРАЛ", 2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(bicycle);
        station.check(truck);
        station.check(truck2);
    }
}