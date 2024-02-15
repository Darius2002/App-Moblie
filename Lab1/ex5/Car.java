public class Car {
 
    int speed;
    private double regularPrice;
    String color;

    public Car(int speed, double regularPrice, String color){
        this.color = color;
        this.regularPrice = regularPrice;
        this.speed = speed;
    }

    public double getSalePrice(){
        return regularPrice;
    }
}
