package static2.ex;

public class Car {
    static int carCount = 0;

    public Car(String name){
        carCount++;
    }

    public static void showTotalCars(){
        System.out.println(carCount);
    }
}
