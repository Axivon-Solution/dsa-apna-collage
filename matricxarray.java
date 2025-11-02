public class matricxarray {
//
//    public static void spiral(int arr[][]) {
//        int startrow = 0, endrow = arr.length - 1;
//        int startcol = 0, endcol = arr[0].length - 1;
//
//        while (startrow <= endrow && startcol <= endcol) {
//            // Top row
//            for (int j = startcol; j <= endcol; j++) {
//                System.out.print(arr[startrow][j] + " ");
//            }
//            // Right column
//            for (int i = startrow + 1; i <= endrow; i++) {
//                System.out.print(arr[i][endcol] + " ");
//            }
//            // Bottom row (only if different row remains)
//            if (startrow < endrow) {
//                for (int j = endcol - 1; j >= startcol; j--) {
//                    System.out.print(arr[endrow][j] + " ");
//                }
//            }
//            // Left column (only if different col remains)
//            if (startcol < endcol) {
//                for (int i = endrow - 1; i > startrow; i--) {
//                    System.out.print(arr[i][startcol] + " ");
//                }
//            }
//
//            startrow++;
//            startcol++;
//            endrow--;
//            endcol--;
//        }
//    }
//
//    public static void piramid(int arr[][]) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (i == j) {
//                    sum = sum + arr[i][j];
//                } else if (i + j == arr.length - 1) {
//                    sum = sum + arr[i][j];
//                }
//            }
//        }
//        System.out.println(sum);
//    }
//
//    public static void piramid(int arr[][]) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i][i];
//
//            if (i != arr.length - i - 1) {
//                sum = sum + arr[i][arr.length - i - 1];
//            }
//        }
//        System.out.println("the sum = " + sum);
//    }
//
//
//    public static boolean sorted(int arr[][], int key) {
//        int row = 0, col = arr[0].length - 1;
//        while (row < arr.length && col >= 0) {
//            if (arr[row][col] == key) {
//                System.out.println(row + " " + col);
//                return true;
//            } else if (arr[row][col] < key) {
//                row++;
//            } else {
//                col--;
//            }
//        }
//        System.out.println("not avalaible");
//        return false;
//    }

    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
//        int key = 2;
//
//        spiral(arr);
//        piramid(arr);
//        System.out.println(sorted(arr, key));

    }
}