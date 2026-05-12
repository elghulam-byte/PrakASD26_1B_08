package P10.P2Jobsheet10;

import java.util.Scanner;

public class LayananAkademikSIAKAD08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan08 antri = new AntrianLayanan08(10); 
        int pilih;

        do {
            System.out.println("\n--- Menu Antrean KRS DPA ---");
            System.out.println("1. Tambah Antrean");
            System.out.println("2. Panggil Antrean (Proses 2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrean");
            System.out.println("4. Tampilkan 2 Antrean Terdepan");
            System.out.println("5. Tampilkan Antrean Terakhir");
            System.out.println("6. Cetak Status & Jumlah Selesai KRS");
            System.out.println("7. Kosongkan Antrean");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Prodi: "); String prodi = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    antri.tambahAntrian(new Mahasiswa08(nim, nama, prodi, kelas));
                    break;
                case 2:
                    antri.panggilAntreanKRS();
                    break;
                case 3:
                    antri.tampilkanSemua();
                    break;
                case 4:
                    antri.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antri.lihatAkhir();
                    break;
                case 6:
                    antri.cetakStatus();
                    break;
                case 7:
                    antri.clear();
                    break;
            }
        } while (pilih != 0);
        sc.close();
    }
}