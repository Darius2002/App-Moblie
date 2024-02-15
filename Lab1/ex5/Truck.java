public class Truck extends Car{
    int weight;

    Truck(int weight, int speed, double regularPrice, String color){
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice(){
        double pret;
        if(weight > 2000){
            pret = super.getSalePrice() - (super.getSalePrice() * 10/100);
        }else{
            pret = super.getSalePrice() - (super.getSalePrice() * 20/100);
        }
        return pret;
    }
}
