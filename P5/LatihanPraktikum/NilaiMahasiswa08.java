package P5.LatihanPraktikum;

public class NilaiMahasiswa08 {
    String nama;
    int nim, tahunMasuk;
    int uts, uas;

    NilaiMahasiswa08(String nama, int nim, int tahunMasuk, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.uts = uts;
        this.uas = uas;
    }

    static int maxUTS(NilaiMahasiswa08 arr[], int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }
        int mid = (l + r) / 2;
        int lmax = maxUTS(arr, l, mid);
        int rmax = maxUTS(arr, mid + 1, r);
        return Math.max(lmax, rmax);
    }

    static int minUTS(NilaiMahasiswa08 arr[], int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }
        int mid = (l + r) / 2;
        int lmin = minUTS(arr, l, mid);
        int rmin = minUTS(arr, mid + 1, r);
        return Math.min(lmin, rmin);
    }

    static double rataUAS(NilaiMahasiswa08 arr[]) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].uas;
        }
        return total / arr.length;
    }
}