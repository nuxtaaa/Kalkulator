import java.util.Scanner;
public class calculator {
    
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int cal;
        int quotient;
        int remainder;
        System.out.println("Masukkan Angkanya wir:- ");
        Scanner r=new Scanner(System.in);
        System.out.println("Masukkan Angka pertama:- ");
        n1=r.nextInt();
        System.out.println("Masukkan Angka Kedua:- ");
        n2=r.nextInt();
        System.out.println("Pilih Metode:- ");
        System.out.println("1 - Tambah");
        System.out.println("2 - Kurang");
        System.out.println("3 - Kali");
        System.out.println("4 - Bagi");
        System.out.println("Pilih Angka Metode");
        Scanner s=new Scanner(System.in);
        n3=s .nextInt();

        if (n3==1) {
            cal=n1+n2;
            System.out.println("jeh napa hasilnya:- "+cal);
        }
        else if (n3==2) {
            cal=n1-n2;
            System.out.println("Jeh napa hasilnya:- "+cal);
        }
        else if (n3==3) {
            cal=n1*n2;
            System.out.println("Jeh napa hasilnya:- "+cal);
        }
        else if (n3==4) {
            quotient=n1/n2;
            remainder=n1%n2;
            System.out.println("Jeh napa hasilnya:- "+quotient);
            System.out.println("Jeh napa sisa:- "+remainder);

        }
    }
}
