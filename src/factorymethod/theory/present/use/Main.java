package factorymethod.theory.present.use;

interface Vehicle{
//    void transport(int distance);
    double fuelConsumer(double distance);
}
class Car implements Vehicle{
    double fuel_km = 2;

    @Override
    public double fuelConsumer(double distance){
        return fuel_km * distance;
    }


}
class Ship implements Vehicle{
    double fuel_km = 2;
    double waterway_fee = 4;

    @Override
    public double fuelConsumer(double distance) {
        return fuel_km + distance + waterway_fee;
    }
}

abstract class FactoryMethod {
    void load(){
        Vehicle vehicle = createVehicle();

    }
    abstract Vehicle createVehicle();
}
class CreateCar extends FactoryMethod {

    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
class CreateShip extends FactoryMethod {

    @Override
    Vehicle createVehicle() {
        return new Ship();
    }
}
class Transport{
    void message(Vehicle vehicle ,double distance){
        System.out.println("Tiêu thụ " + vehicle.fuelConsumer(distance) + " lit xăng");
    }
//    Nếu có thêm 100 vehicle và 5 method thì chúng ta cần viết 5 method
}

class CarConcrete{
        double fuel_km = 2;
    double fuelConsumer(double distance){
        return fuel_km * distance;
    }
}
class ShipConcrete{
    double fuel_km = 2;
    double waterway_fee = 4;
    double fuelConsumer(double distance){
        return fuel_km + distance + waterway_fee;
    }
}
class TransportConcrete{
//    Ý tưởng dùng constructor
    void message(CarConcrete car, double distance){
        System.out.println("Tiêu thụ " + car.fuelConsumer(distance) + " lit xăng");
    }
    void message(ShipConcrete ship, double distance){
        System.out.println("Tiêu thụ " + ship.fuelConsumer(distance) + " lit xăng");
    }
//    Nếu có thêm 100 vehicle và 5 method thì chúng ta phải viết thêm 100 x 5 = 500 method
}

public class Main {
    public static void main(String []args){
//        Concrete way
        if (true) {
            System.out.println("___________Concrete way");
            TransportConcrete tran = new TransportConcrete();
            tran.message(new CarConcrete(), 100);
            tran.message(new ShipConcrete(), 100);
        }

//        Factory method
        if (true){
            System.out.println("___________Factory method");
            Transport tran = new Transport();
            tran.message(new Car(), 10);
            tran.message(new Ship(), 10);
        }
    }
}
