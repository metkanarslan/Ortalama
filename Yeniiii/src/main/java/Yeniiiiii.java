import java.util.Scanner;

public class Yeniiiiii {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,toplam=0,x=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz : ");
        mat=inp.nextInt();
        if (mat>=0&&mat<=100){
            toplam+=mat;
            x=x+1;
        }
        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik=inp.nextInt();
        if (fizik>=0&&fizik<=100){
            toplam+=fizik;
            x=x+1;
        }
        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce=inp.nextInt();
        if (turkce>=0&&turkce<=100){
            toplam+=turkce;
            x=x+1;
        }
        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya=inp.nextInt();
        if (kimya>=0&&kimya<=100){
            toplam+=kimya;
            x=x+1;
        }
        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik=inp.nextInt();
        if (muzik>=0&&muzik<=100){
            toplam+=muzik;
            x=x+1;
        }
        double average = toplam/x;
        if (average<=55){
            System.out.println("Sınıfta Kalmıştır.");
        }else{
            System.out.println("Sınıftan Geçmiştir.");
        }
        System.out.println("Ortalamanız :" + average);

    }

}
