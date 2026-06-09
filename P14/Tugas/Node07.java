package P14.Tugas;

public class Node07 {
    Mahasiswa07 mahasiswa;
    Node07 left;
    Node07 right;

    Node07(Node07 left, Mahasiswa07 mahasiswa, Node07 right) {
        this.left = left;
        this.mahasiswa = mahasiswa;
        this.right = right;
    }
}