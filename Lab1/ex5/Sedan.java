public class Sedan extends Car{
 
    int length;

    
    Sedan(int length, int speed, double regularPrice, String color){
        super(speed, regularPrice, color);
        this.length = length;
    }


    @Override
    public double getSalePrice(){
        double pret;
        if(length > 20){
            pret = super.getSalePrice() - (super.getSalePrice() * 5/100);
        }else{
            pret = super.getSalePrice() - (super.getSalePrice() * 10/100);
        }
        return pret;
    }
}
