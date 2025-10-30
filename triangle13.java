package jobsheet8Loop.jobsheet8Perulangan2;
import java.util.Scanner;

public class triangle13 {
    public static void main(String[] args) {
        Scanner apt = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = apt.nextInt();
        int i = 0;

        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
       apt.close(); 
    }    
}
