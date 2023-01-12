import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    int a, b, c;
	    Scanner num = new Scanner(System.in);

        System.out.print("1.Sayıyı girin :");
        a = num.nextInt();

        System.out.print("2.Sayıyı girin :");
        b = num.nextInt();

        System.out.print("3.Sayıyı girin :");
        c = num.nextInt();

        if (a<b && a<c){
           if (b<c){
            System.out.print("Sayıların büyükten küçüğe sıralanışı : c>b>a");
            }else{
            System.out.print("Sayıların büyükten küçüğe sıralanışı : b>c>a");
            }
        }else if ((b<a) && (b<c)){
            if (a<c){
                System.out.print("Sayıların büyükten küçüğe sıralanışı : c>a>b");
            }else{
                System.out.print("Sayıların büyükten küçüğe sıralanışı : a>c>b");
            }
        }else {
            if (a<b){
                System.out.print("Sayıların büyükten küçüğe sıralanışı : b>a>c");
            }else {
                System.out.print("Sayıların büyükten küçüğe sıralanışı : a>b>c");
            }
        }
    }
}
