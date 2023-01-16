import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int n;
	int total=0;
	Scanner input = new Scanner(System.in);
	//////girilen tek sayı değerlerinin toplanması////
	/*do {
        System.out.println("Sayı Giriniz : ");
	    n = input.nextInt();
	    if (n % 2 == 1){
	        total+= n;
        }
    }while (n>0);
            System.out.println("Toplam : "+total);  */

		//////2 ve 4 ün katları olan sayıları toplayıp, tek sayı girildiğinde duran program/////
		do {
			System.out.println("Sayı Giriniz : ");
			n = input.nextInt();
			if (n % 2 == 0 && n % 4 == 0){
				total+= n;
			}
		}while (n % 2 == 0);
		System.out.println("Toplam : "+ total);
    }
}
