package P14.Praktikum;

public class BinaryTreeMain07 {
    public static void main(String[] args) {
        BinaryTree07 tree = new BinaryTree07();

        tree.add(new Mahasiswa07("244160121", "Ali", "A", 3.57));
        tree.add(new Mahasiswa07("244160185", "Candra", "C", 3.21));
        tree.add(new Mahasiswa07("244160220", "Dewi", "B", 3.54));
        tree.add(new Mahasiswa07("244160221", "Badar", "B", 3.85));

        System.out.println("Daftar semua mahasiswa (in order traversal):");
        tree.traverseInOrder(tree.root);
        System.out.println();

        System.out.println("Pencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        if (tree.find(3.54)) {
            System.out.println("Ditemukan");
        } else {
            System.out.println("Tidak ditemukan");
        }

        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        if (tree.find(3.22)) {
            System.out.println("Ditemukan");
        } else {
            System.out.println("Tidak ditemukan");
        }
        System.out.println();

        tree.add(new Mahasiswa07("244160205", "Ehsan", "D", 3.37));
        tree.add(new Mahasiswa07("244160170", "Fizi", "B", 3.46));
        tree.add(new Mahasiswa07("244160131", "Devi", "A", 3.72));

        System.out.println("Daftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("Inorder Traversal:");
        tree.traverseInOrder(tree.root);
        System.out.println();

        System.out.println("PreOrder Traversal:");
        tree.traversePreOrder(tree.root);
        System.out.println();

        System.out.println("PostOrder Traversal:");
        tree.traversePostOrder(tree.root);
        System.out.println();

        tree.delete(3.57);

        System.out.println("Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        tree.traverseInOrder(tree.root);
    }
}