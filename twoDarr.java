public class twoDarr {

    public static void main(String[] args) {

        int[][] array = { { 1, 2, 3 },
                { 2, 1, 1 } };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("| ");
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += array[i][j];
            }
            System.out.println(rowSum);
        }
        System.out.println("....");
        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 2; i++) {
                colSum += array[i][j];
            }
            System.out.print(colSum + " ");
        }

    }
}
