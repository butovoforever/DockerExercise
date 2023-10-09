import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner in = new Scanner(System.in);
        do {
            num1 = in.nextInt();
            num2 = in.nextInt();
            System.out.println(num1 + num2);
        } while (num1 + num2 != 0);
        in.close();
    }
}