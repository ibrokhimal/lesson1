public class HomeWorkApp {

    public static void main(String[] args) {
        checkSumSing(1,-1);
        printThreeWords();
        printColor(1);
        compareNumbers(-1,2);
    }

    private static void compareNumbers(int i, int i1) {
        int a = i;
        int b = i1;

        if (a >= b) System.out.println("a >= b");
        else System.out.println("a > b");
    }

    private static void printColor(int i) {
        if (i <= 0)
            System.out.println("Red");
        else if (i <= 100)
            System.out.println("Yellow");
        else
            System.out.println("Green");
    }

    private static void checkSumSing(int a, int b) {
        if ((a + b) >= 0)
            System.out.println("Summa polojitelno");
        else
            System.out.println("Summa otritsatelno");
    }
    private static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}
