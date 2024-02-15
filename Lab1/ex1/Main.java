import java.util.Scanner;
public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 0){
            System.out.println("Numarul este pozitiv");
        }
        else if (a < 0){
            System.out.println("Numarul este negativ");
        }
        else{
            System.out.println("Numarul este 0");
        }
    }
}
