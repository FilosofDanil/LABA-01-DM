package lab04;

public class Task2 implements Tasks {
    @Override
    public void Task(int[] a, int[] b) {
        Perevirka(elementculc(b, a), elementculc(a, b), a, b);
    }

    public static int elementculc(int[] a, int[] b) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    s++;
                }
            }
        }
        return s;
    }

    public static void Perevirka(int s1, int s2, int[] a, int[] b) {
        if (s1 == a.length && s2 == b.length) {
            System.out.println("Ці множини рівні");
        }
        if (s1 == a.length && s2 != b.length) {
            System.out.println("Множина А підмножина В");
        }
        if (s2 == b.length && s1 != a.length) {
            System.out.println("Множина В підмножина А");
        }
        if (s1 != a.length && s2 != b.length) {
            System.out.println("Ні одна з множин не є підможиною іншої");
        }
        System.out.println();
    }
}
