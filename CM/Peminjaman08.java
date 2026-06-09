package CM;

import java.util.Scanner;

public class Peminjaman08 {
    Mahasiswa08 mhs;
    Buku08 buku;
    int lamaPinjam, denda, terlambat;
    int batasPinjam = 30;

    Peminjaman08(Mahasiswa08 mhs, Buku08 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilPeminjaman() {
        System.out.println(mhs.nama + " " + buku.judul + " | Lama: " + lamaPinjam + " | Terlambat: " + terlambat + " | Denda: " + denda);
        
    }
    }
