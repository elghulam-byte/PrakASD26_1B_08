package P9.Tugas;

public class StackSurat08 {
    Surat08[] data;
    int size, top;

    public StackSurat08(int size){
        this.size = size;
        data = new Surat08[size];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size - 1;
    }

    public void push(Surat08 srt){
        if (!isFull()){
            top++;
            data[top] = srt;
        }else{
            System.out.println("Tumpukan surat sudah penuh");
        }
    }

    public void pop(){
        if(!isEmpty()){
            Surat08 srt = data[top];
            top--;
            System.out.println("Surat milik " + srt.namaMahasiswa + " telah diproses");
        }else{
            System.out.println("Stack kosong.");
        }
    }

    public void peek(){
        if(!isEmpty()){
            Surat08 srt = data[top];
            System.out.println("Surat Terakhir: " + srt.idSurat + " | " + srt.namaMahasiswa + " | " + srt.jenisIzin);
        }else{
            System.out.println("Stack kosong.");
        }
    }

    public void cariSurat(String nama){
        boolean ketemu = false;
        for(int i = top; i >= 0; i--){
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)){
                System.out.println("Surat ditemukan pada posisi tumpukan ke - " + (top - i + 1));
                ketemu = true;
                break;
            }
        }
        if (!ketemu) System.out.println("Surat dengan nama " + nama + " tidak ditemukan.");
    }
}