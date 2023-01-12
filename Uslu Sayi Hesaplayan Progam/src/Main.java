import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c = 1, d = 1;
        System.out.print("Üssü alınacak sayı: ");
        a = input.nextInt();
        System.out.print("Üs olacak sayı: ");
        b = input.nextInt();
        for (c = 1; c <= b; c++) {
            d *= a;
        }
        System.out.println(d);
    }
}