public class TwoDimensionalArrays {
    public static void main(String[] args) {

        int[][] array2D = new int[3][4];
        int[][] array2Dx = {{1,2},{3,4,5}};

        array2D[0][0] = 5;

        for (int x = 0; x < array2D.length; x++){
            for (int y = 0; y < array2D[x].length; y++)
                System.out.print(array2D[x][y] + " ");
            System.out.println();

        }

    }
}
