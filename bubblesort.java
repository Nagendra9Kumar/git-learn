
public class test {
    public static void main(String[] args) {
        int[] li = { 1, 2, 4, 7, 5, 9, 3 };
        for (int i : li) {
            System.out.print(i + ",");
        }
        int j = 0;
        while (j < li.length) {
            for (int i = 1; i < li.length - j; i++) {
                if (li[i - 1] > li[i]) {
                    int temp = li[i - 1];
                    li[i - 1] = li[i];
                    li[i] = temp;
                }
            }
            j++;
        }
        // System.out.println(li);
        System.out.println();
        System.out.println("After sorting");
        for (int i : li) {
            System.out.print(i + ",");
        }

    }
}