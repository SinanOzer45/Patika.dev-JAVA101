import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// Değikenler belirlenir
     double boy, indeks;
     int kilo;
     Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu(metre(m) cinsinden) Giriniz :");
        boy =inp.nextDouble();
        System.out.print("Lütfen kilonuzu(kilogram(kg) cinsinden) Giriniz :");
        kilo=inp.nextInt();

        indeks = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksi :" +indeks);
    }
}
