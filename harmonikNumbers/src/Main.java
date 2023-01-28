import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	             ////Harmonik Numbers Calculator Program///
        
        System.out.print("N sayısını girin : ");
        int n = input.nextInt();
        double result = 0.0;

        for (double i = 1; i <= n; i++){
            result += (1/i);
        }
        System.out.println("Harmonik Numbers result : " + result);
    }
}
