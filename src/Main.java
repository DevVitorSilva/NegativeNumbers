import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int inputNumber = sc.nextInt();
        int[] arrayNumbers = new int[inputNumber];
        for (int i = 0; i < arrayNumbers.length; i++){
            System.out.print("Digite um número inteiro: ");
            arrayNumbers[i] = sc.nextInt();
        }
        System.out.println("Números negativos:");
        for (int i = 0; i < arrayNumbers.length; i++){
            if(arrayNumbers[i] < 0){
                System.out.println(arrayNumbers[i]);
            }
        }
        sc.close();
    }
}