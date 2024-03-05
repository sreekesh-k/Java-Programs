public class sort {

    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 3, 2 };
        int i, j, temp;

        System.out.print("Array before sorting: ");
        for (i = 0; i < 5; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        // sorting
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Array after Bubble sort: ");
        for (i = 0; i < 5; i++)
            System.out.print(arr[i] + " ");

    }
}
