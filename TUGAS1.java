
package TUGAS1;

import java.util.Scanner;
public class TUGAS1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan dalam deret Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Deret Fibonacci dengan " + n + " anggota:");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    
    }
    
}
