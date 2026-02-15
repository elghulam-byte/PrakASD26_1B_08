package P1;

import java.util.Scanner;

public class Fungsi08 {

    static int hitungPendapatan(int aglonema, int keladi, int alocasia, int mawar) {
        return (aglonema * 75000)
                + (keladi * 50000)
                + (alocasia * 60000)
                + (mawar * 10000);
    }

    static String cekStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            System.out.println("=== RoyalGarden " + i + " ===");

            System.out.print("Jumlah Aglonema: ");
            int ag = input.nextInt();

            System.out.print("Jumlah Keladi: ");
            int ke = input.nextInt();

            System.out.print("Jumlah Alocasia: ");
            int al = input.nextInt();

            System.out.print("Jumlah Mawar: ");
            int ma = input.nextInt();

            int total = hitungPendapatan(ag, ke, al, ma);
            String status = cekStatus(total);

            System.out.println("Pendapatan: Rp" + total);
            System.out.println("Status: " + status);
            System.out.println();
        }
    }
}