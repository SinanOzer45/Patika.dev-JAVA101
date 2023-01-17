import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    int n,k;
        Scanner num= new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz : ");
        n =num.nextInt();
        System.out.print("Üsse gelecek sayı : ");
        k =num.nextInt();
        int total = 1;
    /////////////While döngüsü ile üs hesaplama : /////////////////
      /*  int i =1;
        while (i<=k){
            total *=n;
            i++;
        }System.out.println("Cevap : " + total);  */

    /////////////for döngüsü ile üs hesaplama : ///////////////////

        for (int i = 1; i <= k; i++){
            total *= n;
        }System.out.println("Cevap : " + total);
    }
}
