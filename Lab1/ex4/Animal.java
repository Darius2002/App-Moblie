public class Animal {
    public String nume;
    public int kg;

    public Animal(String nume, int kg){
        this.nume = nume;
        this.kg = kg;
    }

    public String toString(){
        return ("Nume: " + nume + "  Kg: " + kg);
    }
}
