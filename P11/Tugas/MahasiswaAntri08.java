package P11.Tugas;

public class MahasiswaAntri08 {
    String nim, nama;

    public MahasiswaAntri08(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama;
    }
}