import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        {

            Scanner hamit = new Scanner(System.in);
            int a =1 ;
            int b = 1;
            System.out.println("Kaçıncı sayıya kadar olacağını giriniz : ");
            int sonuc = hamit.nextInt();
            System.out.println("Sonuc ="+a);
            System.out.println("Sonuc ="+b);
            for(int i=1;i<sonuc;i++)

            {


                int c = a+b;
                System.out.println("Sonuc ="+ c);
                a = b;
                b= c;

            }



        }


    }
}