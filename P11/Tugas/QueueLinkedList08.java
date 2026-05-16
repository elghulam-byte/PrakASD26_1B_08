package P11.Tugas;

public class QueueLinkedList08 {
    NodeAntrian08 front, rear;
    int size;

    public QueueLinkedList08() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(MahasiswaAntri08 data) {
        NodeAntrian08 newNode = new NodeAntrian08(data, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(data.nama + " berhasil mendaftar ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa dipanggil.");
            return;
        }
        System.out.println("Memanggil antrian: " + front.data.nama);
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan: " + front.data);
            System.out.println("Antrian terakhir: " + rear.data);
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        NodeAntrian08 temp = front;
        System.out.println("Daftar Antrian Saat Ini:");
        while (temp != null) {
            System.out.println("- " + temp.data);
            temp = temp.next;
        }
        System.out.println("Jumlah mahasiswa mengantre: " + size);
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }
}