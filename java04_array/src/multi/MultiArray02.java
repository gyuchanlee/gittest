package multi;

/**
 * 2023-12-27
 */
public class MultiArray02 {

    public static void main(String[] args) {

        int[][] arr = new int[10][10];

//        int data = 1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = data;
//                data++;
//            }
//        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = (i + 1) + (j * 10);
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            int data = 100;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = data - i;
                data -= 10;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(String.format("%-4d", arr[i][j]));
            }
            System.out.println();
        }

    }
}
