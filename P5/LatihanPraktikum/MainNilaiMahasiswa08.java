package P5.LatihanPraktikum;

public class MainNilaiMahasiswa08 {
    public static void main(String[] args) {

        NilaiMahasiswa08[] data = {
            new NilaiMahasiswa08("Ahmad", 220101001, 2022, 78, 82),
            new NilaiMahasiswa08("Budi", 220101002, 2022, 85, 88),
            new NilaiMahasiswa08("Cindy", 220101003, 2021, 90, 87),
            new NilaiMahasiswa08("Dian", 220101004, 2021, 76, 79),
            new NilaiMahasiswa08("Eko", 220101005, 2023, 92, 95),
            new NilaiMahasiswa08("Fajar", 220101006, 2020, 88, 85),
            new NilaiMahasiswa08("Gina", 220101007, 2023, 80, 83),
            new NilaiMahasiswa08("Hadi", 220101008, 2020, 82, 84)
        };

        int max = NilaiMahasiswa08.maxUTS(data, 0, data.length - 1);
        int min = NilaiMahasiswa08.minUTS(data, 0, data.length - 1);
        double rata = NilaiMahasiswa08.rataUAS(data);

        System.out.println("Nilai UTS Tertinggi : " + max);
        System.out.println("Nilai UTS Terendah  : " + min);
        System.out.println("Rata-rata UAS       : " + rata);
    }
}
