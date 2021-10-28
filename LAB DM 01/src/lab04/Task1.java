package lab04;

import java.util.Arrays;

public class Task1 implements Tasks {
    private static final int[] U = {1, 2, 3, 4, 5, 6, 7, 8};

    @Override
    public void Task(int[] a, int[] b) {
        System.out.print("Об'єднання ");
        result(obed(a, b));
        System.out.print("Перетин ");
        result(peret(a, b));
        System.out.print("Різниця a-b ");
        result(rizn(a, b));
        System.out.print("Різниця b-a ");
        result(rizn(b, a));
        System.out.print("Симетрична різниця ");
        result(simrizn(a, b));
        System.out.print("Декартів добуток ");
        dekprint(dekart(a, b));
        System.out.print("Доповнення A ");
        result(dopovnenya(a));
        System.out.print("Доповнення B ");
        result(dopovnenya(b));

    }

    private static int[] obed(int[] a, int[] b) {
        int[] c = new int[8];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i + 1) {
                    c[i] = a[j];
                }
            }
            for (int j = 0; j < b.length; j++) {
                if (b[j] == i + 1) {
                    c[i] = b[j];
                }
            }
        }
        return c;
    }

    private static int[] peret(int[] a, int[] b) {
        int[] c = new int[8];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[j] = a[i];
                }
            }
        }

        return c;
    }

    private static int[] rizn(int[] a, int[] b) {
        int[] c = new int[8];
        int r = 0;
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[i] = 0;
                }
            }
        }
        return c;
    }

    private static int[] simrizn(int[] a, int[] b) {
        int[] c = new int[8];
        int[] c1 = rizn(a, b);
        int[] c2 = rizn(b, a);
        c = obed(c1, c2);
        return c;
    }

    private static int[] dopovnenya(int[] a) {
        int[] c = new int[8];
        c = rizn(U, a);
        return c;
    }

    private static int[][] dekart(int[] a, int[] b) {
        int[][] c1 = new int[a.length * b.length][2];
        int r = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c1[j + r][0] = a[i];
                c1[j + r][1] = b[j];
            }
            r += 6;
        }
        return c1;
    }

    private static void result(int[] c) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] != 0) {
                System.out.print(c[i] + " ");
            }
            c[i] = 0;
        }
        System.out.println();
    }

    private static void dekprint(int[][] c) {
        for (int i = 0; i < c.length; i++) {
            System.out.print("{ ");
            for (int e : c[i]) {
                System.out.print(e + " ");
            }
            System.out.print("}");
            if (i % 9 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

}
