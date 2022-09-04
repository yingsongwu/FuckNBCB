import java.util.Random;

public class SparseArray {

    public static final int NUM_ARRAY = 30;

    public static void randomArray(int[][] array){
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            int a = r.nextInt(array.length);
            int b = r.nextInt(array.length);
            array[a][b] = r.nextInt(100);
        }
    }

    public static void printTwoArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {
                System.out.print(array[i][i1]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    private static int[][] changeArrayToSparseArray(int[][] origArray) {
        int count = 1;
        for (int i = 0; i < origArray.length; i++) {
            for (int i1 = 0; i1 < origArray[i].length; i1++) {
                if (origArray[i][i1] != 0){
                    count++;
                }
            }
        }

        int [][]  sparseArray = new int[count][3];

        sparseArray[0][0] = origArray[0].length;
        sparseArray[0][1] = origArray.length;
        int index = 1;

        for (int i = 0; i < origArray.length; i++) {
            for (int i1 = 0; i1 < origArray[i].length; i1++) {
                if (origArray[i][i1] != 0){
                    sparseArray[index][0] = i;
                    sparseArray[index][1] = i1;
                    sparseArray[index][2] = origArray[i][i1];
                    index ++;
                }
            }
        }

        printTwoArray(sparseArray);

        return sparseArray;
    }

    private static void changeSparseArrayToArray(int[][] sparseArray) {
        int [][] origArray = new int[sparseArray[0][0]][sparseArray[0][1]];
        for (int i = 1; i < sparseArray.length; i++) {
            origArray[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        printTwoArray(origArray);
    }


    public static void main(String[] args) {
        int [][] origArray = new int [NUM_ARRAY][NUM_ARRAY];
        randomArray(origArray);
        printTwoArray(origArray);
        int [][] sparseArray = changeArrayToSparseArray(origArray);
        changeSparseArrayToArray(sparseArray);
    }

}
