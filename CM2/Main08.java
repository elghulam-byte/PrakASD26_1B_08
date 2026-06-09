package CM2;

import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListAntrian08 antrian = new DoubleLinkedListAntrian08();
        DoubleLinkedListPesanan08 daftarPesanan = new DoubleLinkedListPesanan08();
        int pilih;
        int noAntrian = 1;

        antrian.tambahAntrian(new Pembeli08(noAntrian++, "Ainra", "08224500000"));
        antrian.tambahAntrian(new Pembeli08(noAntrian++, "Danra", "08224511111"));
        antrian.tambahAntrian(new Pembeli08(noAntrian++, "Sanri", "08224522222"));
        antrian.tambahAntrian(new Pembeli08(noAntrian++, "El", "08223454334"));
        antrian.tambahAntrian(new Pembeli08(noAntrian++, "Firdausy", "08345676547"));
        antrian.tambahAntrian(new Pembeli08(noAntrian++, "Ghulam", "08542735677"));
        do {
            System.out.println("\n=================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("=================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Edit Antrian Pesanan");
            System.out.println("6. Cari Data Pembeli");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = sc.nextLine();
                    Pembeli08 pembeliBaru = new Pembeli08(noAntrian, nama, noHp);
                    antrian.tambahAntrian(pembeliBaru);
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + noAntrian);
                    noAntrian++;
                    break;
                case 2:
                    antrian.cetakAntrian();
                    break;
                case 3:
                    Pembeli08 pembeliDilayani = antrian.hapusAntrianDilayani();
                    if (pembeliDilayani == null) {
                        System.out.println("Antrian masih kosong");
                    } else {
                        System.out.print("Kode Pesanan : ");
                        int kodePesanan = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();
                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        Pesanan08 pesananBaru = new Pesanan08(kodePesanan, namaPesanan, harga);
                        daftarPesanan.tambahPesanan(pesananBaru);
                        System.out.println(pembeliDilayani.namaPembeli + " telah memesan " + namaPesanan);
                    }
                    break;
                case 4:
                    daftarPesanan.laporanPesanan();
                    break;
                case 5:
                    System.out.print("Masukkan nama pembeli :");
                    String nama1 = sc.nextLine();
                    System.out.print("Masukkan nomor HP");
                    String nohp = sc.nextLine();
                    break;
                case 6:
                    System.out.print("Masukkan no hp :");
                    String noHP = sc.nextLine();
                    boolean ditemukan = false;
                    if (noHP.equalsIgnoreCase())
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }
        } while (pilih != 0);

        sc.close();
    }
}