public class selectionsort {
    public static void main(String[] args) {
        int li[] = { 3, 4, 1, 5, 6, 7, 8, 2 };
        int len = li.length;
        int temp = 0;

        for (int i = 0; i < len - 1; i++) {
            int min = i;
            for (int j = i; j < len; j++) {
                if (li[min] > li[j]) {
                    min = j;
                }
            }
            temp = li[min];
            li[min] = li[i];
            li[i] = temp;
            System.out.println();
            for (int k : li) {

                System.out.print(k + " ");

            }
        }
        System.out.println("\n after sorting");
        for (int i : li) {
            System.out.print(i + " ");

        }
    }
}
