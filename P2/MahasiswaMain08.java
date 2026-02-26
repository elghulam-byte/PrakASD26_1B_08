package P2;

public class MahasiswaMain08 {
    public static void main(String[] args) {

        Mahasiswa08 mhs1 = new Mahasiswa08();

        mhs1.nama = "Ghulam El Firdausy";
        mhs1.nim = "254107020203";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
    }
}
