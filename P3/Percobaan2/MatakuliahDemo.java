package P3.Percobaan2;

import java.util.Scanner;

public class MatakuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah08[] arrayOfMataKuliah = new Matakuliah08[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new Matakuliah08();
            arrayOfMataKuliah[i].tambahData(sc);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1)); 
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("------------------------------------------------");
        }
    }
}