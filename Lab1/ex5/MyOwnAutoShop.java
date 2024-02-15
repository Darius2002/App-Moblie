public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan nr1 = new Sedan(5, 270, 100000, "Red");
        Ford nr2, nr3;
        nr2 = new Ford(2000, 10, 200, 4999, "Blue");
        nr3 = new Ford(2020, 15, 250, 49999, "Purple");
        Car nr4 = new Car(300, 150000, "Black");

        System.out.println("Sedan: " + nr1.getSalePrice() + " Ford: 1: " + nr2.getSalePrice() + " 2: " + nr3.getSalePrice() + "  Car: " + nr4.getSalePrice());
    }
}
