package CM2;

public class DoubleLinkedListPesanan08 {
    NodePesanan08 head;
    NodePesanan08 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(Pesanan08 pesanan) {
        NodePesanan08 nodeBaru = new NodePesanan08(pesanan);
        if (isEmpty()) {
            head = tail = nodeBaru;
        } else {
            tail.next = nodeBaru;
            nodeBaru.prev = tail;
            tail = nodeBaru;
        }
    }

    public void sortingNamaPesanan() {
        if (isEmpty()) {
            return;
        }
        boolean tukar;
        do {
            tukar = false;
            NodePesanan08 current = head;
            while (current.next != null) {
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    Pesanan08 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    tukar = true;
                }
                current = current.next;
            }
        } while (tukar);
    }

    public void laporanPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan yang masuk");
            return;
        }
        sortingNamaPesanan();
        System.out.println("----------------------------------------------");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("----------------------------------------------");
        System.out.printf("%-15s %-20s %-15s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        NodePesanan08 current = head;
        int totalPendapatan = 0;
        while (current != null) {
            System.out.printf("%-15d %-20s %-15d\n", current.data.kodePesanan, current.data.namaPesanan, current.data.harga);
            totalPendapatan += current.data.harga;
            current = current.next;
        }
        System.out.println("----------------------------------------------");
        System.out.println("Total Pendapatan Restoran: Rp " + totalPendapatan);
        System.out.println("----------------------------------------------");
    }
}