package lab04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        System.out.print("Довжина А ");
        int[] a = new int[length(m)];
        System.out.print("Довжина В ");
        int[] b = new int[length(n)];
        Scanner m = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        System.out.print("Масив A ");
        vvod(a, m);
        System.out.print("Масив B ");
        vvod(b, n);
        printresult(a, b);
    }

    private static void printresult(int[] a, int[] b) {
        Tasks t = new Task1();
        t.Task(a, b);
        t = new Task2();
        t.Task(a, b);
        t = new Task34();
        t.Task(a, b);
    }

    private static int[] vvod(int[] a, Scanner c) {
        for (int i = 0; i < a.length; i++) {
            a[i] = c.nextInt();
        }
        return a;
    }
}

