package P1;

import java.util.Scanner;

public class Tugas2_08 {
    static Scanner sc = new Scanner(System.in);

    public static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nData Jadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari             : ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    public static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\n===== SEMUA JADWAL KULIAH =====");
        System.out.printf("%-25s %-20s %-10s %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-20s %-10s %-15s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    public static void tampilBerdasarkanHari(String[][] jadwal, int n) {
        System.out.print("\nMasukkan hari yang dicari: ");
        String cariHari = sc.nextLine();

        System.out.println("\nJadwal pada hari " + cariHari + ":");
        boolean ada = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(cariHari)) {
                System.out.println(jadwal[i][0] + " | " + jadwal[i][1] + " | " + jadwal[i][3]);
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Tidak ada jadwal di hari tersebut.");
        }
    }

    public static void tampilBerdasarkanMatkul(String[][] jadwal, int n) {
        System.out.print("\nMasukkan nama mata kuliah: ");
        String cariMK = sc.nextLine();

        boolean ada = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(cariMK)) {
                System.out.println("Ditemukan:");
                System.out.println("Ruang : " + jadwal[i][1]);
                System.out.println("Hari  : " + jadwal[i][2]);
                System.out.println("Jam   : " + jadwal[i][3]);
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = Integer.parseInt(sc.nextLine());

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);
        tampilSemua(jadwal, n);
        tampilBerdasarkanHari(jadwal, n);
        tampilBerdasarkanMatkul(jadwal, n);
    }
}
