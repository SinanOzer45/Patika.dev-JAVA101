import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double sayı, toplam=0, sayac=0, sonuc;
        boolean sayi;
        Scanner scan = new Scanner(System.in);

       System.out.print("Sayı değerini giriniz ; ");
       sayı = scan.nextDouble();

       ///for döngüsü ile 2ye bölünen sayılar////

        for (int i=1;i<=sayı;i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        ///// 3 ve 4 e bölünen sayıların toplanıp ortalamasının alınması///

      /*  for (int i=1; i<=sayı; i++){
            if (i%3 == 0 && i%4 == 0){
                toplam += + i;
                sayac++;
                System.out.println("Bölünen sayı : " + i);
            }
        } sonuc =(toplam/sayac);
        System.out.println("Ortalama : "+ sonuc);*/
    }
}
