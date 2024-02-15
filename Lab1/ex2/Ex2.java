import java.util.Scanner;

public class Ex2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Numarul de elemte: ");
        int n = sc.nextInt();
        int v[] = new int[n];
        int sum = 0;
        
        for (int i = 0 ; i < n; ++i){
            System.out.println("Elementul cu nr. " + (i + 1) + " este: ");
            v[i] = sc.nextInt();
            sum += v[i];
        }

        sum = sum/n;
        System.out.println("Media aritmetica este: " + sum);
    }
}
