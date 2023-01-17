import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        ////// girilen sayı değerine kadar olan 2 nin kuvvetlerini bulan program///////

       /* System.out.print("Sayı giriniz : ");
        n =input.nextInt();
        for (int i = 1; i <= n; i *= 2){
        System.out.println(i);
        }*/

        ////////girilen sayı değerine kadar olan 4 ve 5 in kuvvetlerini bulan program///////

        System.out.print("Sayı giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i *= 4){         //// 4 ün kuvvetleri :
            System.out.println("4 ün Kuvvetleri : "+i);
        }
        System.out.println("--------------------------");
        for (int j = 1; j <= n; j *= 5){         //// 5 in Kuvvetleri :
            System.out.println("5 in Kuvvetleri : "+j);
        }

    }
}