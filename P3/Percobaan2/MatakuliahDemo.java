package P3.Percobaan2;

import java.util.Scanner;

public class MatakuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlahMatkul = Integer.parseInt(sc.nextLine());

        Matakuliah08[] arrayOfMataKuliah = new Matakuliah08[jumlahMatkul];

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new Matakuliah08();
            arrayOfMataKuliah[i].tambahData(sc);
        }

        System.out.println("\n=== Hasil Informasi Matakuliah ===");
        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1)); 
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("------------------------------------------------");
        }
    }
}