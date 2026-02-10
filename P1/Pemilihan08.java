package P1;

import java.util.Scanner;

public class Pemilihan08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = sc.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = sc.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double uts = sc.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double uas = sc.nextDouble();

        System.out.println("==============================");
        System.out.println("==============================");

        if (tugas < 0 || tugas > 100) {
            System.out.println("nilai tidak valid");
        } else if (kuis < 0 || kuis > 100) {
            System.out.println("nilai tidak valid");
        } else if (uts < 0 || uts > 100) {
            System.out.println("nilai tidak valid");
        } else if (uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
        } else {

            double nilaiAkhir = (0.20 * tugas) + (0.20 * kuis) + (0.30 * uts) + (0.30 * uas);
            String nilaiHuruf;
            String status;

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
                status = "LULUS";
            } else if (nilaiAkhir > 73) {
                nilaiHuruf = "B+";
                status = "LULUS";
            } else if (nilaiAkhir > 65) {
                nilaiHuruf = "B";
                status = "LULUS";
            } else if (nilaiAkhir > 60) {
                nilaiHuruf = "C+";
                status = "LULUS";
            } else if (nilaiAkhir > 50) {
                nilaiHuruf = "C";
                status = "LULUS";
            } else if (nilaiAkhir > 39) {
                nilaiHuruf = "D";
                status = "TIDAK LULUS";
            } else {
                nilaiHuruf = "E";
                status = "TIDAK LULUS";
            }

            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("Status      : " + status);
        }

        System.out.println("==============================");
        System.out.println("==============================");

        sc.close();
    }

}
