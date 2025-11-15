package jobsheet8Loop.jobsheet8Perulangan2.Tugas;
import java.util.Scanner;

public class Tugas2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("==============================\n");
        System.err.print("=   Input Data Atlet Start   =\n");
        System.out.print("==============================\n");
        
        String name = "", politeknik = "", pilih = "";
        int category;

        for (int i = 1; i <= 20; i++) {
            
            System.out.print("Masukkan nama atlet: ");
            name = sc.nextLine();
            
            System.out.print("Asal Politeknik: ");
            politeknik = sc.nextLine();
            
            System.out.println("Kategori Lomba: ");
            System.out.println("1. Badminton\n2. Basket\n3. Tenis Meja\n4. Bola Voli");
            System.out.print("Masukkan pilihan (1-4): ");
            category = sc.nextInt();
            sc.nextLine();
            
            pilih = switch (category) {
                case 1 -> "Badminton";
                case 2 -> "Basket";
                case 3 -> "Tenis Meja";
                case 4 -> "Bola Voli";
                default -> "Kategori tidak valid";
            };

        }
        System.out.println("\n=== Data Atlet ===");
        System.out.println("Kategori Lomba: " + pilih);
        System.out.println("Nama Atlet: " + name);
        System.out.println("Asal Politeknik: " + politeknik);
            
        sc.close();
    }
}
