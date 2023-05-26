package Java;

class Main {
    public static void main(String[] args) {
        Car car = new Car("AMQ123", new Account("Andres", "AM123") );
        car.passengenger =4;
        car.printDataCar();

        Car car2 = new Car("QWE555", new Account("Andrea", "ADNA855") );
        car2.passengenger =4;
        car2.printDataCar();
    }
}