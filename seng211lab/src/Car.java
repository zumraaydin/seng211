public class Car {
    String brand ;
    String model ;
    String year  ;
    Engine engine;


    public void disPlayInfo(){
        System.out.println("Brand: " + brand + "model" + model + "year" + year);
        engine.showPower();


        }
    }
}
