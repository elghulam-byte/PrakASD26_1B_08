package P14.Tugas;

public class TugasMain07 {
    public static void main(String[] args) {

        System.out.println("========== TUGAS 1: addRekursif ==========");
        BinaryTree07 tree1 = new BinaryTree07();
        tree1.addRekursif(new Mahasiswa07("244160121", "Ali", "A", 3.57));
        tree1.addRekursif(new Mahasiswa07("244160185", "Candra", "C", 3.21));
        tree1.addRekursif(new Mahasiswa07("244160220", "Dewi", "B", 3.54));
        tree1.addRekursif(new Mahasiswa07("244160221", "Badar", "B", 3.85));
        tree1.addRekursif(new Mahasiswa07("244160205", "Ehsan", "D", 3.37));
        tree1.addRekursif(new Mahasiswa07("244160170", "Fizi", "B", 3.46));
        tree1.addRekursif(new Mahasiswa07("244160131", "Devi", "A", 3.72));

        System.out.println("InOrder setelah addRekursif:");
        tree1.traverseInOrder(tree1.root);
        System.out.println();

        System.out.println("========== TUGAS 2: cariMinIPK dan cariMaxIPK ==========");
        BinaryTree07 tree2 = new BinaryTree07();
        tree2.add(new Mahasiswa07("244160121", "Ali", "A", 3.57));
        tree2.add(new Mahasiswa07("244160185", "Candra", "C", 3.21));
        tree2.add(new Mahasiswa07("244160220", "Dewi", "B", 3.54));
        tree2.add(new Mahasiswa07("244160221", "Badar", "B", 3.85));
        tree2.add(new Mahasiswa07("244160205", "Ehsan", "D", 3.37));
        tree2.add(new Mahasiswa07("244160170", "Fizi", "B", 3.46));
        tree2.add(new Mahasiswa07("244160131", "Devi", "A", 3.72));

        tree2.cariMinIPK();
        System.out.println();
        tree2.cariMaxIPK();
        System.out.println();

        System.out.println("========== TUGAS 3: tampilMahasiswaIPKdiAtas ==========");
        tree2.tampilMahasiswaIPKdiAtas(3.50);
        System.out.println();

        System.out.println("========== TUGAS 4: BinaryTreeArray - add & traversePreOrder ==========");
        BinaryTreeArray07 bta = new BinaryTreeArray07();
        bta.add(new Mahasiswa07("244160121", "Ali", "A", 3.57));
        bta.add(new Mahasiswa07("244160185", "Candra", "C", 3.21));
        bta.add(new Mahasiswa07("244160220", "Dewi", "B", 3.54));
        bta.add(new Mahasiswa07("244160221", "Badar", "B", 3.85));
        bta.add(new Mahasiswa07("244160205", "Ehsan", "D", 3.37));
        bta.add(new Mahasiswa07("244160170", "Fizi", "B", 3.46));
        bta.add(new Mahasiswa07("244160131", "Devi", "A", 3.72));

        System.out.println("InOrder Traversal:");
        bta.traverseInOrder(0);
        System.out.println();

        System.out.println("PreOrder Traversal:");
        bta.traversePreOrder(0);
    }
}