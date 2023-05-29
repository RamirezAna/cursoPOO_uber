package Java;

class Main {
    public static void main(String[] args) {
        UberX uberx = new UberX("AMQ123", new Account("Andres", "AM123"),"Chevrolet","Sony");
       /* uberx.passengenger =4;*/
       uberx.setPassengenger(3);
        uberx.printDataCar();

        /*Car car2 = new Car("QWE555", new Account("Andrea", "ADNA855") );
        car2.passengenger =4;
        car2.printDataCar();*/
    }
}
