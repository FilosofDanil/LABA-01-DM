package lab04;

public class Task34 implements Tasks {
    private static final int[] U = {1, 2, 3, 4, 5, 6, 7, 8};
    private static int[] c1  = new int[8];

    @Override
    public void Task(int[] a, int[] b) {
        int[] a1 = new int[8], b1 = new int[8];
        a1 = tobit(a);
        b1 = tobit(b);
        vivid(a1);
        vivid(b1);
        not(a1);
        not(b1);
        and(a1,b1);
        or(a1,b1);
        xor(a1,b1);
    }

    private static void or(int[] b1, int[] a1) {
        int[]bit=new int[8];
        System.out.print("OR ");
        for (int i = 0; i < U.length; i++) {
            if (b1[i] == 1 || a1[i] == 1) {
                c1[i] = i + 1;
            }
            bit[i]=c1[i];
        }
        vivid(tobit(bit));
        result(c1);
    }

    private static void not( int[] a1) {
        int[]bit=new int[8];
        System.out.print("NOT ");
        for (int i = 0; i < U.length; i++) {
            if ( a1[i] != 1) {
                c1[i] = i + 1;
            }
            bit[i]=c1[i];
        }
        vivid(tobit(bit));
        result(c1);
    }

    private static void xor(int[] b1, int[] a1) {
        int[]bit=new int[8];
        System.out.print("XOR ");
        for (int i = 0; i < U.length; i++) {
            if (b1[i] == 1 ^ a1[i] == 1) {
                c1[i] = i + 1;
            }
            bit[i]=c1[i];
        }
        vivid(tobit(bit));
        result(c1);
    }

    private static void and(int[] b1, int[] a1) {
        int[]bit=new int[8];
        System.out.print("AND ");
        for (int i = 0; i < U.length; i++) {
            if (b1[i] == 1 && a1[i] == 1) {
                c1[i] = i + 1;
            }
            bit[i]=c1[i];
        }
        vivid(tobit(bit));
     result(c1);
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

    private static void vivid(int[] a1) {
        for (int e : a1) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    private static int[] tobit(int[] a) {
        int[] a1 = new int[8];
        for (int i = 0; i < U.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (U[i] == a[j]) {
                    a1[i] = 1;
                }
            }
        }
        return a1;
    }
}
