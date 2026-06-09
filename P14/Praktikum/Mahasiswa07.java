package P14.Praktikum;

public class Mahasiswa07 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa07() {
    }

    Mahasiswa07(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println("NIM: " + nim + " Nama: " + nama + " Kelas: " + kelas + " IPK: " + ipk);
    }
}