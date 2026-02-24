package P2;

public class Mahasiswa08 {

    String nim;
    String nama;
    String prodi;
    double ipk;

    public Mahasiswa08() {

    }

    public Mahasiswa08(String nim, String nama, String prodi, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.ipk = ipk;
    }

    public void tampilData() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("IPK   : " + ipk);
    }

    public void ubahIPK(double ipkBaru) {
        this.ipk = ipkBaru;
    }
}