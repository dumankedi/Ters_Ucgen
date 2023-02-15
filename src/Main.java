import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi=input.nextInt();
        for(int i=1;i<=sayi;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int a=1;a<=(2*(sayi-i))-1;a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}