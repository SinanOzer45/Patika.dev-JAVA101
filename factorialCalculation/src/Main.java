import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);

      /*  System.out.print("Faktöriyel sayısını girin : ");
        int n = inp.nextInt();
        int total =1; */

         //////////////////////////////////for döngüsü ile faktörüyel hesabı :

           /* for (int i =1;i<=n; i++){
                total = total*i;
            } System.out.println(n + ". Faktöriyeli :" + total); */

        ////////////////////////////////// While döngüsü ile faktörüyel hesabı :

        /*  int i=1;
                while (i<=n){
                total = total*i;
                i++;
                System.out.println(" Faktöriyeli :" + total);
        } */

        ///////C(n,r) li kombinasyon hesaplaması : ////////////////

        System.out.print("N sayısını giriniz : ");
        int n =inp.nextInt();
        System.out.print("R sayısını giriniz : ");
        int r =inp.nextInt();

        int total =1; /// n faktöriyel toplamı
        int total1 =1;  //// r nin faktöriyel toplamı
        int total2 =1;  /// farkın faktöriyel toplamı
        int fark = (n - r);  //// n ve r nin farkı

        for (int i=1 ;i <= n; i++){
            total = total*i;
        } System.out.println("N sayısının faktöriyeli : "+total);

        for (int j =1; j<= r; j++){
            total1 = total1*j;
        } System.out.println("R sayısının faktöriyeli : "+total1);
        
        for (int k =1; k<= fark; k++){
            total2 = total2*k;
        } System.out.println("(N-R)nin faktöriyeli : "+total2);

        int carpım = total1*total2;
        int kombinasyon = total/carpım;
        System.out.println(n + " Sayısının " + r + "'li" + " Kombinasyonu = " + kombinasyon);
    }
}
