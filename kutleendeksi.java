import java.util.Scanner;
public class kutleendeksi {
    public static void main(String[] args){
        double kg ,m,kutleendeksi;
        Scanner input=new Scanner(System.in);
        System.out.print("Boyunuzu m cinsinden giriniz: ");
        m=input.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        kg=input.nextDouble();
       kutleendeksi=kg/Math.pow(m,2);
       System.out.println("Vücut kütle endeksiniz: " +kutleendeksi);




    }

}
