package DeclareClassAndObject;

import java.util.Scanner;

class PhanSo{
    private long tu;
    private long mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    @Override
    public String toString(){
        return this.tu / gcd(this.tu, this.mau) + "/" + this.mau / gcd(this.tu, this.mau);
    }
}

public class J04003 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long tu = sc.nextLong();
            long mau = sc.nextLong();
            PhanSo p = new PhanSo(tu, mau);
            System.out.println(p);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
