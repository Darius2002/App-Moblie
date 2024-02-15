public class Ford extends Car{
    int year, manufactureDiscount;

   
    Ford(int year,int manufactureDiscount , int speed, double regularPrice, String color){
        super(speed, regularPrice, color);
        this.manufactureDiscount = manufactureDiscount;
        this.year = year;
    }
    

    @Override
    public double getSalePrice(){
        return (super.getSalePrice()- (super.getSalePrice() * manufactureDiscount/100));
    }
}
