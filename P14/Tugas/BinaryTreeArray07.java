package P14.Tugas;

public class BinaryTreeArray07 {
    Mahasiswa07[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray07() {
        this.dataMahasiswa = new Mahasiswa07[100];
        this.idxLast = -1;
    }

    void populateData(Mahasiswa07 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    public void add(Mahasiswa07 data) {
        if (idxLast == -1) {
            dataMahasiswa[0] = data;
            idxLast = 0;
        } else {
            int current = 0;
            while (true) {
                if (data.ipk < dataMahasiswa[current].ipk) {
                    int left = 2 * current + 1;
                    if (left >= dataMahasiswa.length) {
                        System.out.println("Array penuh, tidak bisa menambahkan data");
                        return;
                    }
                    if (dataMahasiswa[left] == null) {
                        dataMahasiswa[left] = data;
                        if (left > idxLast) idxLast = left;
                        return;
                    } else {
                        current = left;
                    }
                } else {
                    int right = 2 * current + 2;
                    if (right >= dataMahasiswa.length) {
                        System.out.println("Array penuh, tidak bisa menambahkan data");
                        return;
                    }
                    if (dataMahasiswa[right] == null) {
                        dataMahasiswa[right] = data;
                        if (right > idxLast) idxLast = right;
                        return;
                    } else {
                        current = right;
                    }
                }
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}