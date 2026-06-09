package P14.Tugas;

public class BinaryTree07 {
    Node07 root;

    public BinaryTree07() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    // ===================== METHOD EXISTING =====================

    public void add(Mahasiswa07 mahasiswa) {
        Node07 newNode = new Node07(null, mahasiswa, null);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node07 current = root;
            Node07 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node07 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node07 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node07 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node07 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node07 getSuccessor(Node07 delNode) {
        Node07 successorParent = delNode;
        Node07 successor = delNode;
        Node07 current = delNode.right;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.left;
        }
        if (successor != delNode.right) {
            successorParent.left = successor.right;
            successor.right = delNode.right;
        }
        return successor;
    }

    void delete(double ipk) {
        Node07 parent = null;
        Node07 current = root;
        boolean isLeftChild = false;

        while (current != null && current.mahasiswa.ipk != ipk) {
            parent = current;
            if (ipk < current.mahasiswa.ipk) {
                current = current.left;
                isLeftChild = true;
            } else {
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            return;
        }

        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else {
            Node07 successor = getSuccessor(current);
            System.out.println("Jika 2 anak, current = ");
            successor.mahasiswa.tampilInformasi();
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }

    // ===================== TUGAS 1: addRekursif() =====================

    public void addRekursif(Mahasiswa07 mahasiswa) {
        root = addRekursifHelper(root, mahasiswa);
    }

    private Node07 addRekursifHelper(Node07 current, Mahasiswa07 mahasiswa) {
        if (current == null) {
            return new Node07(null, mahasiswa, null);
        }
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursifHelper(current.left, mahasiswa);
        } else {
            current.right = addRekursifHelper(current.right, mahasiswa);
        }
        return current;
    }

    // ===================== TUGAS 2: cariMinIPK() dan cariMaxIPK() =====================

    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
        // Pada BST, nilai minimum selalu berada di node paling kiri
        Node07 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("Mahasiswa dengan IPK paling kecil:");
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
        // Pada BST, nilai maksimum selalu berada di node paling kanan
        Node07 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Mahasiswa dengan IPK paling besar:");
        current.mahasiswa.tampilInformasi();
    }

    // ===================== TUGAS 3: tampilMahasiswaIPKdiAtas() =====================

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("Mahasiswa dengan IPK di atas " + ipkBatas + ":");
        tampilMahasiswaIPKdiAtasHelper(root, ipkBatas);
    }

    private void tampilMahasiswaIPKdiAtasHelper(Node07 node, double ipkBatas) {
        if (node != null) {
            // Traversal InOrder agar tampil urut
            tampilMahasiswaIPKdiAtasHelper(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtasHelper(node.right, ipkBatas);
        }
    }
}