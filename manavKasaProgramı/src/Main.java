import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenleri yazalım
        double armut =2.14, elma=3.67, domates=1.11, muz=0.95, patlıcan=5,toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kilogram Değerini Giriniz :");
        armut *= input.nextDouble();
        System.out.print("Elma Kilogram Değerini Giriniz :");
        elma *= input.nextDouble();
        System.out.print("Domates Kilogram Değerini Giriniz :");
        domates *= input.nextDouble();
        System.out.print("Muz Kilogram Değerini Giriniz :");
        muz *= input.nextDouble();
        System.out.print("Patlıcan Kilogram Değerini Giriniz :");
        patlıcan *= input.nextDouble();

        toplam = (armut+elma+domates+muz+patlıcan);
        System.out.println("Toplam Tutar :" +toplam);
    }
}
