import java.util.Scanner;

public class kdv {
    public static void main (String[] args) {


        Scanner input= new Scanner(System.in);
        double tutar=0, kdv=0;
        System.out.print("ücret tutarını giriniz:");
        tutar=input.nextDouble();
        kdv=tutar;
        if (tutar<=1000 && tutar>0)
        {
            kdv += (tutar*0.18);
            System.out.print("KDV Tutarı: "+tutar+" KDV %18: "+kdv);
        }
        else{
            kdv += (tutar*0.8);
            System.out.print("KDV Tutarı: "+tutar+" KDV %8: "+kdv);
        }





    }
}
