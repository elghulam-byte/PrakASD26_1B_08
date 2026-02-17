package P1;

import java.util.Scanner;

public class Tugas1_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] KODE = {"A", "B", "D", "F", "T", "E", "Z", "H", "L", "M"};

        String[][] KOTA = {
            {"Banten"},
            {"Jakarta"},
            {"Bandung"},
            {"Bogor"},
            {"Karawang"},
            {"Cirebon"},
            {"Garut"},
            {"Semarang"},
            {"Surabaya"},
            {"Madura"}
        };

        System.out.print("Masukkan kode plat nomor: ");
        String inputKode = sc.nextLine().toUpperCase();

        boolean ditemukan = false;

        for (int i = 0; i < KODE.length; i++) {
            if (inputKode.equals(KODE[i])) {
                System.out.println("Kota untuk kode plat " + inputKode + " adalah: " + KOTA[i][0]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan!");
        }

        sc.close();
    }
}
