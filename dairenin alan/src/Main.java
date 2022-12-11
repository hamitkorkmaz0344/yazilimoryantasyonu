import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        int yarıcap = scan.nextInt();

        System.out.println("Dairenin alanı = " + (Math.PI * yarıcap * yarıcap));
    }
}