package lesson2;

public class HomeWorkAppTwo {

    public static void main(String[] args) {
        method4checkValue(10, 2);
        method4printValue(4);
        method4returnValue(-5);
        method4printLine(5, "Start");
        method4checkYear(1996);
    }

    private static boolean method4checkYear(int i) {
        if ((i % 400) == 0) {
            return true;
        } else if ((i % 100) == 0) {
            return false;
        } else if ((i % 4) == 0) {
            return true;
        }
        return false;
    }

    private static void method4printLine(int i, String start) {
        for (int i1 = 0; i1 < i; i1++) {
            System.out.println(start);
        }
    }

    private static boolean method4returnValue(int i) {
        if (i >= 0) {
            return true;
        }
        return false;
    }
    private static void method4printValue(int i) {
        if (i >= 0) {
            System.out.println("this value +");
        }
        else {
            System.out.println("this value -");
        }
    }

    private static boolean method4checkValue(int i, int b) {
        if ((i + b) <= 10 && (i + b) >= 20) {
            return true;
        }
        return false;
    }
}
