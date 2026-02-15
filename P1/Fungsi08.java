package P1;

public class Fungsi08 {

    static int hitungPendapatan(int aglonema, int keladi, int alocasia, int mawar) {
        return (aglonema * 75000)
             + (keladi * 50000)
             + (alocasia * 60000)
             + (mawar * 10000);
    }

    static String cekStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {

        int[][] data = {
            {10, 5, 15, 7},   
            {6, 11, 9, 12},   
            {2, 10, 10, 5},   
            {5, 7, 12, 9}     
        };

        String[] cabang = {
            "RoyalGarden 1",
            "RoyalGarden 2",
            "RoyalGarden 3",
            "RoyalGarden 4"
        };

        for (int i = 0; i < data.length; i++) {
            int total = hitungPendapatan(
                data[i][0], data[i][1], data[i][2], data[i][3]
            );

            String status = cekStatus(total);

            System.out.println(cabang[i]);
            System.out.println("Pendapatan: Rp" + total);
            System.out.println("Status: " + status);
            System.out.println();
        }
    }
}