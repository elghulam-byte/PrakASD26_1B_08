package P2;

public class DosenMain08 {
    public static void main(String[] args) {

        Dosen08 dsn1 = new Dosen08();
        dsn1.idDosen = "D001";
        dsn1.nama = "Budi Santoso";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Basis Data";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        dsn1.ubahKeahlian("AI");
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2025) + " tahun");
        dsn1.tampilInformasi();

        Dosen08 dsn2 = new Dosen08("D002", "Siti Aminah", true, 2018, "Jaringan");

        dsn2.tampilInformasi();
        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Keamanan Siber");
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2025) + " tahun");
        dsn2.tampilInformasi();
    }
}