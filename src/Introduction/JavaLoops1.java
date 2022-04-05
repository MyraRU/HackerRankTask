package Introduction;

import java.util.Scanner;

public class JavaLoops1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result;
        for (int i = 1; i <= 10; i++) {
            result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
    }
}
