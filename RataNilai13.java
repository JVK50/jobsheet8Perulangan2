package jobsheet8Loop.jobsheet8Perulangan2;
import java.util.Scanner;

public class RataNilai13 {
    public static void main(String[] args) {
        Scanner acc = new Scanner(System.in);

        int i = 1, j;
        float nilai, totalNilai, rataNilai;

        while (i <= 5) {
            totalNilai = 0;
            System.out.println("Input nilai siswa ke-" + i);
            for (j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai ke-" + j + " : ");
                nilai = acc.nextFloat();
                totalNilai += nilai;
                }
                rataNilai = totalNilai / 5;
                System.out.println("Rata-rata nilai siswa ke-" + i + " adalah: " + rataNilai);
                i++;
            }
        
        
        }
    }

