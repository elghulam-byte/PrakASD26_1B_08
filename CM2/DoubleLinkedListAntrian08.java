package CM2;

public class DoubleLinkedListAntrian08 {
    NodePembeli08 head;
    NodePembeli08 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(Pembeli08 pembeli) {
        NodePembeli08 nodeBaru = new NodePembeli08(pembeli);
        if (isEmpty()) {
            head = tail = nodeBaru;
        } else {
            tail.next = nodeBaru;
            nodeBaru.prev = tail;
            tail = nodeBaru;
        }
    }

    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        System.out.println("----------------------------------------------");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("----------------------------------------------");
        System.out.printf("%-15s %-20s %-15s\n", "No Antrian", "Nama", "No HP");
        NodePembeli08 current = head;
        while (current != null) {
            System.out.printf("%-15d %-20s %-15s\n", current.data.noAntrian, current.data.namaPembeli, current.data.NoHp);
            current = current.next;
        }
    }

    public Pembeli08 hapusAntrianDilayani() {
        if (isEmpty()) {
            return null;
        }
        Pembeli08 pembeliDihapus = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return pembeliDihapus;
    }
}