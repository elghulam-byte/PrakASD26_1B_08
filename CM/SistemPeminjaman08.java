package CM;

import java.util.Scanner;

public class SistemPeminjaman08 {
    public static void main(String[] args) {
        Mahasiswa08[] daftarMhs = {
                new Mahasiswa08("22001", "Andi", "Teknik Informatika"),
                new Mahasiswa08("22002", "Budi", "Teknik Informatika"),
                new Mahasiswa08("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku08[] daftarBuku = {
                new Buku08("B001", "Algoritma", 2020),
                new Buku08("B002", "Basis Data", 2019),
                new Buku08("B003", "Pemrograman", 2021),
                new Buku08("B004", "Fisika", 2024)
        };

        Peminjaman08[] daftarPinjam = {
                new Peminjaman08(daftarMhs[0], daftarBuku[0], 7),
                new Peminjaman08(daftarMhs[1], daftarBuku[1], 3),
                new Peminjaman08(daftarMhs[2], daftarBuku[2], 10),
                new Peminjaman08(daftarMhs[2], daftarBuku[3], 6),
                new Peminjaman08(daftarMhs[0], daftarBuku[1], 4)
        };

        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa\n2. Tampilkan Buku\n3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda\n5. Cari Berdasarkan NIM\n0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa08 m : daftarMhs)
                        m.tampilMahasiswa();
                    break;
                case 2:
                    System.out.println("Daftar Buku:");
                    for (Buku08 b : daftarBuku)
                        b.tampilBuku();
                    break;
                case 3:
                    System.out.println("Data Peminjaman:");
                    for (Peminjaman08 p : daftarPinjam)
                        p.tampilPeminjaman();
                    break;
                case 4:
                    for (int i = 1; i < daftarPinjam.length; i++) {
                        Peminjaman08 key = daftarPinjam[i];
                        int j = i - 1;
                        while (j >= 0 && daftarPinjam[j].denda < key.denda) {
                            daftarPinjam[j + 1] = daftarPinjam[j];
                            j--;
                        }
                        daftarPinjam[j + 1] = key;
                    }
                    System.out.println("Setelah diurutkan (Denda terbesar):");
                    for (Peminjaman08 p : daftarPinjam)
                        p.tampilPeminjaman();
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cariNim = sc.next();
                    boolean found = false;
                    for (Peminjaman08 p : daftarPinjam) {
                        if (p.mhs.nim.equals(cariNim)) {
                            p.tampilPeminjaman();
                            found = true;
                        }
                    }
                    if (!found)
                        System.out.println("Data tidak ditemukan.");
                    break;
                case 6:
                    System.out.println("masukkan nim : ")
                    String cariNim = sc.next ;
            }
        } while (pilih != 0);
    }
}
