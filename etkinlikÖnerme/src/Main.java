import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// değişkenler belirlenir
        int heat;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sıcaklık değeri giriniz :");
        heat = inp.nextInt();
        //belirlenen koşullara göre kodlama yapılır
        if (heat<5){
               System.out.print("Kayak yapabilirsin.");
        }else if (heat>5 && heat<=15){
               System.out.println("Sinemaya gidebilirsin.");
            }if (heat>=15 && heat<=25){
               System.out.println("Pikniğe gidebilirsin");
            }if (heat>=25){
               System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}
