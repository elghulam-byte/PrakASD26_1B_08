package P5.BruteForceDivideConquer;

public class Pangkat08 {
    int nilai, pangkat;

    Pangkat08(int n, int p) {
        nilai = n;
        pangkat = p;
    }

    int PangkatBF(int a, int n) {
        int hasil = 1;
        for(int i=1; i<n; i++) {
            hasil = hasil * a;
        } return hasil;
    }

    int PangkatDC(int a, int n) {
        if (n==1) {
            return a;
        } else {
            if(n%2==1){
                return (PangkatDC(a, n/2) * PangkatDC(a, n/2) * a);
            }else{
                return (PangkatDC(a, n/2) * PangkatDC(a, n/2));
            }
        }
    }
}
