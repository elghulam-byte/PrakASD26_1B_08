package P9.Jobsheet9;

public class konversiDesimalKeBiner {
    public String konversiDesimalKeBiner(int nilai){
    StackKonversi08 stack = new StackKonversi08();
    while (nilai > 0){
        int sisa = nilai % 2;
        stack.push(sisa);
        nilai = nilai / 2;
    }

    String biner = new String();
    while (!stack.isEmpty()){
        biner += stack.pop();
    }
    return biner;
}
}
