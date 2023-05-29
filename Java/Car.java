package Java;

import javax.swing.text.DefaultEditorKit.PasteAction;

class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passengenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver; 
    }

    void printDataCar(){
        if(passengenger != null){
            System.out.println("License" +license + "Name Driver" +driver.name + "Pasajeros " +passengenger);
        }
        
    public Integer getPassengenger(){
        return passengenger;
    }
    public void setPassengenger(Integer passengenger){ 
        if(passengenger ==4 ){
            this.passengenger = passengenger;
        }else{
            System.out.println("Cantidad pasajeros incorrecto");
        }
    }

}
