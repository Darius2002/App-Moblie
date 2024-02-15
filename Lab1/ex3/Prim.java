public class Prim {

    public static boolean prim(int a){
        boolean prim = true;
        if(a < 2)
            prim = false; 
        for(int i = 2 ; i * i <= a ; ++i)
            if(a % i == 0)
                prim = false;
        return prim;
    }
    public static void main(String args[]){

        for (int i  = 0; i <= 100; ++i){

            if (prim(i) == true && prim(i+2) == true){
                System.out.println("(" + i + ", " + (i+2) + ")");
            }
        }
    }
}
