import java.util.Scanner;

public class not {
    public static void main(String[] args) {
     // not ortalama
       int mat, fizik, kimya, turkce, muzik ,tarih;

        Scanner inp = new Scanner(System.in);

        // kullanıcı değerleri
        System.out.print("matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("müzik Notunuz : ");
        muzik = inp.nextInt();

        System.out.print("tarih Notunuz : ");
        tarih = inp.nextInt();


        int toplam = (mat + fizik + kimya + turkce + muzik + tarih);
        double sonuc = toplam / 6;
        System.out.println("ortalamanız : " + sonuc);

        // ortalama sonucu durum bildirimi
        String cozum = sonuc>60 ? "SINIFI GEÇTİ" : "SINIFTA KALDI" ;
        System.out.println(cozum);





    }
}